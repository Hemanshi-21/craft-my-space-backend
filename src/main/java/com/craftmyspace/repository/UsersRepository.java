package com.craftmyspace.repository;

import com.craftmyspace.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users findByUserId(String userId);

    Users findByEmailAndIsDeleted(String email, int isDeleted);

    Users findByEmailAndPasswordAndIsDeleted(String email, String password, int isDeleted);

}
