package credera.mvc.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

import credera.mvc.mongo.model.City;

@RepositoryDefinition(domainClass = City.class, idClass = String.class)
public interface CityRepository extends MongoRepository <City, String>{
	City save(City city);
	
	List<City> findAll();
	
	City find(String id);

}
