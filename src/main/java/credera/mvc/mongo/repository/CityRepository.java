package credera.mvc.mongo.repository;

import java.util.List;

import org.springframework.data.repository.RepositoryDefinition;

import credera.mvc.mongo.model.City;

@RepositoryDefinition(domainClass = City.class, idClass = String.class)
public interface CityRepository {
	City save(City city);
	
	List<City> findAll();

}
