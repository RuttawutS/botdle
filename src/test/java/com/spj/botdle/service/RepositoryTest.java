package com.spj.botdle.service;

import com.spj.botdle.entity.LkSoi;
import com.spj.botdle.repository.LkSoiRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;


public class RepositoryTest {

    private  LkSoiRepository repository;

    @Test
    public void test(){
        for (LkSoi s : repository.findAll()){
            System.out.println("code : "+s.getCode());
        }
    }

}
