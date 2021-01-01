package net.jasonshepherd;

import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.jasonshepherd.util.ParamParser;
import net.jasonshepherd.util.WebServiceCaller;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/sync")
public class SyncServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {

		try {
			PrintWriter writer = res.getWriter();
			String postCodeParam = new ParamParser().getPostCodeParam(req, "postCode");
			String location = new WebServiceCaller().callWebService(postCodeParam);
			writer.append(location);
			writer.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new IllegalStateException(e);
		}
	}
}
