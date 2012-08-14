package credera.mvc.mongo.services;

import java.util.List;

import credera.mvc.mongo.model.City;

public interface CityService {
	City save(City city);

	List<City> listCities();
	
	City findOne(String id);
}
