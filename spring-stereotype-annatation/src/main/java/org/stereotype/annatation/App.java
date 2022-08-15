package org.stereotype.annatation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
       System.out.println(context.getBean("emp1"));
       System.out.println(context.getBean("emp2"));
    }
    
}
