package com.sda.auction.dto;

import lombok.Data;

@Data
public class ProductDto {

    // == fields ==
    private String name;
    private String description;
    private String category;
    private String startingBid;
    private String minimumBidStep;
    private String startBiddingTime;
    private String endBiddingTime;


}
