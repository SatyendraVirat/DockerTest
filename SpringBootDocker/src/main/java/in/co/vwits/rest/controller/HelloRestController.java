package in.co.vwits.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello")
	public String welcome() {
		System.out.println("In welcome");
		return "Welcome To World Of Docker (-_-)";
	}

}
