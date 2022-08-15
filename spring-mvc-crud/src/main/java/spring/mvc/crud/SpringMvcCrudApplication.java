package spring.mvc.crud;

import java.math.BigDecimal;
import java.util.Optional;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import spring.mvc.crud.model.Product;
import spring.mvc.crud.service.ProductRepository;

@SpringBootApplication
public class SpringMvcCrudApplication {

	public static void main(String[] args) {
		
	//    ApplicationContext context=SpringBootApplication.run(SpringMvcCrudApplication.class, args);
	//    ProductRepository repo=context.getBean(ProductRepository.class);
		
	    //save operation
	    /*
		 * Product product1=new Product("GY0501AU ","HP Ryzen 3 Dual Core 3250U" ,
		 * "Laptop", new BigDecimal(37000), "HP"); repo.save(product1);
		 */
		
	    //fetch all
		/*
		 * List<Product> laptopList=repo.findAll();
		 * 
		 * for(Product product:laptopList) { System.out.println(product); }
		 */
	    
	    //fetch single product
		/*
		 * Optional<Product> product=repo.findById(1);
		 * 
		 * System.out.println(product.get());
		 */
	    
	    //update operation
	    
	   /* 
		
		  Optional<Product> product=repo.findById(3); Product p=product.get();
		 
		 p.setPrice(new BigDecimal(37500));
		  
		 repo.save(p);
		 
	    
	    
	    //delete operation
	   repo.deleteById(3);
	    
	    */
	    
//	    System.out.println(repo.count());
//	    System.out.println(repo.existsById(3));
//	    System.out.println(repo.findBycode("4358DSFRG"));
//	    System.out.println(repo.findBycompany("Lenovo"));
//	    System.out.println(repo.getAllProducts());
	}
}