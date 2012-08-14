package credera.mvc.mongo;

import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	@RequestMapping(value = "/city/{cityId}", method = RequestMethod.GET)
	public String city(@Context HttpServletResponse response, @PathParam ("cityId") String cityId, Model model) {
		logger.info("Welcome city detail! the client locale is "+ locale.toString());
		
		
		//this causes the imbalanced fram stack warning, can potentially crash the server?
		
		String dbCities = String.valueOf(cityService.listCities().size());
		
		model.addAttribute("dbCities", dbCities);
		
		return "home";
	}
	
}
