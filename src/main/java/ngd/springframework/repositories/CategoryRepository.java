package ngd.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import ngd.springframework.domain.Category;

/**
 * 
 * @author Claudinei Dias on 2018-02-02
 */
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
