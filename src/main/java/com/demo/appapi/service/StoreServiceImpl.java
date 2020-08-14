package com.demo.appapi.service;

import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    public String getString()
    {
        return "Hi";
    }
    public int setStoreString(String inputStr){
        //TODO Collections를 이용해서 문자를 저장하고, 문자의 id를 반환한다.
        return 1;
    }
}
