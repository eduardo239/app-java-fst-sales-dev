package io.eduardo.FSTSales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.FSTSales.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
