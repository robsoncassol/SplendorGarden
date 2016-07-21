package com.cassol.repository;

import org.springframework.data.repository.CrudRepository;

import com.cassol.model.User;

public interface UserRepository extends CrudRepository<User, Long>{

}
