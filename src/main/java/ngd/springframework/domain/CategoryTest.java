package ngd.springframework.domain;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Claudinei Dias on 2018-02-09
 */
public class CategoryTest {

	private Category category;
	
	@Before
	public void setup(){
		category = new Category();
	}
	
	@Test
	public void testGetId() {
		final Long id = 4L;
		
		category.setId(id);
		
		assertEquals(id, category.getId());
	}

	@Test
	public void testGetDescription() {
		final String desc = "category 01";
		
		category.setDescription(desc);
		
		assertEquals(desc, category.getDescription());
	}

	@Test
	public void testGetRecipes() {
		final Set<Recipe> recipes = new  HashSet<>();

		final Recipe recipe01 = new Recipe();
		recipe01.setDescription("recipe 01");
		recipes.add(recipe01);
		final Recipe recipe02 = new Recipe();
		recipe02.setDescription("recipe 02");
		recipes.add(recipe02);
		
		category.setRecipes(recipes);
		
		assertEquals(2, category.getRecipes().size());
	}
}
