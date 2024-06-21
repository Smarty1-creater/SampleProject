package com.example.repository;

import com.example.model.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface propertyRepository extends JpaRepository<Property, Long> {
}
