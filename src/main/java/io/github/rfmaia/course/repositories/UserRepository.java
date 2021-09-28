package io.github.rfmaia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.rfmaia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
