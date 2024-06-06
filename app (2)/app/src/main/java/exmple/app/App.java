package exmple.app;

import exmple.app.controller.ProductController;
import exmple.app.entity.Product;
import exmple.app.repository.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		var repository = context.getBean(ProductRepository.class);

		List<Product> products = List.of(
				new Product(null, "priduct1", 5.99, 1),
				new Product(null, "priduct1", 5.99, 1),
				new Product(null, "priduct1", 5.99, 1),
				new Product(null, "priduct1", 5.99, 1)
		);
		repository.saveAll(products);
	}

}
