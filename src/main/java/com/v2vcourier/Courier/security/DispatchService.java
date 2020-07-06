package com.v2vcourier.Courier.security;

import com.v2vcourier.Courier.dto.DeliveryDto;
import com.v2vcourier.Courier.dto.DispatchDto;
import com.v2vcourier.Courier.exception.DeliveryNotFoundException;
import com.v2vcourier.Courier.exception.DispatchNotFoundException;
import com.v2vcourier.Courier.model.Delivery;
import com.v2vcourier.Courier.model.Dispatch;
import com.v2vcourier.Courier.repository.DispatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class DispatchService {
    @Autowired
    private DispatchRepository dispatchRepository;

    @Transactional
    public void AddDispatch(DispatchDto dispatchDto) {
        Dispatch dispatch = mapFromDtoToDispatch(dispatchDto);
        dispatchRepository.save(dispatch);

    }

    @Transactional
    public List<DispatchDto> ShowAllDispatch() {
        List<Dispatch> dispatches = dispatchRepository.findAll();
        return dispatches.stream().map(this::mapFromDispatchToDto).collect(toList());
    }

    private DispatchDto mapFromDispatchToDto(Dispatch dispatch) {
        DispatchDto dispatchDto = new DispatchDto();
        dispatchDto.setDiId(dispatch.getDiId());
        dispatchDto.setShipn(dispatch.getShipn());
        dispatchDto.setRecen(dispatch.getRecen());
        dispatchDto.setReceA(dispatch.getReceA());
        dispatchDto.setPh(dispatch.getPh());
        dispatchDto.setAssigned(dispatch.getAssigned());
        dispatchDto.setDesti(dispatch.getDesti());
        dispatchDto.setDaDi(dispatch.getDaDi());
        dispatchDto.setDispatchedOn(dispatch.getdispatchedOn());
        return dispatchDto;
    }

    private Dispatch mapFromDtoToDispatch(DispatchDto dispatchDto) {
        Dispatch dispatch = new Dispatch();
        dispatch.setShipn(dispatchDto.getShipn());
        dispatch.setRecen(dispatchDto.getRecen());
        dispatch.setReceA(dispatchDto.getReceA());
        dispatch.setPh(dispatchDto.getPh());
        dispatch.setAssigned(dispatchDto.getAssigned());
        dispatch.setDesti(dispatchDto.getDesti());
        dispatch.setDaDi(dispatchDto.getDaDi());
        dispatch.setdispatchedOn(Instant.now());
        return dispatch;
    }

    @Transactional
    public DispatchDto readSingleDispatch(Long DiId)
    {
        Dispatch dispatch=dispatchRepository.findById(DiId).orElseThrow(()->new DispatchNotFoundException("For id"+DiId));
        return mapFromDispatchToDto(dispatch);
    }
}
