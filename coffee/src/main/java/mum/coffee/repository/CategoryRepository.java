package mum.coffee.repository;

import mum.coffee.domain.Category;
import mum.coffee.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by amal- on 5/21/2017.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category,Long> {
}
