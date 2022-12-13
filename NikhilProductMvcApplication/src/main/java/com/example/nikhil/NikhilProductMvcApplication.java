package com.example.nikhil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.nikhil.model.Product;
import com.example.nikhil.repository.ProductRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.example.nikhil.repository"})
public class NikhilProductMvcApplication   implements CommandLineRunner {
	@Autowired
	ApplicationContext context;

	public static void main(String[] args) {
		SpringApplication.run(NikhilProductMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
           //ApplicationContext context=new AnnotationConfigApplicationContext();
           
           ProductRepository repo=(ProductRepository)context.getBean("repo1");
           //repo.getAllProducts().stream().forEach(System.out::print);
           System.out.println(repo.getProductById("113"));
           
           Product p1 = new Product();
           p1.setProductId("rrrr");
           p1.setName("vikram vedha");
           p1.setCategory("pushpa");
           p1.setDescription("bahubali");
           p1.setManufacturer("KGF");
           p1.setUnitPrice(123);
           repo.addProduct(p1);
           
	
	}

}
