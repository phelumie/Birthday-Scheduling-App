package com.example.scheduler.Services.Impl;

import com.example.scheduler.Entity.User;
import com.example.scheduler.Repository.UserRepository;
import com.example.scheduler.Services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

@Service
@AllArgsConstructor
public class UserServicesImpl implements UserServices {

    private UserRepository userRepository;

    private int getRemainingBirthdayDay(User user) {
        LocalDate currentDate =LocalDate.now();
        long age = ChronoUnit.YEARS.between(user.getDob(), currentDate);
        LocalDate nextBirthday = user.getDob().plusYears(age);
        if (nextBirthday.isBefore(currentDate)) {
            nextBirthday = user.getDob().plusYears(age + 1);
        }
        long daysUntilNextBirthday = ChronoUnit.DAYS.between(currentDate, nextBirthday);
        int days = Math.toIntExact(daysUntilNextBirthday);
        return days;


    }
    public boolean isBirthday(User user){
        return getRemainingBirthdayDay(user)==0;
    }
    }
