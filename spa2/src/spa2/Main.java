package spa2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	public static void main(String args[]) {
		System.out.println("HEllooo!!");
		
		PostDao ref = (PostDao)context.getBean("postDao");
		System.out.println(ref);
		
		ref.readAllPost1();
	}
}
