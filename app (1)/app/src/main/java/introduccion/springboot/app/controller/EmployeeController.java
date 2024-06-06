package introduccion.springboot.app.controller;

import introduccion.springboot.app.primary.CustomerService;
import introduccion.springboot.app.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    /*
    El @Autowired sirve para inyectar el Beans, asai parecido a un constructor.
     */
   // @Autowired
    private EmployeeService employeeService;

  //  @Autowired
    private CustomerService customerService;


    // Esta es la forma recomendada a la hora de inyectar  Beans
    // se puede combinar con el Loombok para simplificar el código
    public EmployeeController(EmployeeService employeeService, CustomerService customerService) {
        this.employeeService = employeeService;
        this.customerService = customerService;
    }

    public String helloEmployeeService(){
        return  this.employeeService.hello();
    }
    public String helloCustomerService(){
        return  this.customerService.hello();
    }


}


