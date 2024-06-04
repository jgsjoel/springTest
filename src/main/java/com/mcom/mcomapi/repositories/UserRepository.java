package com.mcom.mcomapi.repositories;

import com.mcom.mcomapi.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

public interface UserRepository extends CrudRepository<User,Long> {
}
