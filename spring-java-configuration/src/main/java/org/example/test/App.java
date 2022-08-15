package org.example.test;

import org.example.test.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
        
        System.out.println(context.getBean("book1"));
        System.out.println(context.getBean("book2"));
    }
}
