package com.javaworkshop.springbootdocker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaworkshop.springbootdocker.model.City;

public interface CityRepository extends JpaRepository<City, String> {

}
