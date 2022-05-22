package com.example.scheduler.Email;

import com.example.scheduler.Services.Emailservice;
import com.example.scheduler.Entity.User;
import com.sendgrid.Response;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class EmailQueue {
    private Emailservice emailservice;

    public void birthdayMail(User user){
        log.info("Send happy birthday mail to ->{}",user);
        Response response = happyBirthDayMail(user);
        if(response.getStatusCode()==200||response.getStatusCode()==202)
            log.info("Happy birthday  email was sent to -> "+user.getEmail());

    }

    private Response happyBirthDayMail(User user) {
        StringBuilder message=new StringBuilder();
        message.append("<h5>").append("Hurray!!! Happy Birthday ")
                .append(user.getUsername()).append(".Many more years to come dear");
        message.append("<h6>").append("May lines begin to fall for you in pleasant places as from ")
                .append(user.getDob()).append(".Enjoy your day!!");

        EmailRequest emailRequest=new EmailRequest(user.getEmail(),"Hurray!!!",message.toString() );
        Response response=emailservice.sendemail(emailRequest);
        return response;
    }

}
