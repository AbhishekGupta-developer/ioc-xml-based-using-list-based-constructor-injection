package com.myorganisation.iocusinglistbasedconstructorinjection.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem {
    private Integer id;
    private String name;
    private HashMap<Integer, String> solutions;

    public Problem(Integer id, String name, HashMap<Integer, String> solutions) {
        this.id = id;
        this.name = name;
        this.solutions = solutions;
    }

    public void displayAllSolutions() {
        Iterator<Map.Entry<Integer, String>> iterator = solutions.entrySet().iterator();
        System.out.println("Problem id: " + this.id + "\n"+ "name: " + this.name + "\n" + "solutions: ");
        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + " & value: " + entry.getValue());
        }
    }
}
