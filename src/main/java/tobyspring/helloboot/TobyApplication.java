package tobyspring.helloboot;

import org.springframework.boot.SpringApplication;
import tobyspring.config.MySpringBootApplication;

@MySpringBootApplication
public class TobyApplication {
    public static void main(String[] args) {
        SpringApplication.run(TobyApplication.class, args);
    }
}
