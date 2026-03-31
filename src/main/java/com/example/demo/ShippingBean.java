package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ShippingBean
{

    Map<String, CalculateTransport> ShippingMethods = new HashMap<>();

    public
    ShippingBean() {}

    public double CalculateFee(Parcel parcel, boolean expressTransport)
    {

        double shippingFee = 0;


        if (expressTransport)
        {
            ShippingMethods.put("expressFee",  new ExpressShipping(parcel.getPrice()));
        }
        else
        {
            ShippingMethods.put("standardFee",  new StandardShipping(parcel.getPrice()));
        }

        if(parcel.isFragile())
        {
            ShippingMethods.put("fragileFee",  new FragileShipping(parcel.getPrice()));
        }

        if(parcel.getDeliveryZone().equals("Far Lands") || parcel.getDeliveryZone().equals("Deep North"))
        {
            ShippingMethods.put("zoneFee",  new FragileShipping(parcel.getPrice()));
        }

        for(CalculateTransport Fee: ShippingMethods.values())
        {
            shippingFee += Fee.calculateFee();
        }

        ShippingMethods.clear();

        return shippingFee;
    }

}
