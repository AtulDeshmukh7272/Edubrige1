package org.autowire;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       BeanFactory factory=new ClassPathXmlApplicationContext("metadata.xml");
       Student s=(Student)factory.getBean("student");
       
       System.out.println(s.getName());
       System.out.println(s.getAdd().getAddress());
    }
}
