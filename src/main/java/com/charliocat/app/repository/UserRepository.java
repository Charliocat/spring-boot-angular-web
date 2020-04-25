package com.charliocat.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.charliocat.app.domain.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
