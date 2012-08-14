package credera.mvc.mongo.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class CharterDocument {

	private String yearOfCharter;
	private List<String> Streets;
	private Map<String, String> officers = new TreeMap<String, String>();

	/**
	 *
	 * getter method for yearOfCharter
	 * @return
	 *
	 */
	public String getYearOfCharter() {
		return this.yearOfCharter;
	}

	/**
	 *
	 * setter method for yearOfCharter
	 * @param yearOfCharter
	 *
	 */
	public void setYearOfCharter(final String yearOfCharter) {
		this.yearOfCharter = yearOfCharter;
	}

	/**
	 *
	 * getter method for Streets
	 * @return
	 *
	 */
	public List<String> getStreets() {
		return this.Streets;
	}

	/**
	 *
	 * setter method for Streets
	 * @param Streets
	 *
	 */
	public void setStreets(final List<String> Streets) {
		this.Streets = Streets;
	}

	/**
	 *
	 * getter method for officers
	 * @return
	 *
	 */
	public Map<String,String> getOfficers() {
		return this.officers;
	}

	/**
	 *
	 * setter method for officers
	 * @param officers
	 *
	 */
	public void setOfficers(final Map<String,String> officers) {
		this.officers = officers;
	}

}
