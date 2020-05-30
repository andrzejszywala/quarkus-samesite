Sample application which shows how to set SameSite attribute on JSESSIONID Cookie.

Run application:
mvnw compile quarkus:dev

Open http://localhost:8080/samesite 

JSESSIONID cookie should have secure and SameSite=None attributes
