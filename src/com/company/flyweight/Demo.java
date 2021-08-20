package com.company.flyweight;
/*
  Flyweight is a structural design pattern
  Used when we need to create many Objects of a class, we use it to reduce
  creation of Object.
  Intrinsic properties:same for all objects
  Extrinsic properties:diffrents for objects
 */
public class Demo {

    public static void main(String[] args) {
        Employee employee1= EmployeFactory.getEmployee("Developer");
        employee1.assignSkill("JAVA/ANGULAR");
        System.out.println(employee1.toString());
        employee1.task();
        Employee employee2= EmployeFactory.getEmployee("Developer");
        employee2.assignSkill("NODEJS/ANGULAR");
        System.out.println(employee2.toString());
        employee2.task();
        Employee employee3= EmployeFactory.getEmployee("Tester");
        employee3.assignSkill("JUNIT,MOCKITO,JEST");
        System.out.println(employee3.toString());
        employee3.task();
    }
}
