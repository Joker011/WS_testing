package com.mandar.javabrains.messanger_module1.database;

import java.util.HashMap;
import java.util.Map;

import com.mandar.javabrains.messanger_module1.model.Message;

public class DatabaseMsg {
	
	private static Map<Long,Message> message = new HashMap<>();
	
	public static Map<Long,Message> getMessages()
	{
		return message;
	}

}
