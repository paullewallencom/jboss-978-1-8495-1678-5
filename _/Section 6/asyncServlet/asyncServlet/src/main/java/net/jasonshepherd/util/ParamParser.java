package net.jasonshepherd.util;

import javax.servlet.ServletRequest;

public class ParamParser {
	public String getPostCodeParam(ServletRequest request, String paramName) {
		String[] postCodeParams = request.getParameterValues(paramName);
		if(postCodeParams.length < 1)
			throw new IllegalArgumentException(paramName + " parameter not set");
		return postCodeParams[0];
	}
}
