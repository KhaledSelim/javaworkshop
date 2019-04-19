package com.javaworkshop.springbootdocker.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaworkshop.springbootdocker.model.Country;
import com.javaworkshop.springbootdocker.repository.CountryRepository;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepository countryRepository;

	@Override
	public List<Country> getAll() {
		List<Country> country = new ArrayList<Country>();
		countryRepository.findAll().forEach(country::add);
		return country;
	}

	@Override
	public Country getCountryByCode(String code) {
		return countryRepository.findCountryByCode(code);
	}

}
