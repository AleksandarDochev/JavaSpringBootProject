package SandBox.SpringUsingAutowiredVsNewInstance;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AutowiredUse {
    @Value("${spring.Properties.data.field1}")
    public String field1;
    @Value("${spring.Properties.data.field2}")
    public String field2;

    @PostConstruct
    public void getField1and2() {
        System.out.println("@Configuration @PostConstruct AutowiredUse");
        System.out.println(field1);
        getField2();
    }
    public void getField2() {
        System.out.println(field2);
    }
}
