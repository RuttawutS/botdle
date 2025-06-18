package com.spj.botdle.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ResponseRefNoHelper {
    public String genResponseRefNo(){
        return UUID.randomUUID().toString();
    }
}


