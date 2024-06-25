package com.example.controller;

import com.example.service.BookmarkService;
import com.example.service.RequestService;
import com.example.service.propertyService; // Corrected service name to PropertyService
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    private BookmarkService bookmarkService;

    @Autowired
    private propertyService propertyService;

    @Autowired
    private RequestService requestService;

    @GetMapping("/properties")
    public Object getProperties(@RequestParam Map<String, String> filters) {
        return propertyService.getProperties(filters);
    }

    @PostMapping("/bookmark")
    public boolean bookmarkProperty(@RequestParam Long propertyId) {
        return bookmarkService.bookmarkProperty(propertyId); // Direct return as boolean
    }

    @PostMapping("/request")
    public Object requestProperty(@RequestParam Long propertyId, @RequestParam String userDetails) {
        return requestService.requestProperty(propertyId, userDetails); // Direct return of the result
    }
}
