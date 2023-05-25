package dk.cygni.javaclientimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"dk.cygni"})
public class JavaClientImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaClientImplApplication.class, args);
    }
}
