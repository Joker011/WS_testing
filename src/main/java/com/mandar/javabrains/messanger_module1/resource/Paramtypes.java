package com.mandar.javabrains.messanger_module1.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.CookieParam;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mandar.javabrains.messanger_module1.paramBeans.BeanFactoryParam;

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
	
	@GET
	@Path("beantest")
	public String getbeanparam(@BeanParam BeanFactoryParam bfp)
	{
		int age=bfp.getAge();
		String name=bfp.getName();
		return "test="+age+"name="+name;
	}

}
