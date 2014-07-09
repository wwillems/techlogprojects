package org.ts.patterns;

public class ProductBuilder {

    // fields with default values
    double surcharge      = 2.00;
    double tax            = 1.00;
    double totalTariff    = 0;
    double tariff         = 9.99;

    public ProductBuilder() {}

    public ProductBuilder withSurcharge(double surcharge) {
        this.surcharge = surcharge;
        return this;
    }

    public ProductBuilder withTax(double tax) {
        this.tax = tax;
        return this;
    }

    public ProductBuilder withTariff(double tariff) {
        this.tariff = tariff;
        return this;
    }

    public ProductBuilder withTotalTariff(double totalTariff) {
        this.totalTariff = totalTariff;
        return this;
    }

    public Product build() {
        Product product = new Product();
        product.setTax(tax);
        product.setTotalTariff(totalTariff);
        product.setSurcharge(surcharge);
        product.setTariff(tariff);

        return product;
    }
}
