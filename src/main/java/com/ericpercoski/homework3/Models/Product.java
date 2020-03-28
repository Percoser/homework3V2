package com.ericpercoski.homework3.Models;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(name = "description")
    public String description;
    @Column(name = "price")
    public double price;
    @Column(name = "color")
    public String color;

    public Product(){}

    public Product(String description, double price, String color){
        this.description = description;
        this.price = price;
        this.color = color;
    }

    public int getId(){return id;}

    public void setId(int id){this.id = id;}

    public String getDescription(){return description;}

    public void setDescription(String description){this.description = description;}

    public double getPrice(){return price;}

    public void setPrice(double price){this.price = price;}

    public String getColor(){return color;}

    public void setColor(String color){this.color=color;}

}
