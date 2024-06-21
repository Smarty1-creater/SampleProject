package com.example.realestate.controller;

import com.example.realestate.model.Property;
import com.example.realestate.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/properties")
public class PropertyController {
    @Autowired
    private PropertyService service;

    @GetMapping
    public List<Property> getAllProperties() {
        return service.getAllProperties();
    }

    @PostMapping
    public Property addProperty(@RequestBody Property property) {
        return service.addProperty(property);
    }
}
