package com.gl.serviceimplementation;

import com.gl.service.Teacher;

// Implementation of the Teacher interface for a General Knowledge (GK) Teacher
public class GKTeacher implements Teacher {

    // Implementation of the getHomeWork method specified in the Teacher interface
    public void getHomeWork() {
        // Output a message specific to the GKTeacher's homework
        System.out.println("Go through current affairs for your homework.");
    }

    // Initialization method (init method)
    public void doInitialJob() {
        // Output a message indicating the execution of the initialization method
        System.out.println("Under the Initial Method from GKTeacher class");
    }

    // Destruction method (destroy method)
    public void doFinalJob() {
        // Output a message indicating the execution of the destruction method
        System.out.println("Under the Destroy Method from GKTeacher class");
    }

}
