package com.mandar.javabrains.messanger_module1.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mandar.javabrains.messanger_module1.database.DatabaseMsg;
import com.mandar.javabrains.messanger_module1.model.Message;

public class MessageService {
	
	private Map<Long,Message> messages = DatabaseMsg.getMessages();
	
	public MessageService()
	{
		messages.put(1l, new Message(1,"java hello world", "Mandar"));
		messages.put(2l,new Message(2, "java webservice", "Mandar"));
	}
	
	public List<Message> getAllMessages()
	{
		return new ArrayList<Message>(messages.values());	
	}
	
	public Message getMessage(long id)
	{
		return messages.get(id);
	}
	
	public Message addMessage(Message message)
	{
		message.setMessageID(messages.size()+1);
		messages.put(message.getMessageID(), message);
		return message;
	}
	public Message updateMessage(Message message)
	{
		if(message.getMessageID()<=0)
		{
			return null;
		}
		messages.put(message.getMessageID(), message);
		return message;
	}
	
	public Message removeMessage(long id)
	{
		return messages.remove(id);
	}
}
