package com.v2vcourier.Courier.controller;

import com.v2vcourier.Courier.dto.OrdDto;
import com.v2vcourier.Courier.dto.PostDto;
import com.v2vcourier.Courier.security.OrdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ord")
public class OrdController {

    @Autowired
    private OrdService ordService;

    @PostMapping("/AddOrd")
    public ResponseEntity AddOrd(@RequestBody OrdDto ordDto)
    {
        ordService.AddOrd(ordDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/show")
    public ResponseEntity<List<OrdDto>> ShowAll()
    {
        return new ResponseEntity<>(ordService.ShowAll(),HttpStatus.OK);
    }

    @GetMapping("/getDelivery/{Oid}")
public ResponseEntity<OrdDto> getSingleOrder(@PathVariable @RequestBody Long Oid)
{
    return new ResponseEntity<>(ordService.readSingleOrd(Oid),HttpStatus.OK);
}
}

