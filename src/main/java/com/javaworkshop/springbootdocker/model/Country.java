package com.javaworkshop.springbootdocker.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "country")
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	@Column(name = "Code")
	private String code;
	@Column(name = "Name")
	private String name;
	@Column(name = "Continent")
	private String continent;
	@Column(name = "Region")
	private String region;
	@Column(name = "SurfaceArea")
	private double surfaceArea;
	@Column(name = "IndepYear")
	private long indepyear;
	@Column(name = "Population")
	private String population;
	@Column(name = "LifeExpectancy")
	private double lifeExpectancy;
	@Column(name = "GNP")
	private double gnp;
	@Column(name = "GNPOld")
	private double gnpOld;
	@Column(name = "LocalName")
	private String localName;
	@Column(name = "GovernmentForm")
	private String governmentForm;
	@Column(name = "HeadOfState")
	private String headOfState;
	@Column(name = "Capital")
	private int capital;
	@Column(name = "Code2")
	private String code2;

	@OneToMany(mappedBy = "country", cascade = CascadeType.ALL)
	private Set<City> city;

	@ManyToOne
	private CountryLanguage countryLanguage;

	public Set<City> getCity() {
		return city;
	}

	public void setCity(Set<City> city) {
		this.city = city;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public double getSurfaceArea() {
		return surfaceArea;
	}

	public void setSurfaceArea(double surfaceArea) {
		this.surfaceArea = surfaceArea;
	}

	public long getIndepyear() {
		return indepyear;
	}

	public void setIndepyear(long indepyear) {
		this.indepyear = indepyear;
	}

	public String getPopulation() {
		return population;
	}

	public void setPopulation(String population) {
		this.population = population;
	}

	public double getLifeExpectancy() {
		return lifeExpectancy;
	}

	public void setLifeExpectancy(double lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public double getGnp() {
		return gnp;
	}

	public void setGnp(double gnp) {
		this.gnp = gnp;
	}

	public double getGnpOld() {
		return gnpOld;
	}

	public void setGnpOld(double gnpOld) {
		this.gnpOld = gnpOld;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getGovernmentForm() {
		return governmentForm;
	}

	public void setGovernmentForm(String governmentForm) {
		this.governmentForm = governmentForm;
	}

	public String getHeadOfState() {
		return headOfState;
	}

	public void setHeadOfState(String headOfState) {
		this.headOfState = headOfState;
	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public String getCode2() {
		return code2;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public CountryLanguage getCountryLanguage() {
		return countryLanguage;
	}

	public void setCountryLanguage(CountryLanguage countryLanguage) {
		this.countryLanguage = countryLanguage;
	}

}
