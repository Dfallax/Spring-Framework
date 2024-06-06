package introduccion.springboot.app.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CustomerAServicelmpl implements CustomerService{
    @Override
    public String hello() {
        return "A";
    }
}
