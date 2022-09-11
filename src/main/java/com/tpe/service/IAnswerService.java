package com.tpe.service;

import java.util.List;

import com.tpe.domain.Answer;

public interface IAnswerService {
	
	public void saveAnswer(Answer answer);
	public void updateAnswer(Answer answer);
	public void deleteAnswer(Long id);
	public Answer findAnswer(Long id);
	public List<Answer> getAll();
	public List<Answer> getAllByQuestionId(Long id);

}
