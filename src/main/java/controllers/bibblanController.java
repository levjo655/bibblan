package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")

public class BibblanController {
    @Autowired
    BibblanController booksSerive;

    @PostMapping("/bibblan")
    public BibblanModel createBibblanModel(@RequestBody BibblanModel bibblanModel) {
        return bibblanSerive.createBibblan(bibblanSerive);
    }
    //GET
    @GetMapping("/all")
    public List<BibblanModel> getAllBibblan() {
        return bibblanSerive.getAllBibblan();
    }
    @PutMapping()
    public BibblanModel updatebibblan(@RequestBody BibblanModel bibblanModel) {
        return bibblanSerive.updateBibblan(bibblanModel);
    }

    // GET by id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public BibblanModel getAllBibblan(@PathVariable String id) {
        return recipeService.getRecipeById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteRecipe(@PathVariable String id){
        return recipeService.deleteRecipe(id);
    }

}
