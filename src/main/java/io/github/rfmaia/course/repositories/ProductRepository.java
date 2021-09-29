package io.github.rfmaia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rfmaia.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
