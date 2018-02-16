package ngd.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import ngd.springframework.service.RecipeService;

@Controller
public class RecipeController {

	private RecipeService recipeService;

	public RecipeController(RecipeService recipeService) {
		this.recipeService = recipeService;
	}

	@RequestMapping(value="/recipe/show/{id}")
	public String showById(@PathVariable("id") String id, Model model){
		model.addAttribute("recipe", recipeService.findById(new Long(id)));
		return "recipe/show";
	}
}
