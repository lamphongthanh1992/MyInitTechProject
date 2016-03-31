package tlam26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args){
		System.out.println("Hello World");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Product aaa = (Product)context.getBean("aaa");
		System.out.println(aaa.toString());
	}

}
