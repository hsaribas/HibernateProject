package com.tpe.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Version;

@MappedSuperclass
public abstract class BaseEntiy {
	
	@Id
	@GeneratedValue(generator="sequence",strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name="sequence",sequenceName = "question_answer_seq", initialValue = 1000,allocationSize = 10)
	private Long id;
	
	@Version
	private Long version;
	
	@Column(name="create_on")
	private LocalDateTime createOn=LocalDateTime.now();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreateOn() {
		return createOn;
	}
	
	

}
