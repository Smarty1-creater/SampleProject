package com.example.controller;

import com.example.model.Request;
import com.example.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
public class RequestController {

    @Autowired
    private RequestService requestService;

    // Endpoint to get all requests for a specific property
    @GetMapping("/property/{propertyId}")
    public List<Request> getRequestsByPropertyId(@PathVariable Long propertyId) {
        return requestService.getRequestsByPropertyId(propertyId);
    }

    // Endpoint to get all requests made by a specific buyer
    @GetMapping("/buyer/{buyerId}")
    public List<Request> getRequestsByBuyerId(@PathVariable Long buyerId) {
        return requestService.getRequestsByBuyerId(buyerId);
    }

    // Endpoint to create a new request for a property
    @PostMapping
    public ResponseEntity<Request> createRequest(@RequestBody Request request) {
        Request createdRequest = requestService.createRequest(request);
        return ResponseEntity.ok(createdRequest);
    }

    // Endpoint to update the status of a request
    @PutMapping("/{requestId}")
    public ResponseEntity<Request> updateRequestStatus(@PathVariable Long requestId, @RequestBody Request request) {
        Request updatedRequest = requestService.updateRequestStatus(requestId, request);
        if (updatedRequest != null) {
            return ResponseEntity.ok(updatedRequest);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Endpoint to delete a request
    @DeleteMapping("/{requestId}")
    public ResponseEntity<Void> deleteRequest(@PathVariable Long requestId) {
        boolean isDeleted = requestService.deleteRequest(requestId);
        if (isDeleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
