package com.tpe.service;

import java.util.List;

import com.tpe.domain.Answer;
import com.tpe.domain.dao.AnswerDao;
import com.tpe.exception.ResourceNotFounException;

public class AnswerServiceImpl implements IAnswerService {

	private static final AnswerDao answerDao=new AnswerDao();
	
	@Override
	public void saveAnswer(Answer answer) {
		answerDao.save(answer);

	}

	@Override
	public void updateAnswer(Answer answer) {
		answerDao.update(answer);
	}

	@Override
	public void deleteAnswer(Long id) {
		answerDao.delete(id);
	}

	@Override
	public Answer findAnswer(Long id) {
		Answer answer= answerDao.find(id).orElseThrow(()->new ResourceNotFounException(String.format("Answer not found with id:%d", id)));
	    return answer;
	 }

	@Override
	public List<Answer> getAll() {
	   return answerDao.getAll();
	}

	@Override
	public List<Answer> getAllByQuestionId(Long id) {
		return answerDao.findAllByQuestionId(id);
	}

}
