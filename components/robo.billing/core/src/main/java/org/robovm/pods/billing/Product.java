package org.robovm.pods.billing;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public final class Product {
    private Map<StoreType, String> identifiers = new HashMap<>();

    private String title;
    private String description;
    private double price;
    private String currency;
    private String formattedPrice;
    private ProductType type = ProductType.CONSUMABLE;
    private boolean available;

    Product() {}

    Product(String identifier) {
        addIdentifier(null, identifier);
    }

    void addIdentifier(StoreType store, String identifier) {
        identifiers.put(store, identifier);
    }

    public String getIdentifier() {
        return getIdentifier(null);
    }

    public String getIdentifier(StoreType store) {
        String id = identifiers.get(store);
        if (id == null) {
            return identifiers.get(null);
        }
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrencyCode() {
        return currency;
    }

    public String getFormattedPrice() {
        return formattedPrice;
    }

    public ProductType getType() {
        return type;
    }

    void setTitle(String title) {
        this.title = title;
    }

    public boolean isAvailable() {
        return available;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setPrice(double price, String currency) {
        this.price = price;
        this.currency = currency;
        try {
            NumberFormat format = NumberFormat.getCurrencyInstance();
            format.setCurrency(Currency.getInstance(currency));
            setFormattedPrice(format.format(price));
        } catch (Exception e) {
            e.printStackTrace();
            setFormattedPrice(String.format("%s %10.2f", currency, price));
        }
    }

    void setFormattedPrice(String formattedPrice) {
        this.formattedPrice = formattedPrice;
    }

    void setType(ProductType type) {
        this.type = type;
    }

    void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        if (getIdentifier() != null) {
            return getIdentifier();
        }
        if (title != null) {
            return title;
        }
        if (description != null) {
            return description;
        }
        return super.toString();
    }
}
