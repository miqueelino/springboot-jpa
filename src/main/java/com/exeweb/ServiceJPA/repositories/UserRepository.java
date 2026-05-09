package com.exeweb.ServiceJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exeweb.ServiceJPA.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
