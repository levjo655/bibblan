package bibblan_backend.demo.controllers;

import bibblan_backend.demo.services.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")

public class BlogPostController {
    @Autowired
    BlogPostService blogPostService;

    /*@PostMapping("/bibblan")
    public BibblanModel createBibblanModel(@RequestBody BibblanModel bibblanModel) {
        return bibblanSerive.createBibblan(bibblanSerive);
    }*/

    // POST


    // GET all


    // GET by id


    // PUT


    // DELETE

}
