package net.slipp.qna;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Database {
	private Map<Integer, Question> questions;
	
	public Database() {
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};
		questions = new TreeMap<Integer, Question>(comparator);
	}

	public void insert(Question question) {
		questions.put(question.getId(), question);
	}

	public Question findQuestionById(int questionId) {
		return questions.get(questionId);
	}

	public List<Question> findsQuestionByIdDesc() {
		List<Question> sortedQuestions = new ArrayList<Question>();
		for (Integer key: questions.keySet()) {
			sortedQuestions.add(questions.get(key));
		}
		return sortedQuestions;
	}
}
