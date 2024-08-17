package api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import pojo.Product;
import pojo.User;

@RestController
@Slf4j
public class Controller {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, World!";
    }

    @PostMapping("/user")
    public String validateUser(@RequestBody User user) {
        log.info("Received User: {}", user);
        return "User validation successful";
    }

    @PostMapping("/product")
    public String validateProduct(@RequestBody Product product) {
        log.info("Received Product: {}", product);
        return "Product validation successful";
    }
}
