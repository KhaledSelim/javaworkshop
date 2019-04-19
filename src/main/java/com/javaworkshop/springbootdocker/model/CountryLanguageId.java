package com.javaworkshop.springbootdocker.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CountryLanguageId implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "CountryCode")
	private String countryCode;
	@Column(name = "Language")
	private String language;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof CountryLanguageId))
			return false;
		CountryLanguageId that = (CountryLanguageId) o;
		return Objects.equals(getCountryCode(), that.getCountryCode())
				&& Objects.equals(getLanguage(), that.getLanguage());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getCountryCode(), getLanguage());
	}
}
