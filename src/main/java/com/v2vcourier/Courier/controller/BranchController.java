package com.v2vcourier.Courier.controller;


import com.v2vcourier.Courier.dto.BranchDto;
import com.v2vcourier.Courier.security.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branch")
public class BranchController {
    @Autowired
    private BranchService branchService;

    @PostMapping("/AddBranch")
    public ResponseEntity AddBranch(@RequestBody BranchDto branchDto)
    {
        branchService.AddBranch(branchDto);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/showbranch")
    public ResponseEntity<List<BranchDto>> ShowAllBranch()
    {
        return new ResponseEntity<List<BranchDto>>(branchService.ShowAllBranch(),HttpStatus.OK);
    }
}
