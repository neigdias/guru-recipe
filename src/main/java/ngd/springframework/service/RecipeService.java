package ngd.springframework.service;

import ngd.springframework.domain.Recipe;

/**
 * @author Claudinei Dias on 2018-02-07
 */
public interface RecipeService {
	Iterable<Recipe> getRecipes();
}
