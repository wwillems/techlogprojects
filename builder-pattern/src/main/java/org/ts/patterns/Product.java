package org.ts.patterns;

import java.io.Serializable;

public class Product implements Serializable {

    private double surcharge;
    private double tariff;
    private double totalTariff;
    private double tax;

    public Product() {
        // Empty default constructor
    }

    public double getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(double surcharge) {
        this.surcharge = surcharge;
    }

    public double getTariff() {
        return tariff;
    }

    public void setTariff(double tariff) {
        this.tariff = tariff;
    }

    public double getTotalTariff() {
        return tariff + surcharge + tax;
    }

    public void setTotalTariff(double totalTariff) {
        this.totalTariff = totalTariff;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "Product [tax=" + tax + ", surcharge=" + surcharge
                + ", tariff=" + tariff + ", totalTariff=" + totalTariff + "]";
    }

}

