package org.lifecycle.method;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       AbstractApplicationContext factory=new ClassPathXmlApplicationContext("config-metadata.xml");
        factory.registerShutdownHook();
        System.out.println(factory.getBean("message"));
    }
}
