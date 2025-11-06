package SandBox.SpringUsingAutowiredVsNewInstance;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


@Configuration
public class testSpringValuesLoadingClassNoPostConstructAndRegularCall {
    @Value("${spring.Properties.data.field3}")
    public String field3;


    @PostConstruct
    public void testSpringValuesLoadingClassNoPostConstructAndRegularCall(){
        System.out.println("---@Configuration@PostConstruct testSpringValuesLoadingClassNoPostConstructAndRegularCall ---");
        NonAutowiredUse nonAutowiredUse = new NonAutowiredUse();
        System.out.println(nonAutowiredUse.field1);
        System.out.println(field3);
    }


}
