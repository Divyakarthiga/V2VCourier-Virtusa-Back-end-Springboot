package com.v2vcourier.Courier.controller;


import com.v2vcourier.Courier.dto.BranchDto;
import com.v2vcourier.Courier.dto.DeliveryDto;
import com.v2vcourier.Courier.dto.OrdDto;
import com.v2vcourier.Courier.security.BranchService;
import com.v2vcourier.Courier.security.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
    @Autowired
    private DeliveryService deliveryService;

    @PostMapping("/AddDelivery")
    public ResponseEntity AddDelivery(@RequestBody DeliveryDto deliveryDto)
    {
        deliveryService.AddDelivery(deliveryDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/showdelivery")
    public ResponseEntity<List<DeliveryDto>> ShowAllDelivery()
    {
        return new ResponseEntity<List<DeliveryDto>>(deliveryService.ShowAllDelivery(),HttpStatus.OK);
    }
    @GetMapping("/getDelivery/{Did}")
    public ResponseEntity<DeliveryDto> getSingleDelivery(@PathVariable @RequestBody Long Did)
    {
        return new ResponseEntity<>(deliveryService.readSingleDelivery(Did),HttpStatus.OK);
    }
}
