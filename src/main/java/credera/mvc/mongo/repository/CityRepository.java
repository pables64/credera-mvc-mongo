package credera.mvc.mongo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.RepositoryDefinition;

import credera.mvc.mongo.model.City;

@RepositoryDefinition(domainClass = City.class, idClass = String.class)
public interface CityRepository extends CrudRepository <City, String>{
	City save(City city);
	
	List<City> findAll();
}
