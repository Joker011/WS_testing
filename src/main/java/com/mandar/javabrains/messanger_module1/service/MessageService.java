package com.mandar.javabrains.messanger_module1.service;

import java.util.ArrayList;
import java.util.List;

import com.mandar.javabrains.messanger_module1.model.Message;

public class MessageService {
	
	
	public List<Message> getMessage()
	{
		Message m1= new Message(1, "FindingWS", "Mandar");
		Message m2 = new Message(2, "Found", "Mandar2");
		List<Message> msglist = new ArrayList<>();
		msglist.add(m1);
		msglist.add(m2);
		
		return msglist;
	}

}
