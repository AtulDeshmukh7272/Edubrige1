package org.example.test;

import org.example.test.entity.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
       
       Question q=(Question) context.getBean("question1");
       
       System.out.println(q.getQuestionId());
       System.out.println(q.getQuestionText());
       for(String answer:q.getAnswers())
       {
    	   System.out.println(answer);
    	   
       }
    }
}
