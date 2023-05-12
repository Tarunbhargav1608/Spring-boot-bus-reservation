# RedBus - Bus Reservation System

This is a Bus Booking application built using Spring Boot, Hibernate, PostgreSQL, Spring Security, thymeleaf and JPA. The application allows users to find buses from a source to a destination and book seats in those buses.
### Team Members
- Himanshu Pandey
- Saurabh Pandey
- Tarun Bhargav
- Ishpreet 
- Aditi

### Technology used
- Spring boot
- Hibernate
- PostgreSQL
- Spring Security
- Thymeleaf
- JPA
- flying saucer library

### Features
- Two roles: Passenger and admin.

- Custom Success Handler: The Custom Success Handler , Handles the request basis on the ROle of the User after Login process --> if the ROle is Admin , it will redirect
  to Admin Dashboard , if Role is User then it will redirect to User Dashboard .

- Admin Dashboard: Admin Dashboard shows a form to upload the Bus data, and it gets stored in Bus data Table.

- User Dashboard: User Dashboard shows a filter to filter the Buses available for your to destination to from destination on a particular date.
- Filtered Data: Buses Data is visible on Dashboard screen in the form of table.
- Booking Page: Here you will enter the no of passengers who are tralvelling along with you and automatically the Cost you have to pay will be calculated after you click on pay .
- Ticket: A Dynamic Ticket is generated after you click on pay, if the passenger has lost the Ticket , he can again request for Generation of Ticket from his bookings page.
- Summary Page: This the Page where all your booking are available in Tabular Format and a button for Cancellation and Ticket Generation is given .
- Cancel button: You can Cancel your booking , by clicking on the Cancel button .

[//]: # ()
[//]: # (- we have made a User Table with one to Many mapping with Role. Before running your code you have to insert ADMIN and USER Role in the Role table then while you Run the)

[//]: # (  Application you go on Register Page --> Enter Details --> Sumit . The Call will go to Registration Controller and save the data to Database and then it will redirect)

[//]: # (  it to /login.)