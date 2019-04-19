package com.javaworkshop.springbootdocker.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "countryLanguage")
public class CountryLanguage implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	private CountryLanguageId countryLanguageId;
	@Column(name = "CountryCode")
	private String countryCode;
	@Column(name = "Language")
	private String language;
	@Column(name = "IsOfficial")
	private char isOffial;
	@Column(name = "Percentage")
	private float percentage;

	@OneToMany(mappedBy = "countryLanguage", cascade = CascadeType.ALL)
	private Set<Country> country;

	public CountryLanguageId getCountryLanguageId() {
		return countryLanguageId;
	}

	public void setCountryLanguageId(CountryLanguageId countryLanguageId) {
		this.countryLanguageId = countryLanguageId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public char getIsOffial() {
		return isOffial;
	}

	public void setIsOffial(char isOffial) {
		this.isOffial = isOffial;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

}
