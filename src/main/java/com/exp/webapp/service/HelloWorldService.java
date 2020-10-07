package com.exp.webapp.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/helloworld")
public class HelloWorldService {

	@GET
	@Path("hello")
	public String sayHello() {
		return "Hello World!!!";
	}
}
