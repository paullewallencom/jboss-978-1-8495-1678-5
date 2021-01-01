package net.jasonshepherd.util;

import net.jasonshepherd.ws.client.AustralianPostCode;
import net.jasonshepherd.ws.client.AustralianPostCodeSoap;

public class WebServiceCaller {
	public String callWebService(String postCode) {
		AustralianPostCode australianPostCode = new AustralianPostCode();
		AustralianPostCodeSoap port = australianPostCode.getPort(AustralianPostCodeSoap.class);
		String location = port.getAustralianLocationByPostCode(postCode);
		return location;
	}
}
