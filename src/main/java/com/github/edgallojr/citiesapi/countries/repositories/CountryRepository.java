package com.github.edgallojr.citiesapi.countries.repositories;

import com.github.edgallojr.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}