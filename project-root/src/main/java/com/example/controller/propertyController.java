package com.example.controller;

import com.example.service.propertyService;
import com.example.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/property")
public class propertyController {

    @Autowired
    private propertyService propertyService;

    @Autowired
    private RequestService requestService;

    @GetMapping("/all")
    public Object getProperties(@RequestParam Map<String, String> filters) {
        return propertyService.getProperties(filters);
    }

    @GetMapping("/{id}")
    public Object getPropertyById(@PathVariable Long id) {
        return propertyService.getPropertyById(id);
    }

    @PostMapping("/add")
    public Object addProperty(@RequestBody Object property) {
        return propertyService.addProperty(property);
    }

    @PutMapping("/update/{id}")
    public Object updateProperty(@PathVariable Long id, @RequestBody Object property) {
        return propertyService.updateProperty(id, property);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
    }

    @GetMapping("/requests")
    public Object getAllRequests() {
        return requestService.getAllRequests();
    }
}
