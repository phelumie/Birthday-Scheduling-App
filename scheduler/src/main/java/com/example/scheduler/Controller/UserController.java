package com.example.scheduler.Controller;

import com.example.scheduler.Entity.User;
import com.example.scheduler.Services.UserServices;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Optional;


@RestController
@AllArgsConstructor
public class UserController {

    private UserServices userServices;
   
}
