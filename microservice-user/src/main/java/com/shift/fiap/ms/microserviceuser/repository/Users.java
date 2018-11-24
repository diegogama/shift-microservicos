package com.shift.fiap.ms.microserviceuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shift.fiap.ms.microserviceuser.model.User;

public interface Users extends JpaRepository<User, Long> {

}
