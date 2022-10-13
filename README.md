# Birthday-Scheduling-App

This is an app that checks for client Birthday. If true the app will send a Happy birthday email to the customer.
This was done by using spring cron jobs which runs at 11am (GMT+1) to minimize timezone diffrernces.

I integrated the app with sendgrid twillo email api.
I also combined jdbc with webflux to run the job concurrently.
The project was integrated with a ci/cd pipeline (jenkins) to aws ec2 instance.

&ensp;
![Screenshot (166)](https://user-images.githubusercontent.com/67476155/195723643-9544819e-393c-4664-9565-6109f9262215.png)

&ensp;
&ensp;
&ensp;
&ensp;
![Screenshot (163)](https://user-images.githubusercontent.com/67476155/195723196-db7d86af-be46-41dd-a4f1-39aa6a723f7c.png)

&ensp;
![Screenshot (165)](https://user-images.githubusercontent.com/67476155/195723227-94615fb4-07f9-408c-8d6c-e9dec142a726.png)
