package com.sda.auction.controller;

import com.sda.auction.dto.ProductDto;
import com.sda.auction.validator.ProductDtoValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class AdminController {

    // == fields ==
    private final ProductDtoValidator productDtoValidator;

    // == constructor ==
    @Autowired
    public AdminController(ProductDtoValidator productDtoValidator) {
        this.productDtoValidator = productDtoValidator;
    }

    // == methods ==
    @GetMapping("/addProduct")
    public String getAddProduct(Model model) {
        log.info("getAddProduct called");
        model.addAttribute("productDto", new ProductDto());
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String postAddProduct(Model model, ProductDto productDto, BindingResult bindingResult) {
        productDtoValidator.validate(productDto, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("productDto", productDto);
            return "addProduct";
        }
        return "redirect:/addProduct";
    }

}
