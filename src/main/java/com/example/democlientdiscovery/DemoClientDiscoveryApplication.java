package com.example.democlientdiscovery;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoClientDiscoveryApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(DemoClientDiscoveryApplication.class)
                .web(WebApplicationType.SERVLET).run(args);
    }

    @GetMapping("/services/{name}")
    @ResponseStatus(HttpStatus.OK)
    public String get(@PathVariable String name) {
        return "Service name is " + name;
    }

}
