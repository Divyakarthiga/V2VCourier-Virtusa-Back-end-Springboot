package com.v2vcourier.Courier.security;

import com.v2vcourier.Courier.dto.OrdDto;
import com.v2vcourier.Courier.dto.PostDto;
import com.v2vcourier.Courier.exception.OrderNotFoundException;
import com.v2vcourier.Courier.exception.PostNotFoundException;
import com.v2vcourier.Courier.model.Ord;
import com.v2vcourier.Courier.model.Post;
import com.v2vcourier.Courier.repository.OrdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;
import static java.util.stream.Collectors.toList;

@Service
public class OrdService {

    @Autowired
    private OrdRepository ordRepository;


    @Transactional
    public void AddOrd(OrdDto ordDto) {
        Ord ord = mapFromDtoToOrd(ordDto);
        ordRepository.save(ord);

    }

    @Transactional
    public List<OrdDto> ShowAll() {
        List<Ord> ords = ordRepository.findAll();
        return ords.stream().map(this::mapFromOrdToDto).collect(toList());
    }

    private OrdDto mapFromOrdToDto(Ord ord) {
        OrdDto ordDto = new OrdDto();
        ordDto.setOid(ord.getOid());
        ordDto.setSName(ord.getSName());
        ordDto.setSrc(ord.getSrc());
        ordDto.setDes(ord.getDes());
        ordDto.setMat(ord.getMat());
        ordDto.setRName(ord.getRName());
        ordDto.setSAddr(ord.getSAddr());
        ordDto.setRAddr(ord.getRAddr());
        ordDto.setDOBo(ord.getDOBo());
        ordDto.setTotalW(ord.getTotalW());
        ordDto.setDOD(ord.getDOD());
        ordDto.setCategory(ord.getCategory());
        ordDto.setSph(ord.getSph());
        ordDto.setRph(ord.getRph());
        return ordDto;
    }

    private Ord mapFromDtoToOrd(OrdDto ordDto) {
        Ord ord = new Ord();
        ord.setSName(ordDto.getSName());
        ord.setSrc(ordDto.getSrc());
        ord.setDes(ordDto.getDes());
        ord.setMat(ordDto.getMat());
        ord.setRName(ordDto.getRName());
        ord.setSAddr(ordDto.getSAddr());
        ord.setRAddr(ordDto.getRAddr());
        ord.setDOBo(Instant.now());
        ord.setTotalW(ordDto.getTotalW());
        ord.setDOD(ordDto.getDOD());
        ord.setCategory(ordDto.getCategory());
        ord.setSph(ordDto.getSph());
        ord.setRph(ordDto.getRph());
        return ord;
    }

    @Transactional
    public OrdDto readSingleOrd(Long Oid)
    {
        Ord ord=ordRepository.findById(Oid).orElseThrow(()->new OrderNotFoundException("For id"+Oid));
        return mapFromOrdToDto(ord);
    }
}
