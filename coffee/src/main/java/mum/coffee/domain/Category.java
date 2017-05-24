package mum.coffee.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by amal- on 5/20/2017.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue
    long id;
    //@OneToMany()
    @OneToMany
    List<Product> products;
}
