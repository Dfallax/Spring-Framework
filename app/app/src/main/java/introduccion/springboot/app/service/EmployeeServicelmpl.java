package introduccion.springboot.app.service;

import org.springframework.stereotype.Service;

@Service
public class EmployeeServicelmpl implements  EmployeeService{


    @Override
    public String hello() {
        return "Hola munod!";
    }
}
