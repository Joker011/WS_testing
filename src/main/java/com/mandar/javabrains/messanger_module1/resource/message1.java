package com.mandar.javabrains.messanger_module1.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mandar.javabrains.messanger_module1.model.Message;
import com.mandar.javabrains.messanger_module1.service.MessageService;


@Path("message")
public class message1 {
	
	MessageService ms = new MessageService();
	 @GET
	 @Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
	 System.out.println("inside");
		return ms.getAllMessages();
	}
	 
	 // A static sub-message calling
	 @GET
	 @Path("test")
	 @Produces(MediaType.APPLICATION_XML)
	 public String test()
	 {
		 return "test";
	 }

	 // a dynamic getting message wth param
	 
	 @GET
	 @Path("{messageID}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Message getMessage(@PathParam("messageID") Long id)
	 {
		 return ms.getMessage(id);
	 }
	 
	 @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Message addmessage(Message messages)
	 {
		 return ms.addMessage(messages);
	 }
	 
	 // to update the message
	 @PUT
	 @Path("{messageID}")
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_JSON)
	 public Message updateMessage(@PathParam("messageID") Long id,Message message)
	 {
		 message.setMessageID(id);
		 return ms.updateMessage(message);
	 }
	 
	 @DELETE
	 @Path("{messageID}")
	 @Produces(MediaType.APPLICATION_JSON)
	 public Message deleteMessage(@PathParam("messageID") Long id)
	 {
		 return ms.removeMessage(id);
	 }
	 
}
