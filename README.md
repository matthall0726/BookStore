# BookStore
BookStore using SpringBoot for RestAPI and MongoDB

Group member responsibilties:

Adam - Browse/Sort     
Jose    - Shopping Cart
Matt   - Book Details    
Chris  - Book rating
Cam   - Profile management 
________________________________________________________________

Hi guys. admittedly this is my first rest API but here's what I 
have done so far for anyone else in my shoes who is generally 
unfamiliar with this type of project:

I set up our project with start.spring.io using the dependencies
-Spring Web -Lombok -Spring Data MongoDB

I made a docker-compose .yaml file so we can use docker in our
project. 
To use this: 
-clone the projFolder on your comp 
-Install docker 
-run the command >> docker-compose -f <PATH TO THE .YAML FILE ON YOUR PC> up -d

From there you will be able to access mongo express by going to your web browser and typing in:
localhost:8081
