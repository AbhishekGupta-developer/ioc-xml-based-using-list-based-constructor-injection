package com.myorganisation.iocusinglistbasedconstructorinjection.model;

import java.util.Iterator;
import java.util.List;

public class Question {
    private Integer id;
    private String name;
    private List<String> answers;

    public Question(Integer id, String name, List<String> answers) {
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public void displayAllAnswers() {
        Iterator<String> iterator = answers.iterator();
        System.out.println("Question id: " + this.id + "\n"+ "name: " + this.name + "\n" + "answers: ");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
