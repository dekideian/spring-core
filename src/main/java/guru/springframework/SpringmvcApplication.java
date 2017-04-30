package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
    	ApplicationContext context =  SpringApplication.run(SpringmvcApplication.class, args);
    	HelloWorld hello = (HelloWorld) context.getBean("helloWorld");
    	hello.sayHello();
    }
}
