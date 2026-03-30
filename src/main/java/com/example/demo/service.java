package com.example.demo;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class service
{
    private final List<Parcel> parcelsList = new ArrayList<>();

    public

    @PostMapping("/newParcel")
    String createParcel(@RequestBody ParcelRequest Body)
    {
        switch (Body.type())
        {
            case "potion":
                Parcel PotionParcel = new PotionParcel(Body.weight(), Body.type(), Body.fragile(), Body.deliveryZone());
                this.parcelsList.add(PotionParcel);
                return PotionParcel.toString();

            case "dragonEgg":
                Parcel DragonEggParcel = new DragonEggParcel(Body.weight(), Body.type(), Body.deliveryZone());
                this.parcelsList.add(DragonEggParcel);
                return DragonEggParcel.toString();

            case "scroll":
                Parcel ScrollParcel = new EnchantedScroll(Body.type(), Body.fragile(), Body.deliveryZone());
                this.parcelsList.add(ScrollParcel);
                return ScrollParcel.toString();

            case "artifact":
                Parcel ArtifactParcel = new MagicArtifact(Body.weight(), Body.type(), Body.deliveryZone());
                this.parcelsList.add(ArtifactParcel);
                return ArtifactParcel.toString();


            default:
                throw new IllegalArgumentException("Unknown parcel type: " + Body.type());
        }
    }

    @GetMapping("/listParcels")
    String getParcels()
    {
        return this.parcelsList.toString();
    }

    @GetMapping("/dispatchParcel")
    String dispatchParcel(@RequestParam(required = false) Double weight, @RequestParam(required = false) String zone,@RequestParam(required = false) Boolean fragile)
    {
        Map<String, filter> FilterMethods = new HashMap<>();
        List<Parcel> result;


        if (weight != null)  FilterMethods.put("weight", new WeightFilter(weight));
        if (zone != null)    FilterMethods.put("zone", new ZoneFilter(zone));
        if (fragile != null) FilterMethods.put("fragile", new FragileFilter(fragile));

        result = parcelsList;

        for (filter f : FilterMethods.values()) {
            result = f.FilterParcel(result);
        }

        return result.toString();

    }
}
