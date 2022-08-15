package org.standalone.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("metadata.xml");
        System.out.println(context.getBean("person1"));
        System.out.println(context.getBean("person2"));
    }
}
