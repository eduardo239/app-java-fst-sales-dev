package io.eduardo.proj_10.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.eduardo.proj_10.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
