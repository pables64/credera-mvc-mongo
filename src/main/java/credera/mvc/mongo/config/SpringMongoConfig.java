package credera.mvc.mongo.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;

import credera.mvc.mongo.framework.Properties;

@Configuration
public class SpringMongoConfig extends AbstractMongoConfiguration {

	private String databaseName = Properties
			.getString("springMongoConfig.databaseName"); //$NON-NLS-1$

	@Override
	@Bean
	public Mongo mongo() throws UnknownHostException {
		return new Mongo(
				Properties.getString("springMongoConfig.databaseServer")); //$NON-NLS-1$
	}

	@Override
	@Bean
	public MongoTemplate mongoTemplate() throws UnknownHostException {

		return new MongoTemplate(mongo(), this.databaseName);
	}

	@Override
	public String getDatabaseName() {
		return this.databaseName;
	}
}
