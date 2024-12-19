package com.booklib.booklib_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class BaseController {

    @GetMapping("/api")
    public Map<String, String> index() {
        return Collections.singletonMap("message", "Server is up");
    }
}
