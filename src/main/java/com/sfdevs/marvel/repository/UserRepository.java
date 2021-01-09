package com.sfdevs.marvel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sfdevs.marvel.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
