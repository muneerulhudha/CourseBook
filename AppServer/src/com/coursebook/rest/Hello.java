package com.coursebook.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("hello")
public class Hello {

	@GET
	@Produces("text/html")
	public String getHello(){
		return "It works";
	}
	
}
