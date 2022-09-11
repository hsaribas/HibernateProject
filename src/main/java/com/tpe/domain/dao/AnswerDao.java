package com.tpe.domain.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tpe.domain.Answer;
import com.tpe.util.HibernateUtil;

public class AnswerDao extends GenericDaoImpl<Answer, Long> {

	@Override
	public List<Answer> getAll() {
		Session session = null;
        List<Answer> resultList=new ArrayList<>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Answer> criteriaQuery = cb.createQuery(Answer.class);
			Root<Answer> root = criteriaQuery.from(Answer.class);
			criteriaQuery.select(root);

			Query<Answer> query = session.createQuery(criteriaQuery);
			resultList = query.getResultList();
			return resultList;

		} catch (RuntimeException ex) {
			throw ex;

		} finally {
			session.close();	
		}
	}
	
	
	public List<Answer> findAllByQuestionId(Long id){
		Session session = null;
        List<Answer> resultList=new ArrayList<>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			Query<Answer> query = session.createQuery("FROM Answer a where a.question.id=:questionId",Answer.class);
			query.setParameter("questionId", id);
			
			resultList = query.getResultList();
			return resultList;

		} catch (RuntimeException ex) {
			throw ex;

		} finally {
			session.close();	
		}
	}



}
