# Daycare-Management-Application
Daycare Management Application - Java, OOP, Swing

Managing daycare where you enroll students and assign teachers based on the age groups and also define the class strength on the same basis. We can also manage the enrollments of the students and have an overview of each student's vaccination status.

Design points:
- Notable and easy to access GUI. Smoot navigation and transitions to different frames.
- CSV used to make the database for each person and further subcategories.
- JAVA SE used. We have used JDK 19 for the implementation of the program

FACTORY DESIGN PATTERN MODELS:

- Abstract Factory Model - Abstract Interface to define set of methods for creating objects
- Classroom Eager Singleton Factory - Implementation for classroom lazy singleton factory that is extended from the abstract factory 
- Student Eager Singleton Factory - Implementation for student lazy singleton factory that is extended from the abstract factory . To create student objects, we utilize a StudentEagerSingletonFactory class and define the getObject method.






