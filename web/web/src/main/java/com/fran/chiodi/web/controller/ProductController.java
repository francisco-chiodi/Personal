package com.fran.chiodi.web;
//REST Controller: listen to the port for a extern app (like the front end), so when a HTTP petition is made (GET,POST,
//PUT,DELETE) this controller talks with the Repo to do the changes on the db by JSON. maps /api/products
//inyect the repo with a constructor, then create endpoints (routes that defines wich Java methods activates wich each petiton).
import com.fran.chiodi.web.FrontPage; //entity
import com.fran.chiodi.web.ProductRepo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController//marks the clase as web cvontroller to drive api rest rutes (JSON)
@RequestMapping("/api/products")//main url , any petition that satarts with this route, goes to this controller lain.
@CrossOrigin(origins = "http://localhost:4200") //made it cors able
public class ProductController {
    //inyect repo to use their methods
    @Autowired
    private ProductRepo productRepo;//interface then variable field name assingned to that variable
    //is a field of type ProductRepo named productRepo being type and variable name
    //is the repo injection to use the methods. 5432
    @GetMapping
    //rute get to localhost 8080/api/products
    public List<Product> obtainProducts(){
        return productRepo.findAll();
    }
    @PostMapping
    public Product makeProduct(@RequestBody Product product){ //incoming data, spring looks at the JSON, grabs it and
        //converts it into a Java Product object.
        return productRepo.save(product); //save takes the product object translates into sql insert into the db.
        //return the ipdatet Product object with its id back to the client as JSON respone.
        """
        A client sends a JSON payload with product details via a POST request. This method catches it, 
        turns it into a Java object, saves it to the database, and sends the saved product back to confirm it worked.
        """
    }
}
