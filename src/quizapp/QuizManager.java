import java.util.*;
public class QuizManager {
		private List<User> users=new ArrayList<>();
		private List<Quiz> quizzes=new ArrayList<>();
		
		public void registeruser(String username,String password, String role) {
			users.add(new User(username,password,role));
		}
		
		public User login(String username, String password) {
			for(User user: users) {
				if(user.getUsername().equals(username) && user.checkpassword(password)) {
					return user;
				}
			}
			return null;
		}
		
		public void createQuiz(String title) {
			quizzes.add(new Quiz(title));
		}
		
		public void addQuestionToQuiz(String quizTitle, Question question) {
			for(Quiz quiz:quizzes) {
				if(quiz.gettitle().equals(quizTitle)) {
					quiz.addquestions(question);
					break;
				}
			}
		}
		
		public void takeQuiz(User user, String quizTitle) {
			for(Quiz quiz:quizzes) {
				if(quiz.gettitle().equals(quizTitle)) {
					System.out.println("Starting quiz: " + quiz.gettitle());
					Scanner sc=new Scanner(System.in);
					int score=0;
					for(Question q: quiz.getquestion()) {
						System.out.println(q.getQuestionText());
						List<String> option = q.getOptions();
						for(int i=0;i<option.size();i++) {
							System.out.println((i+1)+"."+option.get(i));
						}
						System.out.print("Your answer: ");
						int answer=sc.nextInt();
						if(q.checkanswer(answer-1)) {
							score++;
						}
					}
					System.out.println("You Scored: "+score+"/"+quiz.getquestion().size());		
				}
			}
		}	
}