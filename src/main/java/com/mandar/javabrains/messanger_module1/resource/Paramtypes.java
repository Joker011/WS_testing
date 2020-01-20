package com.mandar.javabrains.messanger_module1.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("param")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class Paramtypes {
	
	
	@GET 
	@Path("test")
	public String getMessage(@MatrixParam("param") String msg,
			                 @HeaderParam("customheader") String head,
			                 @CookieParam("name") String cokienae)
	{
		
		return "matrix value="+msg+" and custom header value="+head+" and cookie="+cokienae;
	}

}
