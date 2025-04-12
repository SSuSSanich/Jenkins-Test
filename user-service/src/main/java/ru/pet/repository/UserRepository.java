package ru.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pet.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}