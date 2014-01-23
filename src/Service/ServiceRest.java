package Service;

import javax.ws.rs.core.UriBuilder;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.ClientResponse.Status;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class ServiceRest {
	private String hostIdentity = "http://8.21.28.222";
	
	public String getTokenByUserCredentials(String username, String password)
	{
		//Request
		JsonObject authJson = new JsonObject();
		
		JsonObject authJson2 = new JsonObject();
		authJson2.addProperty("tenantName", "");
		
		JsonObject authJson3 = new JsonObject();
		authJson3.addProperty("username", username);
		authJson3.addProperty("password", password);
		
		authJson2.add("passwordCredentials", authJson3);
		
		authJson.add("auth", authJson2);
		
		//Response
		ClientResponse clientResponse = rest(METHOD.POST, authJson.toString(), hostIdentity + ":5000/v2.0/tokens", "");
		if(clientResponse.getClientResponseStatus() == Status.UNAUTHORIZED)
		{
			return null;
		}
		else
		{
			JsonObject responseJSON = new Gson().fromJson(clientResponse.getEntity(String.class), JsonObject.class);
			return (responseJSON.get("access").getAsJsonObject().get("token").getAsJsonObject().get("id").getAsString());
		}
	}
	
	public JsonObject getUserInformationById(String id, String token)
	{
		//Request
		ClientResponse clientResponse = rest(METHOD.GET, "", hostIdentity + "v2.0/users/" + id, token);
		
		//Response
		if(clientResponse.getClientResponseStatus() == Status.OK)
		{
			return new Gson().fromJson(clientResponse.getEntity(String.class), JsonObject.class);
		}
		return null;
	}
	
	public ClientResponse rest(METHOD method, String input, String url, String token)
	{
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource webResource = client.resource(UriBuilder.fromUri(url).build());
		if(token != "")
		{
			webResource.header("X-Auth-Token", token);
		}
		if(method == METHOD.GET)
		{
			return webResource.type("application/json")
					.get(ClientResponse.class);
		}
		else
		{
			return webResource.type("application/json")
					.post(ClientResponse.class, input);
		}
	}
	
	private enum METHOD
	{
		GET,
		POST
	}
}
