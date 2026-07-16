package com.fran.chiodi.web;

import com.fran.chiodi.model.Product;//the repo need to know that data is is saving and retrieving
import org.springframework.data.jpa.repository.JpaRepository;// provides db methods (crud power)
import org.springframework.stereotype.Repository;//turns the file into a db acces component (spring bean)