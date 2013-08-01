package net.slipp.qna;

public class Question {
	private int id;
	private String title;
	private String contents;
	
	public Question(int id, String title, String contents) {
		this.id = id;
		this.title = title;
		this.contents = contents;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContents() {
		return contents;
	}

	public void update(Question question) {
		this.title = question.title;
		this.contents = question.contents;
	}

	public int sizeOfTags() {
		return 0;
	}

	public int sizeOfAnswers() {
		return 0;
	}
}
