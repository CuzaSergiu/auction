package com.sda.auction.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AdminController {

    // == methods ==
    @GetMapping("/addProduct")
    public String getAddProduct() {
        log.info("getAddProduct called");
        return "addProduct";
    }

}
