package com.tpe.service;

import java.util.List;

import com.tpe.domain.Question;
import com.tpe.domain.dao.QuestionDao;
import com.tpe.exception.ResourceNotFounException;

public class QuestionServiceImpl implements IQuestionService {

	private static final QuestionDao questionDao=new QuestionDao();
	
	@Override
	public void saveQuestion(Question question) {
		questionDao.save(question);
	}

	@Override
	public void updateQuestion(Question question) {
         questionDao.update(question); 
	}

	@Override
	public void deleteQuestion(Long id) {
		questionDao.delete(id);

	}

	@Override
	public Question findQuestion(Long id) {
		return questionDao.find(id).orElseThrow(()->new ResourceNotFounException("Question not found with id"+id));
	}

	@Override
	public List<Question> getAll() {
		 return questionDao.getAll();
	}

}
