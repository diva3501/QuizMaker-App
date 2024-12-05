import java.util.*;
public class Main {
		public static void main(String[] args) {
			QuizManager manager=new QuizManager();
			manager.registeruser("admin","admin123", "Admin");
			manager.registeruser("user1", "password", "User");
			
			Scanner sc=new Scanner(System.in);
			User loggedInUser=null;
			
			while(true) {
				if(loggedInUser==null) {
					System.out.println("1. Login\n2. Exit");
					int choice=sc.nextInt();
					sc.nextLine();
					
					if(choice==1) {
						System.out.print("Username: ");
	                    String username = sc.nextLine();
	                    System.out.print("Password: ");
	                    String password = sc.nextLine();
	                    
	                    loggedInUser=manager.login(username, password);
	                    
	                    if(loggedInUser!=null) {
	                    	System.out.println("Welcome " + loggedInUser.getUsername() + "!");
	                    }
	                    else {
	                    	System.out.println("Invalid credentials.");
	                    }
					}
					else {
						break;
					}
				}
				else {
					if(loggedInUser.getRole().equals("Admin")) {
						System.out.println("1. Create Quiz\n2. Add Question to Quiz\n3. Logout");
						int choice = sc.nextInt();
	                    sc.nextLine();
	                    
	                    if(choice==1) {
	                    	System.out.print("Quiz Title: ");
	                        String title = sc.nextLine();
	                        manager.createQuiz(title);
	                    }
	                    else if(choice==2){
	                    	System.out.print("Quiz Title: ");
	                        String title = sc.nextLine();
	                        System.out.print("Question Text: ");
	                        String text = sc.nextLine();
	                        System.out.println("Enter options separated by comma: ");
	                        String[] options = sc.nextLine().split(",");
	                        System.out.print("Correct option index (1-based): ");
	                        int correctOption = sc.nextInt() - 1;
	                        
	                        manager.addQuestionToQuiz(title, new Question(text,Arrays.asList(options),correctOption));
	                    }
	                    else if(choice==3) {
	                    	loggedInUser=null;
	                    }
					}else {
	                    System.out.println("1. Take Quiz\n2. Logout");
	                    int choice = sc.nextInt();
	                    sc.nextLine();

	                    if (choice == 1) {
	                        System.out.print("Quiz Title: ");
	                        String title = sc.nextLine();
	                        manager.takeQuiz(loggedInUser, title);
	                    } else if (choice == 2) {
	                        loggedInUser = null;
	                    }
	                }
				}
			}	

		}
}
