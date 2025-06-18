package com.spj.botdle.controller;


import com.spj.botdle.bean.BaseRequest;
import com.spj.botdle.bean.SoiItem;
import com.spj.botdle.bean.SoiListResponse;
import com.spj.botdle.entity.LkSoi;
import com.spj.botdle.repository.LkSoiRepository;

import com.spj.botdle.service.ResponseRefNoHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/soi")
public class SoiController {

    @Autowired
    ResponseRefNoHelper responseRefNoHelper;
    @Autowired
    LkSoiRepository repository;

    @PostMapping(value = "/")
    public SoiListResponse list( @RequestBody BaseRequest req) {

        SoiListResponse res = new SoiListResponse();
        res.setReqRefNo(req.getReqRefNo());
        res.setResRefNo(responseRefNoHelper.genResponseRefNo());

        List<LkSoi> soiList = repository.findAll();
        if(soiList != null || !soiList.isEmpty()) {
            res.setItems((soiList.stream()
                    .map(this::convSoi)
                    .collect(Collectors.toList())));
        }else {
            res.setItems(new ArrayList<>());
        }
        return res;
    }

    private SoiItem convSoi(LkSoi soi){
        SoiItem i = new SoiItem();
        i.setCode(soi.getCode());
        i.setNameEn(soi.getNameEn());
        i.setNameTh(soi.getNameTh());

        return i;
    }



}
