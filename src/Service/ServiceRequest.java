package Service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public class ServiceRequest {
	public boolean validateParameters(HttpServletRequest httpServletRequest) {
		for (Map.Entry<String, String[]> entry : httpServletRequest.getParameterMap().entrySet()) {
			if(entry == null || entry.getValue().length == 0 || entry.getValue()[0] == "")
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean hasParameters(HttpServletRequest httpServletRequest)
	{
		if(httpServletRequest.getParameterNames().hasMoreElements())
		{
			return true;
		}
		return false;
	}
}
