package com.github.prarezende.countries.repositories;

import com.github.prarezende.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
