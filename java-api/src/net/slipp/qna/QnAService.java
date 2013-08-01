package net.slipp.qna;

import java.util.List;

public class QnAService {
	private Database database = new Database();
	
	public void create(Question question, String plainTags) {
		String[] tags = plainTags.split(",");
		for (String tag : tags) {
			question.addTag(new Tag(tag));
		}
		database.insert(question);
	}
	
	public Question findQuestionById(int questionId) {
		return database.findQuestionById(questionId);
	}
	
	public void answer(int questionId, Answer answer) {
		Question question = database.findQuestionById(questionId);
		question.addAnswer(answer);
	}
	
	public void update(Question question, String plainTags) {
		String[] tags = plainTags.split(",");
		for (String tag : tags) {
			question.addTag(new Tag(tag));
		}
		Question existedQuestion = database.findQuestionById(question.getId());
		existedQuestion.update(question);
		
	}

	public List<Question> findsQuestionByIdDesc() {
		return database.findsQuestionByIdDesc();
	}
}
