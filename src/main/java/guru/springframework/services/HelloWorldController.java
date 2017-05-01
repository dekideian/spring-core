package guru.springframework.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import guru.springframework.HelloWorldService;

@Controller
public class HelloWorldController {
	private final HelloWorldService helloWorldService;

	@Autowired
	public HelloWorldController(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}	
	
	public void showMessage(){
		helloWorldService.sayHello();
	}
}
