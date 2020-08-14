package com.demo.appapi.controller;

import com.demo.appapi.service.StoreService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    final StoreService storeService;

    private IndexController(StoreService storeService)
    {
        this.storeService = storeService;
    }


    @RequestMapping(value = "/regist", method = RequestMethod.POST)
    public ResponseEntity hello(String inputStr) {


        return new ResponseEntity<>("HELLO", HttpStatus.OK);
    }
}
