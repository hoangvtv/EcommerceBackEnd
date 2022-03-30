package com.phamtanhoang.vtvshop.repository;


import com.phamtanhoang.vtvshop.model.AuthenticationToken;
import com.phamtanhoang.vtvshop.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TokenRepository extends JpaRepository<AuthenticationToken, Integer> {

    AuthenticationToken findByUser(User user);
    AuthenticationToken findByToken(String token);
}

