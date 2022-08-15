package org.spring;



import org.spring.entity.Library;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	 
    	  ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
          
    	  Library q=(Library) context.getBean("library1");
          
          System.out.println(q.getLibraryId());
          System.out.println(q.getLibraryName());
          for(String library:q.getLibraryEntry())
          {
       	   System.out.println(library);
          }
          
         
          
    }
}