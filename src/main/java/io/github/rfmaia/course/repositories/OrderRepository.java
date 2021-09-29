package io.github.rfmaia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rfmaia.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
