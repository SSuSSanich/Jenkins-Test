package ru.pet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pet.entity.Client;

public interface UserRepository extends JpaRepository<Client, Long> {

}