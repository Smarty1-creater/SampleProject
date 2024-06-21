package com.example.realestate.service;

import com.example.realestate.model.Property;
import com.example.realestate.repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {
    @Autowired
    private PropertyRepository repository;

    public List<Property> getAllProperties() {
        return repository.findAll();
    }

    public Property addProperty(Property property) {
        return repository.save(property);
    }
}
