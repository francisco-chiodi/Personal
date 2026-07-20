package com.fran.chiodi.web.repository;//repo interface
//brdige to the db, inherits methods to interact with the db

import com.fran.chiodi.web.model.Product;//the repo need to know that data is saving and retrieving
import org.springframework.data.jpa.repository.JpaRepository; // provides db methods (crud power)
import org.springframework.stereotype.Repository;//turns the file into a db acces component (spring bean)

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
//here i can search for products with the spring data consult lengauge.
}