package SandBox.SpringUsingAutowiredVsNewInstance;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class testSpringValuesLoadingClass {
    @Value("${spring.Properties.data.field3}")
    public String field3;
    @Autowired
    AutowiredUse autowiredUse;
    @PostConstruct
    public void testSpringValuesLoadingClass(){
        System.out.println("---@Configuration@PostConstruct testSpringValuesLoadingClass ---");
        autowiredUse.getField1and2();
        System.out.println(field3);
    }


}
