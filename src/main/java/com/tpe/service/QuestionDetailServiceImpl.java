package com.tpe.service;

import java.util.List;

import com.tpe.domain.QuestionDetail;
import com.tpe.domain.dao.QuestionDetailDao;
import com.tpe.exception.ResourceNotFounException;

public class QuestionDetailServiceImpl implements IQuestionDetailService {
	
	private static final QuestionDetailDao detailDao=new QuestionDetailDao();

	@Override
	public void saveQuestionDetail(QuestionDetail questionDetail) {
		detailDao.save(questionDetail);

	}

	@Override
	public void updateQuestionDetail(QuestionDetail questionDetail) {
		detailDao.update(questionDetail);
	}

	@Override
	public void deleteQuestionDetail(Long id) {
		detailDao.delete(id);
	}

	@Override
	public QuestionDetail findQuestionDetail(Long id) {
		return detailDao.find(id).orElseThrow(()->new ResourceNotFounException("QuestionDetail not found with id:"+id));
	}

	@Override
	public List<QuestionDetail> getAll() {
		return detailDao.getAll();
	}

}
