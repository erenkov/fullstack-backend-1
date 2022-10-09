package com.petproject1.fullstackbackend.repository;

import com.petproject1.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
