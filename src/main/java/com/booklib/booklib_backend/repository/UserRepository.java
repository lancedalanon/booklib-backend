package com.booklib.booklib_backend.repository;

import com.booklib.booklib_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
