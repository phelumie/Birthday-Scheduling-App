package com.example.scheduler.ScheduledJobs;

import com.example.scheduler.Email.EmailQueue;
import com.example.scheduler.Entity.User;
import com.example.scheduler.Repository.UserRepository;
import com.example.scheduler.Services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class Birthday {
    private UserServices userServices;
    private UserRepository userRepository;
    private EmailQueue email;



    @Scheduled(cron = "0 0 11 * * *")
    public void sendBirthdayMailJob() {
        Flux.fromIterable(userRepository.findAll()).filter(userServices::isBirthday)
                .doOnNext(email::birthdayMail)
                .subscribe();
    }

}