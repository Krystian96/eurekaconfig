package com.example.Config_server;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
class WebController {

    @Value("${message}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return message;
    }
}
