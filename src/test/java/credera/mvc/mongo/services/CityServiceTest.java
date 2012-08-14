/**
 * 
 */
package credera.mvc.mongo.services;

import static com.lordofthejars.nosqlunit.mongodb.ManagedMongoDb.MongoServerRuleBuilder.newManagedMongoDbRule;
import static com.lordofthejars.nosqlunit.mongodb.MongoDbConfigurationBuilder.mongoDb;
import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;

import com.lordofthejars.nosqlunit.annotation.ShouldMatchDataSet;
import com.lordofthejars.nosqlunit.annotation.UsingDataSet;
import com.lordofthejars.nosqlunit.core.LoadStrategyEnum;
import com.lordofthejars.nosqlunit.mongodb.ManagedMongoDb;
import com.lordofthejars.nosqlunit.mongodb.MongoDbRule;

import credera.mvc.mongo.model.City;


/**
 * @author credera
 *
 */
public class CityServiceTest extends AbstractMongoIntegrationTest{
	
	@Resource
	private CityService cityService;
	
	public void setCityService(CityService cityService) {
		this.cityService = cityService;
	}

	
	@ClassRule
	public static ManagedMongoDb managedMongoDB = newManagedMongoDbRule().mongodPath("c:\\mongodb").build();
	@Rule
	public MongoDbRule remoteMongoDbRule = new MongoDbRule(mongoDb().databaseName("test").build());

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link credera.mvc.mongo.services.CityServiceImpl#setCityRepository(credera.mvc.mongo.repository.CityRepository)}.
	 */
	@Test
	public void testSetCityRepository() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link credera.mvc.mongo.services.CityServiceImpl#save(credera.mvc.mongo.model.City)}.
	 */
	@Test
	@UsingDataSet(locations="initialData.json", loadStrategy=LoadStrategyEnum.CLEAN_INSERT)
	@ShouldMatchDataSet(location="expectedData.json")
	public void testSave() {
		City city = new City();
		city.setName("pja-town");
		cityService.save(city);
		//fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link credera.mvc.mongo.services.CityServiceImpl#listCities()}.
	 */
	@Test
	public void testListCities() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
	 */
	@Test
	public void testEquals() {
		fail("Not yet implemented"); // TODO
	}

}
