package com.example.scheduler.Repository;

import com.example.scheduler.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query("select u from User as u " +
            "where day(u.dob) = day(CURRENT_DATE) " +
            "and MONTH(u.dob) = MONTH(CURRENT_DATE)")
    Collection<User> getUsersByBirthday();
}
