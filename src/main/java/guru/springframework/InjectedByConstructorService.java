package guru.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
	
	private final HelloWorldService helloWorldService;

	@Autowired
	public InjectedByConstructorService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	public void getMessage(){
		helloWorldService.sayHello();
	}
}
