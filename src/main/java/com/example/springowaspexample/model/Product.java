package com.example.springowaspexample.model;

import lombok.Data;

@Data
public class Product {
    private Long id;
    private String title;
    private String price;
    private String category;
    private String description;
    private String image;
}

