package net.siwula.api;

import java.io.IOException;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Bean
    @Profile("local")
    public ApplicationRunner openBrowser() {
        return args -> {
            System.out.println("Attempting to open browser...");
            String url = "http://localhost:8080/swagger-ui/index.html";
            String os = System.getProperty("os.name").toLowerCase();
            Runtime rt = Runtime.getRuntime();

            try {
                if (os.contains("mac")) {
                    System.out.println("Detected macOS. Launching swagger docs in browser.");
                    rt.exec("open " + url);
                    return;
                } else {
                    System.out.println("OS not supported for launching swagger docs in browser.");
                }
            } catch (IOException e) {
                System.out.println("Failed to launch swagger docs browser: " + e.getMessage());
            }
        };
    }
}
