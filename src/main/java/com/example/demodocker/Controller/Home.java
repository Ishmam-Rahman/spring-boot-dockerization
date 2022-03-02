package com.example.demodocker.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class Home {


  @GetMapping("/home-message")
  public String defaultMassage() {
    return "Welcome to my docker-practise";
  }
}
