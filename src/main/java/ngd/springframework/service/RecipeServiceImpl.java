package ngd.springframework.service;

import java.util.HashSet;
import java.util.Set;

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
	public Set<Recipe> getRecipes() {
		Set<Recipe> recipes = new HashSet<>();
		recipeRepository.findAll().forEach(recipes::add);
		return recipes;
	}

}
