package com.devspring.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devspring.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
