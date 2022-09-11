package com.tpe.domain.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.tpe.domain.Question;
import com.tpe.domain.QuestionDetail;
import com.tpe.util.HibernateUtil;

public class QuestionDetailDao extends GenericDaoImpl<QuestionDetail, Long> {

	@Override
	public List<QuestionDetail> getAll() {
		Session session = null;
        List<QuestionDetail> resultList=new ArrayList<>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<QuestionDetail> criteriaQuery = cb.createQuery(QuestionDetail.class);
			Root<QuestionDetail> root = criteriaQuery.from(QuestionDetail.class);
			criteriaQuery.select(root);

			Query<QuestionDetail> query = session.createQuery(criteriaQuery);
			resultList = query.getResultList();
			return resultList;

		} catch (RuntimeException ex) {
			throw ex;

		} finally {
			session.close();	
		}
	}



}
