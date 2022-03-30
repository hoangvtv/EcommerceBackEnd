package com.phamtanhoang.vtvshop.repository;


import com.phamtanhoang.vtvshop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

