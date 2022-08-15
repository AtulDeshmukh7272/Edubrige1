package com.dependent.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dependent.object.entity.Driver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	 ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
         Driver driver=(Driver) context.getBean("driver");
         
     
     System.out.println(driver.getDriverId());
     System.out.println(driver.getDriverName());
     System.out.println(driver.getDriverContact());
     System.out.println(driver.getCar().getCarNo());
     System.out.println(driver.getCar().getCarModel());
     System.out.println(driver.getCar().getCarBrand());
     
     
    }
}
