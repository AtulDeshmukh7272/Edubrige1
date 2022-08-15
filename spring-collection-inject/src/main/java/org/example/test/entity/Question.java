package org.example.test.entity;

import java.util.List;

public class Question {
	
	private int questionId;
	
	private String questionText;
	
	private List<String> answers;

	public Question(int questionId, String questionText, List<String> answers) {
		super();
		this.questionId = questionId;
		this.questionText = questionText;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionText=" + questionText + ", answers=" + answers + "]";
	}
	
	

}
