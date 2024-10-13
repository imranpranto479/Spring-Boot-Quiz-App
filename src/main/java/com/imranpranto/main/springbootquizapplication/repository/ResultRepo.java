package com.imranpranto.main.springbootquizapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imranpranto.main.springbootquizapplication.model.Result;

public interface ResultRepo extends JpaRepository<Result, Integer> {

}
