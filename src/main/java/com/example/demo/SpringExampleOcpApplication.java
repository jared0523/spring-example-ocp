package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class SpringExampleOcpApplication {
	@GetMapping("/")
	public String welcome() {
		return "Welcom to PayCity.";
	}
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hi " + input + " Your application deployed successfully...";
	}	
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleOcpApplication.class, args);
	}
}
