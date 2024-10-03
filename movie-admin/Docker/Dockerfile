FROM openjdk:17
EXPOSE 8762
WORKDIR D:\\Work\\app-booking-movie
COPY movie-admin/target/movie-admin-1.0-SNAPSHOT.jar .
CMD ["java","-Dspring.profiles.active=docker","-jar","movie-admin-1.0-SNAPSHOT.jar"]
