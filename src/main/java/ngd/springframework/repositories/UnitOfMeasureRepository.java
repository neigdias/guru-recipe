package ngd.springframework.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import ngd.springframework.domain.UnitOfMeasure;

/**
 * 
 * @author Claudinei Dias on 2018-02-02
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long>{
	Optional<UnitOfMeasure> findByDescription(String description);
}
