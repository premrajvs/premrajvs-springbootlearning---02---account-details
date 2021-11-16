package com.performanceengineering.accountdetails.controller;

import java.util.Arrays;
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
        return Arrays.asList(new accountdetailsmodel("1", "100-100-100-100", "10-01-2021", "Platinum"),
                new accountdetailsmodel("2", "200-200-200-200", "20-02-2021", "gold"));
    }
}
