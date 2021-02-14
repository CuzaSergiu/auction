package com.sda.auction.controller;

import com.sda.auction.dto.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class AdminController {

    // == methods ==
    @GetMapping("/addProduct")
    public String getAddProduct(Model model) {
        log.info("getAddProduct called");
        model.addAttribute("productDto", new ProductDto());
        return "addProduct";
    }

}
