package com.example.repository;

import com.example.model.property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface propertyRepository extends JpaRepository<property, Long> {
}
