package TestCaseEnumeration;



/*

Functional UI:
1.Valid username /valid password - Login successful
2.Invalid username/valid password - error message
3.Valid username/Invalid password - error message
4.Invalid username/Invalid password - error message

API:
1.If more than  3 times tried with invalid username/password - send email to linked mail id stating activity (login) details
2.Hit API and check response time
3.API gets triggered for 2 factor authorization

Edge/Negative:
1.user blocked as no no of times invalid credentials, then will not able to login until specified time limit
2.After time, user unable to login using valid credentials
3.updated password not gets updated / login failed
4.Mail should trigger invalid login to backup mailid


Performance:
1.N no user load hitting the login and logging gets success














public class GmailLogin {
}
*/