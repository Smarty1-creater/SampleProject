package com.example.controller;

import com.example.model.Buyer;
import com.example.model.property;
import com.example.model.Seller;
import com.example.service.BuyerService;
import com.example.service.propertyService;
import com.example.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private SellerService sellerService;

    @Autowired
    private BuyerService buyerService;

    @Autowired
    private propertyService propertyService;

    @GetMapping("/sellers")
    public List<Seller> getAllSellers() {
        // Fetch all sellers
        return sellerService.getAllSellers();
    }

    @GetMapping("/buyers")
    public List<Buyer> getAllBuyers() {
        // Fetch all buyers
        return buyerService.getAllBuyers();
    }

    @GetMapping("/properties")
    public List<property> getAllProperties() {
        // Fetch all properties
        return propertyService.getAllProperties();
    }

    @PostMapping("/properties/approve")
    public ResponseEntity<?> approveProperty(@RequestParam Long propertyId) {
        // Approve property
        boolean isApproved = propertyService.approveProperty(propertyId);
        if (isApproved) {
            return ResponseEntity.ok("Property approved successfully.");
        } else {
            return ResponseEntity.status(404).body("Property not found.");
        }
    }

    @PostMapping("/properties/reject")
    public ResponseEntity<?> rejectProperty(@RequestParam Long propertyId) {
        // Reject property
        boolean isRejected = propertyService.rejectProperty(propertyId);
        if (isRejected) {
            return ResponseEntity.ok("Property rejected successfully.");
        } else {
            return ResponseEntity.status(404).body("Property not found.");
        }
    }
}
