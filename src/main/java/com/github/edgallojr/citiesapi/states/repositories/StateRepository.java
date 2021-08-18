package com.github.edgallojr.citiesapi.states.repositories;

import com.github.edgallojr.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}