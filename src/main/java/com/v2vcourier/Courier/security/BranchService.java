package com.v2vcourier.Courier.security;


import com.v2vcourier.Courier.dto.BranchDto;
import com.v2vcourier.Courier.model.Branch;
import com.v2vcourier.Courier.repository.BranchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    @Transactional
    public void AddBranch(BranchDto branchDto) {
        Branch branch = mapFromDtoToBranch(branchDto);
        branchRepository.save(branch);

    }

    @Transactional
    public List<BranchDto> ShowAllBranch() {
        List<Branch> branchs = branchRepository.findAll();
        return branchs.stream().map(this::mapFromBranchToDto).collect(toList());
    }

    private BranchDto mapFromBranchToDto(Branch branch) {
        BranchDto branchDto = new BranchDto();
        branchDto.setBid(branch.getBid());
        branchDto.setBName(branch.getBName());
        branchDto.setMainBrAdd(branch.getMainBrAdd());
        return branchDto;
    }

    private Branch mapFromDtoToBranch(BranchDto branchDto) {
        Branch branch = new Branch();
        branch.setBName(branchDto.getBName());
        branch.setMainBrAdd(branchDto.getMainBrAdd());
        return branch;
    }
}
