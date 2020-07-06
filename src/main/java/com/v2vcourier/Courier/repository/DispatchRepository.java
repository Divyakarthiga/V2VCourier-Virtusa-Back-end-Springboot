package com.v2vcourier.Courier.repository;

import com.v2vcourier.Courier.model.Dispatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DispatchRepository extends JpaRepository<Dispatch,Long> {
}
