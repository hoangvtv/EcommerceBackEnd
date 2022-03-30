package com.phamtanhoang.vtvshop.repository;

import com.phamtanhoang.vtvshop.model.Cart;
import com.phamtanhoang.vtvshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CartRepository extends JpaRepository<Cart, Integer> {

    List<Cart> findAllByUserOrderByCreatedDateDesc(User user);
}

