package com.mandar.javabrains.messanger_module1.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("message")
public class message1 {
	
	 @GET
	 @Produces(MediaType.TEXT_PLAIN)
	public String getM()
	{
		return "its DOne";
	}

}
