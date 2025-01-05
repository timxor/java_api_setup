package net.siwula.api;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1/employees")
public class ApiController {

    private static final Logger logger = LoggerFactory.getLogger(ApiController.class);


    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {

        logger.info("Returning response: 'Hello " + name + "'");

        return String.format("Hello, %s!", name);
    }
}
