package org.lifecycle.method;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext factory=new ClassPathXmlApplicationContext("person-metadata.xml");
        factory.registerShutdownHook();
        System.out.println(factory.getBean("person").hashCode());
        
        System.out.println(factory.getBean("person").hashCode());
        
        System.out.println(factory.getBean("person").hashCode());
    }
}

