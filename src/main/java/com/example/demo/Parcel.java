package com.example.demo;

interface Parcel
{
    double getWeight();
    boolean isFragile();
    String getDeliveryZone();
}

class PotionParcel implements Parcel
{
    private
    double weight;
    String type;
    boolean fragile;
    String deliveryZone;

    public
     PotionParcel(double weight, String type, Boolean fragile, String deliveryZone) {
        this.weight = weight;
        this.type = type;
        this.fragile = fragile;
        this.deliveryZone = deliveryZone;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    @Override
    public String getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(String deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public boolean isFragile()
    {
        return this.fragile;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", type='" + type + '\'' +
                ", fragile=" + fragile +
                ", deliveryZone='" + deliveryZone + '\'';
    }
}

class DragonEggParcel implements Parcel
{
    private
    double weight;
    String type;
    boolean fragile = true;
    String deliveryZone;

    public

     DragonEggParcel(double weight, String type, String deliveryZone) {
        this.weight = weight;
        this.type = type;
        this.deliveryZone = deliveryZone;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFragile() {
        return fragile;
    }

    @Override
    public String getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(String deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public boolean isFragile()
    {
        return this.fragile;
    }

    @Override
    public String toString() {
        return
                "weight=" + weight +
                ", type='" + type + '\'' +
                ", fragile=" + fragile +
                ", deliveryZone='" + deliveryZone + '\'';

    }
}

class EnchantedScroll implements Parcel
{
    private
    double weight = 0;
    String type;
    boolean fragile;
    String deliveryZone;

    public

     EnchantedScroll(String type, Boolean fragile, String deliveryZone) {
        this.type = type;
        this.fragile = fragile;
        this.deliveryZone = deliveryZone;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    @Override
    public String getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(String deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public boolean isFragile()
    {
        return this.fragile;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", type='" + type + '\'' +
                ", fragile=" + fragile +
                ", deliveryZone='" + deliveryZone + '\'';

    }
}

class MagicArtifact implements Parcel
{
    private
    double weight;
    String type;
    boolean fragile = true;
    String deliveryZone;

    public

    MagicArtifact(double weight, String type, String deliveryZone) {
        this.weight = weight;
        this.type = type;
        this.deliveryZone = deliveryZone;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getFragile() {
        return fragile;
    }

    @Override
    public String getDeliveryZone() {
        return deliveryZone;
    }

    public void setDeliveryZone(String deliveryZone) {
        this.deliveryZone = deliveryZone;
    }

    public boolean isFragile()
    {
        return this.fragile;
    }

    @Override
    public String toString() {
        return "weight=" + weight +
                ", type='" + type + '\'' +
                ", fragile=" + fragile +
                ", deliveryZone='" + deliveryZone + '\'';
    }
}


