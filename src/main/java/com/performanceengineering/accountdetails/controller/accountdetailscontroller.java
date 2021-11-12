package com.performanceengineering.accountdetails.controller;

import java.util.Collections;
import java.util.List;

import com.performanceengineering.accountdetails.model.accountdetailsmodel;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accountdetails")
public class accountdetailscontroller {

    @RequestMapping("/{accId}")
    public List<accountdetailsmodel> getAccountDetails(@PathVariable("accId") String accId) {
        return Collections.singletonList(new accountdetailsmodel(accId, "1234"));
    }
}
