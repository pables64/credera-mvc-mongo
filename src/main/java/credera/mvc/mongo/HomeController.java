package credera.mvc.mongo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import credera.mvc.mongo.config.SpringMongoConfig;
import credera.mvc.mongo.services.CityService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private SpringMongoConfig springMongoConfig;
	
	@Autowired
	private CityService cityService;
	
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}

	public void setSpringMongoConfig(SpringMongoConfig springMongoConfig) {
		this.springMongoConfig = springMongoConfig;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is "+ locale.toString());
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		String dbName = springMongoConfig.getDatabaseName();
		
		model.addAttribute("dbName", dbName);
		
		//this causes the imbalanced fram stack warning, can potentially crash the server?
		
		String dbCities = String.valueOf(cityService.listCities().size());
		
		model.addAttribute("dbCities", dbCities);
		
		return "home";
	}
	
}
