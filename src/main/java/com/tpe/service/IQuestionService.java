package com.tpe.service;

import java.util.List;

import com.tpe.domain.Question;

public interface IQuestionService {
	
	public void saveQuestion(Question question);
	public void updateQuestion(Question question);
	public void deleteQuestion(Long id);
	public Question findQuestion(Long id);
	public List<Question> getAll();
	

}
