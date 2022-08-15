package org.stereotype.annatation;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ConponentScan(basePackage="test.bean")
public class Config {
	
	
	@Bean(name =" employee1")
	@Scope("prototype")
	public Employee emp1()
	{
		return new Employee("111","Mr kunal",24000);
	}

	@Bean(name =" employee2")
	@Scope("prototype")
	public Employee emp2()
	{
		return new Employee("121","Mr kjihbjml",54000);
	}

}
