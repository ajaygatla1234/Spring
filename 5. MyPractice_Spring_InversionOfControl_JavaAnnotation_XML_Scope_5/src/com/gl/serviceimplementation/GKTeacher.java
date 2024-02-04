package com.gl.serviceimplementation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.gl.service.Teacher;

// Component annotation indicates that this class is a Spring bean
@Component("customName") // We can add our custom name as the bean id
// or else the default bean id name will be GKTeacher
@Scope("singleton") // Scope annotation defines the scope of the bean (singleton in this case)
public class GKTeacher implements Teacher {
    
    // Method to get homework details
    public void getHomeWork() {
        System.out.println("Go through current affairs");
    }
}
