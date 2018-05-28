package spa2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	public static void main(String args[]) {
		System.out.println("HEllooo!!");
	}
}
