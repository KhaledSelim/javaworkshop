package com.javaworkshop.springbootdocker.service;

import java.util.List;

import com.javaworkshop.springbootdocker.model.Country;

public interface CountryService {

	public List<Country> getAll();

	public Country getCountryByCode(String code);
}
