package org.example.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	//BeanFactory = new ClassPathXmlApplicationContext("context.xml");
    	//Resource resource=new ClassPathResource("context.xml");
    	//BeanFactory factory = new XmlBeanFactory(resource);
    	ApplicationContext context = new ClassPathXmlApplicationContext("context2.Xml");
    	System.out.println(context.getBean("book2"));
    }
}
