package com.imranpranto.main.springbootquizapplication.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imranpranto.main.springbootquizapplication.model.Question;
import com.imranpranto.main.springbootquizapplication.model.QuestionForm;
import com.imranpranto.main.springbootquizapplication.model.Result;
import com.imranpranto.main.springbootquizapplication.repository.QuestionRepo;
import com.imranpranto.main.springbootquizapplication.repository.ResultRepo;

@Service
public class QuizService {

    @Autowired
    Question question;
    @Autowired
    QuestionForm qForm;
    @Autowired
    QuestionRepo qRepo;
    @Autowired
    Result result;
    @Autowired
    ResultRepo rRepo;


    // generating random questions

	public QuestionForm getQuestions() {
		List<Question> allQues = qRepo.findAll();
		List<Question> qList = new ArrayList<Question>();
		
		Random random = new Random();
		
		for(int i=0; i<5; i++) {
			int rand = random.nextInt(allQues.size());
			qList.add(allQues.get(rand));
			allQues.remove(rand);
		}

		qForm.setQuestions(qList);
		
		return qForm;
	}
}
