package SpringBootREST_OpenAPIandSwagger.service;
import SpringBootREST_OpenAPIandSwagger.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);

}
