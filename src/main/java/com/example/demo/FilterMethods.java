package com.example.demo;


import java.util.ArrayList;
import java.util.List;

interface filter
{
    public List<Parcel> FilterParcel(List<Parcel> Parcels);
}

class WeightFilter implements filter {
    private
        double weightFilter;

    public
    WeightFilter(double weight){
       this.weightFilter = weight;
    }

    public
    List<Parcel> FilterParcel(List<Parcel> Parcels)
    {
        List<Parcel> FilteredParcels = new ArrayList<>();
        for(Parcel CurrentParcel : Parcels)
        {
            if (CurrentParcel.getWeight() > weightFilter)
            {
                FilteredParcels.add(CurrentParcel);
            }
        }
        return FilteredParcels;
    }
}

class ZoneFilter implements filter
{
    private
    String zoneFilter;

    public
    ZoneFilter(String zoneFilter){
        this.zoneFilter = zoneFilter;
    }

    public
    List<Parcel> FilterParcel(List<Parcel> Parcels)
    {
        List<Parcel> FilteredParcels = new ArrayList<>();
        for(Parcel CurrentParcel : Parcels)
        {
            if (CurrentParcel.getDeliveryZone() == zoneFilter)
            {
                FilteredParcels.add(CurrentParcel);
            }
        }
        return FilteredParcels;
    }
}

class FragileFilter implements filter
{
    private
    boolean fragileFilter;

    public
    FragileFilter(boolean fragileFilter){
        this.fragileFilter = fragileFilter;
    }

    public
    List<Parcel> FilterParcel(List<Parcel> Parcels)
    {
        List<Parcel> FilteredParcels = new ArrayList<>();
        for(Parcel CurrentParcel : Parcels)
        {
            if (CurrentParcel.isFragile() == fragileFilter)
            {
                FilteredParcels.add(CurrentParcel);
            }
        }
        return FilteredParcels;
    }

}


