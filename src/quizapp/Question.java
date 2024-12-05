import java.util.List;

public class Question {
	private String QuestionText;
	private List<String> options;
	public int correctoptions;
	
	public Question(String QuestionText, List<String> options, int correctoptions) {
		this.QuestionText=QuestionText;
		this.options=options;
		this.correctoptions=correctoptions;
	}
	public boolean checkanswer(int answer) {
		return correctoptions==answer;
	}
	public String getQuestionText() {
		return QuestionText;
	}
	public List<String> getOptions(){
		return options;
	}
}