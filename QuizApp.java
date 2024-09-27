package com.quizapp;

import java.util.Scanner;

public class QuizApp {
	public static int score = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		// User Authentication
		System.out.println("Enter the username: ");
		String username = scanner.nextLine();

		if (username.isEmpty()) {
			System.out.println("User name can not be Empty, Please Enter username!");
			return;
		}
		System.out.println("Welcome, " + username + "!");

		score += askQuestion(scanner, 1, "What is the capital of France?", "Paris");
		score += askQuestion(scanner, 2, "What is 2 + 2?", "4");
		score += askQuestion(scanner, 3, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee");

		// Display score
		System.out.println("Your score is: " + score + " out of 3.");

		scanner.close();

	}

	public static int askQuestion(Scanner scanner, int questionNumber, String question, String correctAnswer) {
		System.out.println("Question " + questionNumber + ": " + question);
		String answer = scanner.nextLine();

		if (answer.equalsIgnoreCase(correctAnswer)) {
			System.out.println("Correct!");
			return 1;
		} else {
			System.out.println("Wrong! The correct answer was: " + correctAnswer);
			return 0;
		}
	}

}
