package com.github.prarezende.staties.repositories;

import com.github.prarezende.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
