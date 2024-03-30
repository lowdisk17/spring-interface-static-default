package com.sample.sample.controller;

import org.springframework.web.bind.annotation.RestController;

import com.sample.sample.service.ServiceImpl;
import com.sample.sample.service.ServiceInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class MainController {

  @Autowired
  ServiceImpl service;

  @GetMapping("service/static/{name}")
  public String useStatic(@PathVariable("name") String name) {
    return String.valueOf(ServiceInterface.isNameEqualToOneCharacter(name));
  }

  @GetMapping("service/{name}")
  public String useNonStatic(@PathVariable("name") String name) {
    return String.valueOf(service.isNameMoreThanThreeCharacters(name));
  }
  
  
}
