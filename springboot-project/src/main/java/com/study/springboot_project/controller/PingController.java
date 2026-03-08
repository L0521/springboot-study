package com.study.springboot_project.controller;

import com.study.springboot_project.common.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PingController {
    @GetMapping("/api/ping")
    public ApiResponse<String> ping() {
        return ApiResponse.onSuccess("pong");
    }
}