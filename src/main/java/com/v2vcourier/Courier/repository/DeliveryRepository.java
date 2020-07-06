package com.v2vcourier.Courier.repository;

import com.v2vcourier.Courier.model.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery,Long> {
}
