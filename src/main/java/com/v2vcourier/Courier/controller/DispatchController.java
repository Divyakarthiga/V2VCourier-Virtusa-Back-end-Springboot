package com.v2vcourier.Courier.controller;

import com.v2vcourier.Courier.dto.DispatchDto;
import com.v2vcourier.Courier.security.DispatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dispatch")
public class DispatchController {
    @Autowired
    private DispatchService dispatchService;

    @PostMapping("/AddDispatch")
    public ResponseEntity AddDispatch(@RequestBody DispatchDto dispatchDto)
    {
        dispatchService.AddDispatch(dispatchDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/showdispatch")
    public ResponseEntity<List<DispatchDto>> ShowAllDispatch()
    {
        return new ResponseEntity<List<DispatchDto>>(dispatchService.ShowAllDispatch(),HttpStatus.OK);
    }
    @GetMapping("/getDispatch/{DiId}")
    public ResponseEntity<DispatchDto> getSingleDispatch(@PathVariable @RequestBody Long DiId)
    {
        return new ResponseEntity<>(dispatchService.readSingleDispatch(DiId),HttpStatus.OK);
    }
}
