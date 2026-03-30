package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class controller
{
   private final service ServiceBean;

   public controller(service ServiceBean){
       this.ServiceBean = ServiceBean;
   }

    @PostMapping("/newParcel")
    public String createParcel(@RequestBody ParcelRequest body) {
        return ServiceBean.createParcel(body);
    }

    @GetMapping("/listParcels")
    public String getParcels() {
        return ServiceBean.getParcels();
    }

    @GetMapping("/dispatchParcel")
    public String dispatchParcels(
            @RequestParam(required = false) Double weight,
            @RequestParam(required = false) String zone,
            @RequestParam(required = false) boolean fragile)
    {
        return ServiceBean.dispatchParcel(weight, zone, fragile);
    }
}
