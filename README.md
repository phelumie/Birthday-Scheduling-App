# Birthday-Scheduling-App

This is an app that checks for client Birthday. If true the app will send a Happy birthday email to the customer.
This was done by using spring cron jobs which runs at 11am (GMT+1) to minimize timezone diffrernces.

I integrated the app with sendgrid twillo email api.
I also combined jdbc with webflux to run the job concurrently.
