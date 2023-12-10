package pl.grsw.fust.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FustController {

    @GetMapping("/")
    public String version() {
        return "Fust v. 0.0.1";
    }
}
