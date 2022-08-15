package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
         context.registerShutdownHook();
        System.out.println(context.getBean("student1"));
        System.out.println(context.getBean("student2"));
        
    }
}

