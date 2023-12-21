package com.mock.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mock.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
