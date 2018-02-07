package ngd.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ngd.springframework.service.RecipeService;

/**
 * 
 * @author Claudinei Dias on 2018-01-31
 */
@Controller
public class IndexController {

	private RecipeService recipeService;

	public IndexController(RecipeService recipeService) {
		super();
		this.recipeService = recipeService;
	}

	@RequestMapping({"", "/", "/index"})
	public String getIndexPage(Model model){
		
		model.addAttribute("recipes", recipeService.getRecipes());
		
		return "index";
	}
}
