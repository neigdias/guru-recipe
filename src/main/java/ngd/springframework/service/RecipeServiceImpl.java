package ngd.springframework.service;

import org.springframework.stereotype.Service;

import ngd.springframework.domain.Recipe;
import ngd.springframework.repositories.RecipeRepository;

/**
 * @author Claudinei Dias on 2018-02-07
 */
@Service
public class RecipeServiceImpl implements RecipeService{

	private RecipeRepository recipeRepository; 

	public RecipeServiceImpl(RecipeRepository recipeRepository) {
		super();
		this.recipeRepository = recipeRepository;
	}

	@Override
	public Iterable<Recipe> getRecipes() {
		return recipeRepository.findAll();
	}

}
