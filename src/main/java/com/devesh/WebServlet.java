package com.devesh;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class WebServlet implements Servlet{
	ServletConfig config=null;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config=config;
		System.out.println("Servlet configured");
	}
	
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return config;
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is a servlet";
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
