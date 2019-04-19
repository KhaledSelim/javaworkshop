package com.javaworkshop.springbootdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.javaworkshop.springbootdocker.model.Country;

public interface CountryRepository extends JpaRepository<Country, String>{
	
	public Country findCountryByCode(String code);
}
