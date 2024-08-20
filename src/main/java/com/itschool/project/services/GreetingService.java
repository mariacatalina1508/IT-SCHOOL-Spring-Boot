package com.itschool.project.services;

public class GreetingService {

    private final String message;

    public GreetingService(String message) {
        this.message = message;
    }

    public String greet() {
        return "greeting " + message;
    }
}