package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.services.HelloWorldController;

@SpringBootApplication
public class SpringmvcApplication {
 
	
    public static void main(String[] args) {
    	ApplicationContext context =  SpringApplication.run(SpringmvcApplication.class, args);
//    	InjectedByConstructorService hello = (InjectedByConstructorService) context.getBean("injectedByConstructorService");
//    	hello.getMessage();
//    	
//    	InjectedBySetterService hello2 = (InjectedBySetterService) context.getBean("injectedBySetterService");
//    	hello2.getMessage();
    	
    	HelloWorldController hwC= (HelloWorldController) context.getBean("helloWorldController");
    	hwC.showMessage();
    }
}
