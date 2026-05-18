package com.exeweb.ServiceJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exeweb.ServiceJPA.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
