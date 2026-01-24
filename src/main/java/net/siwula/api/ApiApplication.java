package net.siwula.api;

import java.io.IOException;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Bean
    public ApplicationRunner openBrowser() {
        return args -> {
            System.out.println("Attempting to open browser...");
            String url = "http://localhost:8080/swagger-ui/index.html";
            String os = System.getProperty("os.name").toLowerCase();
            Runtime rt = Runtime.getRuntime();
            try {
                if (os.contains("mac")) {
                    rt.exec("open " + url);
                } else if (os.contains("win")) {
                    rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
                } else if (os.contains("nix") || os.contains("nux")) {
                    rt.exec("xdg-open " + url);
                } else {
                    System.out.println("OS not supported for auto-open.");
                }
            } catch (IOException e) {
                System.out.println("Failed to open browser: " + e.getMessage());
            }
        };
    }
}
