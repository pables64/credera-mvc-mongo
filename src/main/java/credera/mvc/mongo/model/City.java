package credera.mvc.mongo.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jdo.annotations.PersistenceCapable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * City model object with MongoDB meta-mapping annotations.
 * 
 * @version 1.0
 */
@Document(collection = "city")
@PersistenceCapable
public class City implements Serializable {
	private static final long serialVersionUID = 6684888389354589761L;
	@Id
	private String ID;
	private String Name;
	private String CountryCode;
	private int Population;
	private Date lastModificationDate;
	private CharterDocument charterDocument;

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public City() {}

	public String getId() {
		return ID;
	}

	public void setId(String id) {
		this.ID = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String countryCode) {
		this.CountryCode = countryCode;
	}

	public int getPopulation() {
		return Population;
	}

	public void setPopulation(int population) {
		this.Population = population;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return this.getClass().getSimpleName()
				+ "|"
				+ ((this.ID == null) ? "no data" : String.valueOf(this.ID))
				+ "|"
				+ ((this.Name == null) ? "no data" : String.valueOf(this.Name))
				+ "|"
				+ ((this.CountryCode == null) ? "no data" : String
						.valueOf(this.CountryCode))
				+ "|"
				+ ((this.Population == 0) ? "no data" : String
						.valueOf(this.Population));
	}

	/**
	 *
	 * getter method for charterDocument
	 * @return
	 *
	 */
	public CharterDocument getCharterDocument() {
		return this.charterDocument;
	}

	/**
	 *
	 * setter method for charterDocument
	 * @param charterDocument
	 *
	 */
	public void setCharterDocument(final CharterDocument charterDocument) {
		this.charterDocument = charterDocument;
	}

}
