package net.jasonshepherd;

import java.io.PrintWriter;

import javax.servlet.AsyncContext;
import javax.servlet.ServletRequest;

import net.jasonshepherd.util.ParamParser;
import net.jasonshepherd.util.WebServiceCaller;
import net.jasonshepherd.ws.client.AustralianPostCode;
import net.jasonshepherd.ws.client.AustralianPostCodeSoap;

public class AsyncService implements Runnable {

	private AsyncContext cntxt;

	public AsyncService(AsyncContext cntxt) {
		this.cntxt = cntxt;
	}

	@Override
	public void run() {
		try {
			PrintWriter writer = cntxt.getResponse().getWriter();
			String postCodeParam = new ParamParser().getPostCodeParam(cntxt.getRequest(), "postCode");
			String location = new WebServiceCaller().callWebService(postCodeParam);
			writer.append(location);
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			cntxt.complete();
		}

	}

}
