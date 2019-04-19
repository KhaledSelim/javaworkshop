package com.javaworkshop.springbootdocker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaworkshop.springbootdocker.model.Country;
import com.javaworkshop.springbootdocker.service.CountryService;

@RestController
@RequestMapping(value = "/countries-api")
public class CountryController {

	@Autowired
	CountryService countryService;

	@GetMapping(value = "/all")
	public List<Country> getAll() {
		return countryService.getAll();
	}

	@GetMapping(value = "/{code}")
	public CountryRestResponse getCountryByCode(@PathVariable String code) {
		Country country;
		CountryRestResponse countryRestResponse;
		try {
			if (code == null || code.isEmpty()) {
				throw new CountryCodeNotFoundExecption(code + " - INVALID_COUNTRY_CODE");
			} else
				country = countryService.getCountryByCode(code);
			countryRestResponse = new CountryRestResponse(country.getName(), country.getContinent(),
					country.getPopulation(), country.getLifeExpectancy(), country.getCountryLanguage().getLanguage());

			return countryRestResponse;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			// Clear Objects
			country = null;
			countryRestResponse = null;
		}
	}
}
