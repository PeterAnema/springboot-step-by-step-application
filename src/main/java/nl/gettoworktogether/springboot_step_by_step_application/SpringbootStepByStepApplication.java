package nl.gettoworktogether.springboot_step_by_step_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootStepByStepApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStepByStepApplication.class, args);
    }

    @GetMapping("/")
    public String helloWorld() {
        return "Hello world!";
    }

}
