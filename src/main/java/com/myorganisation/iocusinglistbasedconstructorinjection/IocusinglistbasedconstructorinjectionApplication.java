package com.myorganisation.iocusinglistbasedconstructorinjection;

import com.myorganisation.iocusinglistbasedconstructorinjection.model.Question;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class IocusinglistbasedconstructorinjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IocusinglistbasedconstructorinjectionApplication.class, args);

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("App.xml");
		Question question = (Question) applicationContext.getBean("question");

		question.displayAllAnswers();
	}

}
