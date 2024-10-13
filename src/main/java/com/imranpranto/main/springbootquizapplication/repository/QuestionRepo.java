package com.imranpranto.main.springbootquizapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imranpranto.main.springbootquizapplication.model.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
