package com.practicando.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public String getAllRestaurants(@RequestParam String palabra){

        return "El restaurante se llama: "+palabra;
    }

}
