package mum.coffee.domain;

import javax.persistence.*;
import java.util.Locale;

/**
 * Created by amal- on 5/20/2017.
 */
@Entity
public class Product {
    @Id
    @GeneratedValue
    long id;
    String name;
    Double price;
    @OneToOne
    Category category;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product(){    }
    public Product(String name, Double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
