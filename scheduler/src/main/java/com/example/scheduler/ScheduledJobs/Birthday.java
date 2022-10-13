package com.example.scheduler.ScheduledJobs;

import com.example.scheduler.Email.EmailQueue;
import com.example.scheduler.Repository.UserRepository;
import com.example.scheduler.Services.UserServices;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class Birthday {
    private final  UserServices userServices;
    private final UserRepository userRepository;
    private final EmailQueue email;



    @Scheduled(cron = "0 0 11 * * *")
    public void sendBirthdayMailJob() {
        Flux.fromIterable(userRepository.getUsersByBirthday())
                .doOnNext(email::birthdayMail)
                .subscribe();
    }

}