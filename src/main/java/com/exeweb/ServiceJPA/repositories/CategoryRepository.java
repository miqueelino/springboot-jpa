package com.exeweb.ServiceJPA.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exeweb.ServiceJPA.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
