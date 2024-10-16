package com.myorganisation.iocusinglistbasedconstructorinjection.model;

import java.util.Iterator;
import java.util.Set;

public class MCQ {
    private Integer id;
    private String name;
    private Set<String> options;

    public MCQ(Integer id, String name, Set<String> options) {
        this.id = id;
        this.name = name;
        this.options = options;
    }

    public void displayAllOptions() {
        Iterator<String> iterator = options.iterator();
        System.out.println("MCQ id: " + this.id + "\n"+ "name: " + this.name + "\n" + "options: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
