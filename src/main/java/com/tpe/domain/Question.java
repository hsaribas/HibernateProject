package com.tpe.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.tpe.domain.enums.QuestionPriority;

@Entity
@Table(name="t_question")
public class Question extends BaseEntiy {

	
	@Column(length=100,nullable = false,unique = true)
	private String name;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private QuestionPriority priority;
	
	
	@OneToOne(mappedBy ="question",orphanRemoval = true)
	private QuestionDetail detail;
	
	@OneToMany(mappedBy ="question", orphanRemoval = true/*,fetch =FetchType.LAZY*/)
	private List<Answer> answers=new ArrayList<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public QuestionPriority getPriority() {
		return priority;
	}

	public void setPriority(QuestionPriority priority) {
		this.priority = priority;
	}

	public QuestionDetail getDetail() {
		return detail;
	}

	public void setDetail(QuestionDetail detail) {
		this.detail = detail;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
	
	
}
