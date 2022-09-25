package com.org.cts.main.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Fruits {
    @Id
    private int fruitId;
    private String fruitName;
    private String fruitBenefits;
    private int fruitPrice;
    private String fruitOrigin;

    public String getFruitOrigin() {
        return fruitOrigin;
    }

    public void setFruitOrigin(String fruitOrigin) {
        this.fruitOrigin = fruitOrigin;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitBenefits() {
        return fruitBenefits;
    }

    public void setFruitBenefits(String fruitBenefits) {
        this.fruitBenefits = fruitBenefits;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }
}
