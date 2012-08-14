package credera.mvc.mongo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import credera.mvc.mongo.model.City;
import credera.mvc.mongo.services.CityService;

/**
 * Handles requests for the application city.
 */
@Controller
public class CityController {
	
	private static final Logger logger = LoggerFactory.getLogger(CityController.class);
	
	@Autowired
	private CityService cityService;
	
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/cityDetail/{cityId}", method = RequestMethod.GET)
	
	public String cityDetail(@PathVariable ("cityId") String cityId, Model model) {
		logger.info("Welcome city detail! ");
		
		City city = cityService.findOne(cityId);
		
		if (null == city){
			logger.info("no city found");
		} else {
				logger.info(""+city.getId()+city.getName());
		}
		
		model.addAttribute("cityId", cityId);
		
		model.addAttribute("city", city);
		
		return "cityDetail";
	}

	
	
}
