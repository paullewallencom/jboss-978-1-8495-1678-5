package org.hornetq.example.mdb;

import java.util.Properties;

import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class QSender {
	public static void main(String[] args) {
		new QSender().send();
	}

	public void send() {
		try {
			// Strings for JNDI names
			String factoryName = "jms/RemoteConnectionFactory";
			String queueName = "queue/myQueue";
			// Create an initial context.
			Properties props = new Properties();
			props.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.jboss.naming.remote.client.InitialContextFactory");
			props.put(Context.PROVIDER_URL, "remote://localhost:4447");
			props.put(Context.SECURITY_PRINCIPAL, "testuser");
			props.put(Context.SECURITY_CREDENTIALS, "password");
			InitialContext context = new InitialContext(props);

			QueueConnectionFactory factory = (QueueConnectionFactory) context
					.lookup(factoryName);
			Queue queue = (Queue) context.lookup(queueName);
			context.close();
			// Create JMS objects
			QueueConnection connection = factory.createQueueConnection(
					"testuser", "password");
			QueueSession session = connection.createQueueSession(false,
					Session.AUTO_ACKNOWLEDGE);
			QueueSender sender = session.createSender(queue);

			String messageText = "Hello JMS";
			TextMessage message = session.createTextMessage(messageText);
			sender.send(message);
			// Exit
			System.out.println("Send successful, Exiting...");
			connection.close();
			System.exit(0);
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
}
