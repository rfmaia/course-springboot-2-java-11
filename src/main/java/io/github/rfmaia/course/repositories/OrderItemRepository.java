package io.github.rfmaia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rfmaia.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
