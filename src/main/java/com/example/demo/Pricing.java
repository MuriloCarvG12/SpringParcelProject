package com.example.demo;

interface CalculateTransport
{
    public double calculateFee();
}

class StandardShipping implements CalculateTransport
{

    private double basePrice;
    private double feeCalculated;

    public StandardShipping(double basePrice) {
        this.basePrice = basePrice;
    }

    public
    double calculateFee()
    {
        this.feeCalculated = this.basePrice + 10;
        return this.feeCalculated;
    }
}

class ExpressShipping implements CalculateTransport
{
    private final
    double basePrice;
    double feeCalculated;

    public ExpressShipping(double basePrice) {
        this.basePrice = basePrice;
    }

    public

    double calculateFee()
    {
        this.feeCalculated = this.basePrice + 20;
        return this.feeCalculated;
    }
}

class FragileShipping implements CalculateTransport
{
    private final
    double basePrice;
    double feeCalculated;

    public FragileShipping(double basePrice) {
        this.basePrice = basePrice;
    }


    public

    double calculateFee()
    {
        this.feeCalculated = this.basePrice + 30;
        return this.feeCalculated;
    }
}

class ZoneShipping implements CalculateTransport
{
    private final
    double basePrice;
    double feeCalculated;
    String feeZone;

    public ZoneShipping(double basePrice, String feeZone) {
        this.basePrice = basePrice;
        this.feeZone = feeZone;
    }

    public

    double calculateFee()
    {

        String zone = this.feeZone;
        switch (zone)
        {
            case "Deep North":
            {
                this.feeCalculated = this.basePrice + 30;
                return this.feeCalculated;
            }
            case "Far Lands":
            {
                this.feeCalculated = this.basePrice + 50;
                return this.feeCalculated;
            }

            default:
                return this.basePrice;
        }


    }
}

