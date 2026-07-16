package com.fran.chiodi.web;
import com.fran.chiodi.web.FrontPage; //entity
import com.fran.chiodi.web.ProductRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController//marks the clase as web cvontroller to drive api rest rutes (JSON)
@RequestMapping("/api/productos")//main url , any petition that satarts with this router, goes to this controller lain.
@CrossOrigin(origins = "http://localhost:4200") //made it cors able
public class ProductController {

