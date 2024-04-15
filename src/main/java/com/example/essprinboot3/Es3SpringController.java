package com.example.essprinboot3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")

public class Es3SpringController {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    public String getName(@RequestParam(value = "name", defaultValue = "default") String name) {
        return name;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/name")
    public String postName(@RequestParam String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
