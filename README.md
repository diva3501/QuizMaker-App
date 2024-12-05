# QuizMaker-App

A simple console-based application built in Java that allows users to create, manage, and take quizzes. This application supports both admin and user roles for quiz management and participation.

## Features

1. **User Authentication**  
   - Login and Registration for Admins and Users.

2. **Role-based Functionality**  
   - Admins can create quizzes and add questions.  
   - Users can take quizzes and view their scores.

3. **Quiz Creation and Management**  
   - Admins can create quizzes with multiple questions and options.

4. **Take Quiz**  
   - Users can attempt quizzes and see their results immediately.

5. **Score Display**  
   - Displays the score at the end of the quiz.

## Technology Stack

- **Language**: Java  
- **IDE**: Eclipse (or any Java-compatible IDE)  
- **Libraries/Dependencies**: No external libraries, uses Java Collections Framework.

## Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- Eclipse IDE (or any other Java IDE).
- Git (optional, for cloning the repository).

### Steps to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/your-username/quizmaker-app.git
   ```
   
2. **Import Project into Eclipse**:
   - Open Eclipse.
   - Select `File > Import > Existing Projects into Workspace`.
   - Browse to the cloned repository folder and click **Finish**.

3. **Run the Application**:
   - Right-click on `Main.java`.
   - Select `Run As > Java Application`.

## How to Use

### 1. Login or Register
- **Admins**: Can create and manage quizzes.
- **Users**: Can take quizzes and view results.

### 2. Admin Features
- Create a new quiz.
- Add questions to an existing quiz.

### 3. User Features
- Take a quiz.
- View the score upon quiz completion.

## Project Structure

```
QuizMakerApp/
├── src/
│   ├── quizmaker/
│   │   ├── Main.java
│   │   ├── Quiz.java
│   │   ├── QuizManager.java
│   │   ├── Question.java
│   │   └── User.java
└── README.md
```

## Future Enhancements

- Add a graphical user interface (GUI) using JavaFX.
- Persist user and quiz data using a database (e.g., MySQL).
- Add analytics for quiz performance.
- Implement a timer for quizzes.

## Contributing

Contributions are welcome! Feel free to submit a pull request or open an issue to suggest improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

- **Author**: Divakar G  
- **Email**: divakar3501@gmail.com  

