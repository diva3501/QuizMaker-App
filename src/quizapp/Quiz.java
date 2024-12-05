import java.util.*;

public class Quiz {
	private String title;
	private List<Question> questions=new ArrayList<>();
	public Quiz(String title) {
		this.title=title;
	}
	public void addquestions(Question question) {
		questions.add(question);
	}
	public List<Question> getquestion(){
		return questions;
	}
	public String gettitle() {
		return title; 
	}
}
