package com.jspiders.servlet;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//{ http://localhost:8080/servlet/my-servlet-7 } :- This URL Run The This Code in Chrome and check the output in Enclipse Console.
@WebServlet(value = "/my-servlet-7")
public class MyServlet7 implements Servlet {

	static {
		System.out.println("Class loading");
	}

	{
		System.out.println("Instanciation");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	@Override
	public String getServletInfo() {
		return null;
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Initialization");
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service");
	}

	@Override
	public void destroy() {
		System.out.println("Destruction");
	}

}