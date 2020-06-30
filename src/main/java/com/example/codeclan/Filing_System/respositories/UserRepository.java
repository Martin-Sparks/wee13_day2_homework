package com.example.codeclan.Filing_System.respositories;

import com.example.codeclan.Filing_System.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
