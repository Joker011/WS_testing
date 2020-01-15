package com.mandar.javabrains.messanger_module1.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	
	
	private int messageID;
	private String msg;
	private Date created;
	private String author;
	
	public Message()
	{
	
	}
	
	public Message(int messageID, String msg, String author) {
		this.messageID = messageID;
		this.msg = msg;
		this.created = new Date();
		this.author = author;
	}
	public int getMessageID() {
		return messageID;
	}
	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Message [messageID=" + messageID + ", msg=" + msg + ", created=" + created + ", author=" + author + "]";
	}
	
	

}
