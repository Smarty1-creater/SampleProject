package com.example.service;

import com.example.model.property;
import com.example.repository.propertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class propertyService {

    @Autowired
    private propertyRepository propertyRepository;

    public List<property> getAllProperties() {
        return propertyRepository.findAll();
    }

    public property getPropertyById(Long id) {
        return propertyRepository.findById(id).orElse(null);
    }

    public property saveProperty(property property) {
        return propertyRepository.save(property);
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
