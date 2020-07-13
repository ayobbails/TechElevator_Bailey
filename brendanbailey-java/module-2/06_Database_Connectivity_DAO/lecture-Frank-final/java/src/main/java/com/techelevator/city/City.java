package com.techelevator.city;

public class City {
// POJOs MUST HAVE standard getters/setters (let Eclipse generate)
// standard getter - name getColumnName (or isBoolenColumnName)
// standard setter - name setColumnName, accepts only one parameter, returns void
// POJOs are NOT required to have a constructor
//
// one instance variable for every column
// datatypes must match (be compatible) with the table column data types
	
	private Long id;            // serial in the table
	private String name;        // String is 'char' in the table
	private String countryCode; // String is 'char' in the table
	private String district;    // String is 'char' in the table
	private int population;     // any type with the word 'int' in the table
	/**********************/    // any type with the word 'float' in the table is a double
	/**********************/    // type numeric in the table is a double or BigDecimal
	
// Standard getter/setters  getVariableName / setVariableName
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", countryCode=" + countryCode + ", district=" + district
				+ ", population=" + population + "]";
	}
}
