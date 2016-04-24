package com.test.jms;
//imoprt javax.jms.MessageListener.*;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

public class MessageListener implements javax.jms.MessageListener{
public void onMessage(Message message){
	try{if (message instanceof TextMessage) {
		TextMessage textMessage = (TextMessage) message;
		
			System.out.println("Consume the msg" + textMessage.getText());
		} 
	}
		catch (Exception e) {
			
			System.out.println("Something Went Wrong");
		e.printStackTrace();
		}

	}
		

}