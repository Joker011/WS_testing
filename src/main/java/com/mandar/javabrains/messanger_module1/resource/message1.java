package com.mandar.javabrains.messanger_module1.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mandar.javabrains.messanger_module1.model.Message;
import com.mandar.javabrains.messanger_module1.service.MessageService;


@Path("message")
public class message1 {
	
	MessageService ms = new MessageService();
	 @GET
	 @Produces(MediaType.APPLICATION_XML)
	/* public String getm()
	 {
		 return "HI"; 
	 }
	*/
	public List<Message> getM()
	{
		 System.out.println("inside");
		return ms.getMessage();
	}

}
