package com.tpe;

import java.util.List;

import com.tpe.domain.Answer;
import com.tpe.domain.Question;
import com.tpe.service.AnswerServiceImpl;
import com.tpe.service.IAnswerService;
import com.tpe.service.IQuestionDetailService;
import com.tpe.service.IQuestionService;
import com.tpe.service.QuestionDetailServiceImpl;
import com.tpe.service.QuestionServiceImpl;

public class Client {

	public static void main(String[] args) {
		IQuestionService questionService= new QuestionServiceImpl();

		
//		Question question1=new Question();
//		question1.setName("What is Java");
//		question1.setPriority(QuestionPriority.CRITICAL);
		
//		questionService.saveQuestion(question1);
		
		
//		Question question2=new Question();
//		question2.setName("What is Node js");
//		question2.setPriority(QuestionPriority.HIGH);
//		questionService.saveQuestion(question2);
		
		
//		Question questionFound2= questionService.findQuestion(1000L);
//		
//		for (Answer answer : questionFound2.getAnswers()) {
//			System.out.println(answer.getDescription());
//		}
//		
		
		
//		Question questionFound2= questionService.findQuestion(1031L);
		
		
		
		IQuestionDetailService detailService=new QuestionDetailServiceImpl();
		
//		QuestionDetail detail2=new QuestionDetail();
//		detail2.setDescription("It is about the javasript engine");
//		detail2.setQuestion(questionFound2);
//		detailService.saveQuestionDetail(detail2); 
		
		//questionService.deleteQuestion(questionFound2.getId());
		
		
		
		
		//Question questionFound= questionService.findQuestion(1000L);
		
		
//		QuestionDetail detail=new QuestionDetail();
//		detail.setDescription("It is student question about the java OOP concept");
//		
//		detail.setQuestion(questionFound);
//		
//		IQuestionDetailService detailService=new QuestionDetailServiceImpl();
//		
//		detailService.saveQuestionDetail(detail);
		
		
		IAnswerService answerService=new AnswerServiceImpl();
		
		//Answer answer1 =new Answer();
//		answer1.setName("Answer 1");
//		answer1.setDescription("It is OO programming language.");
//		answer1.setQuestion(questionFound);
		
		
//		Answer answer2 =new Answer();
//		answer2.setName("Answer 2");
//		answer2.setDescription("It is easy to learn");
//		answer2.setQuestion(questionFound);
		
		//answerService.saveAnswer(answer1);
//		answerService.saveAnswer(answer2);

		
		
//		Thread thread1=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				 List<Question> allQuestion = questionService.getAll();
//				 allQuestion.forEach(q->System.out.println(q.getId()+":"+ q.getName()+":"+q.getDetail().getDescription()));
//				 
//				 System.out.println("--------------------------");
//			}
//		});
//		
//		thread1.start();
//		
//		
//
		
//	    Thread thread2=new Thread(new Runnable() {
//			
//			@Override	
//			public void run() {
//				 List<Answer> answerList = answerService.getAllByQuestionId(1000L);
//					
//				 answerList.forEach(a->System.out.println(a.getId()+":"+a.getName()+":"+a.getDescription()));
//				 
//				 System.out.println("--------------------------");
//				
//			}
//		});
//		
//		thread2.start();
	}

}
