package com.phamtanhoang.vtvshop.repository;

import com.phamtanhoang.vtvshop.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
