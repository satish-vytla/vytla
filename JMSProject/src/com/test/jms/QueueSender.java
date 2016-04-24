package com.test.jms;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class QueueSender {

	public static void main(String[] args) throws JMSException {
		
		ConnectionFactory connectionFactory=new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
			
		Connection connection=connectionFactory.createConnection();
		connection.start();
		Session session=connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
		
		//Queue
		Destination queue=session.createQueue("requestQ");
		//Queue Sender
		MessageProducer messageProducer=session.createProducer(queue);
		for(int i=1;i<=10;i++)
		{
			TextMessage message=session.createTextMessage("App Message No ::::"+i);
			messageProducer.send(message);
			System.out.println(message.getJMSMessageID());
			
		}
connection.close();
	}

}
