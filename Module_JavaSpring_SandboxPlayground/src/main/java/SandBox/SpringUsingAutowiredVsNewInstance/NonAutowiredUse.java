package SandBox.SpringUsingAutowiredVsNewInstance;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NonAutowiredUse {
    @Value("${spring.Properties.data.field1}")
    public String field1;
    @Value("${spring.Properties.data.field2}")
    public String field2;

    public void getField1and2() {
        System.out.println("@Configuration @PostConstruct NonAutowiredUse");
        System.out.println(field1);
        getField2();
    }
    public void getField2() {
        System.out.println(field2);
    }
}
