package devutility.test.dubbo.server;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
		context.start();

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}