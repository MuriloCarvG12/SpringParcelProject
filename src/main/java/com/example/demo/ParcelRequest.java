package com.example.demo;

public record ParcelRequest(
        String type,
        double weight,
        String parcelType,
        boolean fragile,
        String deliveryZone
) {}
