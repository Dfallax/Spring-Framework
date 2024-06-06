package introduccion.springboot.app;

import introduccion.springboot.app.controller.EmployeeController;
import introduccion.springboot.app.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IntroduccionApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(IntroduccionApplication.class, args);

		var employeeController = context.getBean(EmployeeController.class);
		System.out.println(employeeController.helloEmployeeService());
		System.out.println(employeeController.helloCustomerService());

	}

}
