package com.javaworkshop.springbootdocker.controller;

public class CountryRestResponse {

	private String name = "";
	private String continent = "";
	private String population = "";
	private double life_expectancy = -1;
	private String country_language = "";

	public CountryRestResponse() {
	}

	public CountryRestResponse(String name, String continent, String population, double life_expectancy,
			String country_language) {
		this.name = name;
		this.continent = continent;
		this.population = population;
		this.life_expectancy = life_expectancy;
		this.country_language = country_language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public double getLife_expectancy() {
		return life_expectancy;
	}

	public void setLife_expectancy(double life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public String getCountry_language() {
		return country_language;
	}

	public void setCountry_language(String country_language) {
		this.country_language = country_language;
	}

}
