package com.example.scheduler.Repository;

import com.example.scheduler.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
