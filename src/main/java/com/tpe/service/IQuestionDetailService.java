package com.tpe.service;

import java.util.List;

import com.tpe.domain.QuestionDetail;

public interface IQuestionDetailService {
	public void saveQuestionDetail(QuestionDetail questionDetail);
	public void updateQuestionDetail(QuestionDetail questionDetail);
	public void deleteQuestionDetail(Long id);
	public QuestionDetail findQuestionDetail(Long id);
	public List<QuestionDetail> getAll();
}
