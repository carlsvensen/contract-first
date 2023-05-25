package dk.cygni.contractserverimpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"dk.cygni"})
public class ContractServerImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContractServerImplApplication.class, args);
    }

}
