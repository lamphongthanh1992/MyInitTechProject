package tlam26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import thanhlam.CustomerService;

public class MainClass {
	public static void main(String[] args){
		System.out.println("Hello World");
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		//Product aaa = (Product)context.getBean("aaa");
		//System.out.println(aaa.toString());
		
		//SequenceGenerator sequence = (SequenceGenerator) context.getBean("sequenceGenerator");
		//System.out.println(sequence.getSequence());
		
		//Auto-wiring
		/*Customer customer = (Customer)context.getBean("customer");
		System.out.println(customer.getId());
		System.out.println(customer.getPerson().getName());*/
		
		
		//Auto scan
		CustomerService cust = (CustomerService)context.getBean("customerService");
    	System.out.println(cust);
		
	}

}
