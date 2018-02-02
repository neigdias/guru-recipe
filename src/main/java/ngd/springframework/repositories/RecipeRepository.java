package ngd.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import ngd.springframework.domain.Recipe;

/**
 * 
 * @author Claudinei Dias on 2018-02-02
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
	
}