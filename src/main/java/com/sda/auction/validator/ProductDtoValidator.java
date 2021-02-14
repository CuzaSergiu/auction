package com.sda.auction.validator;

import com.sda.auction.dto.ProductDto;
import com.sda.auction.model.enums.ProductCategory;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

@Service
public class ProductDtoValidator {


    // == fields ==


    // == public methods ==
    public void validate(ProductDto productDto, BindingResult bindingResult) {

        validateName(productDto, bindingResult);
        validateDescription(productDto, bindingResult);
        validateCategory(productDto, bindingResult);
        validateStartingPrice(productDto, bindingResult);
    }

    // == private methods ==
    private void validateCategory(ProductDto productDto, BindingResult bindingResult) {
        try {
            ProductCategory.valueOf(productDto.getCategory());
        } catch (IllegalArgumentException exception) {
            bindingResult.addError(new FieldError("productDto", "category", "Wrong category."));
        }
    }

    private void validateDescription(ProductDto productDto, BindingResult bindingResult) {
        if (productDto.getDescription().isEmpty() || productDto.getDescription().length() < 10) {
            bindingResult.addError(
                    new FieldError("productDto", "description", "Description is too short. Should contain at least 10 characters!"));
        }
    }

    private void validateName(ProductDto productDto, BindingResult bindingResult) {
        if (productDto.getName().isEmpty()) {
            bindingResult.addError(
                    new FieldError("productDto", "name", "Name cannot be empty."));
        }
    }

    private void validateStartingPrice(ProductDto productDto, BindingResult bindingResult) {
        try {
            Integer startingPrice = Integer.parseInt(productDto.getStartBiddingTime());
            if (startingPrice <= 0) {
                bindingResult.addError(new FieldError("productDto", "startingPrice", "Price should be positive."));
            }
        } catch (NumberFormatException numberFormatException) {
            bindingResult.addError(new FieldError("productDto", "startingPrice", "Price should be a number."));
        }
    }

}
