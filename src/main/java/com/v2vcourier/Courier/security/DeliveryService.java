package com.v2vcourier.Courier.security;

import com.v2vcourier.Courier.dto.DeliveryDto;
import com.v2vcourier.Courier.dto.OrdDto;
import com.v2vcourier.Courier.exception.DeliveryNotFoundException;
import com.v2vcourier.Courier.exception.OrderNotFoundException;
import com.v2vcourier.Courier.model.Delivery;
import com.v2vcourier.Courier.model.Ord;
import com.v2vcourier.Courier.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Transactional
    public void AddDelivery(DeliveryDto deliveryDto) {
        Delivery delivery = mapFromDtoToDelivery(deliveryDto);
        deliveryRepository.save(delivery);

    }

    @Transactional
    public List<DeliveryDto> ShowAllDelivery() {
        List<Delivery> deliveries = deliveryRepository.findAll();
        return deliveries.stream().map(this::mapFromDeliveryToDto).collect(toList());
    }

    private DeliveryDto mapFromDeliveryToDto(Delivery delivery) {
        DeliveryDto deliveryDto = new DeliveryDto();
        deliveryDto.setDid(delivery.getDid());
        deliveryDto.setBBname(delivery.getBBname());
        deliveryDto.setBL(delivery.getBL());
        deliveryDto.setShin(delivery.getShin());
        deliveryDto.setDB(delivery.getDB());
        deliveryDto.setDofD(delivery.getDofD());
        return deliveryDto;
    }

    private Delivery mapFromDtoToDelivery(DeliveryDto deliveryDto) {
        Delivery delivery = new Delivery();
        delivery.setBBname(deliveryDto.getBBname());
        delivery.setBL(deliveryDto.getBL());
        delivery.setShin(deliveryDto.getShin());
        delivery.setDB(deliveryDto.getDB());
        delivery.setDofD(deliveryDto.getDofD());
        return delivery;
    }

    @Transactional
    public DeliveryDto readSingleDelivery(Long Did)
    {
        Delivery delivery=deliveryRepository.findById(Did).orElseThrow(()->new DeliveryNotFoundException("For id"+Did));
        return mapFromDeliveryToDto(delivery);
    }
}
