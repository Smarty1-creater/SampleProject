package com.example.controller;

import com.example.service.propertyService;
import com.example.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private propertyService propertyService;

    @Autowired
    private RequestService requestService;

    @PutMapping("/property/{id}")
    public Object updateProperty(@PathVariable Long id, @RequestBody Object property) {
        return propertyService.updateProperty(id, property);
    }

    @DeleteMapping("/property/{id}")
    public void deleteProperty(@PathVariable Long id) {
        propertyService.deleteProperty(id);
    }

    @GetMapping("/requests")
    public Object getAllRequests() {
        return requestService.getAllRequests();
    }
}
