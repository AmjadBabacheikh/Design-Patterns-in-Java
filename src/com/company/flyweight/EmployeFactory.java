package com.company.flyweight;

import java.util.HashMap;
//factory design pattern to create employee
public class EmployeFactory {
    private static HashMap<String, Employee> m = new HashMap<String, Employee>();

    public static Employee getEmployee(String type){
        Employee employee = null;
        if(m.get(type)!=null){
            employee=m.get(type);
        }else{
            if(type=="Developer"){
                employee=new Developer();
                m.put(type,employee);
            }
            else if(type=="Tester"){
                employee=new Tester();
                m.put(type,employee);
            }else {
                return null;
            }
        }
        return employee;
    }

}
