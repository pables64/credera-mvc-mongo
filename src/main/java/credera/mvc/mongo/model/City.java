package credera.mvc.mongo.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * City model object with MongoDB meta-mapping annotations.
 * 
 * @version 1.0
 */
@Document(collection = "city")
public class City implements Serializable {
	private static final long serialVersionUID = 6684888389354589761L;
	@Id
	private String id;
	private String name;
	private String countryCode;
	private int population;
	private Date lastModificationDate;

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public City() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return this.getClass().getSimpleName()
				+ "|"
				+ ((this.id == null) ? "no data" : String.valueOf(this.id))
				+ "|"
				+ ((this.name == null) ? "no data" : String.valueOf(this.name))
				+ "|"
				+ ((this.countryCode == null) ? "no data" : String
						.valueOf(this.countryCode))
				+ "|"
				+ ((this.population == 0) ? "no data" : String
						.valueOf(this.population));
	}

}
