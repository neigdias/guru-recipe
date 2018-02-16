package ngd.springframework.service;

import java.util.Set;

import ngd.springframework.domain.Recipe;

/**
 * @author Claudinei Dias on 2018-02-07
 */
public interface RecipeService {
	Set<Recipe> getRecipes();

	Recipe findById(Long id);
}
