package io.github.rfmaia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rfmaia.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
