package spring.mvc.crud.service;



import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.mvc.crud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	public Product findBycode(String code); //select * from product where code=?
	public List<Product> findBycompany(String company);
	
	
	
	@Query(value="from Product")
	public List<Product> getAllProducts();
	
	
	@Query(value="from Product p where p.price>=30000")
	public List<Product> getProductByPrice();
	
	@Query(value="from Product p where p.price >= :p")
	public List<Product> getProductBasedOnPrice(@Param("p") BigDecimal price);
}