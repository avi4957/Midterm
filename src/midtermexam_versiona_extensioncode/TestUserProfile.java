/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the User Profile Creation!");

        // Ask the user to enter their name
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // List of possible genres
        String[] genres = {"Action", "Romance", "Horror", "Sci-Fi", "Fantasy", "Comedy", "Drama"};

        // Display the genres
        System.out.println("Choose your favorite genre from the following list:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // Ask the user to choose a genre
        System.out.print("Enter the number of your favorite genre: ");
        int genreChoice = scanner.nextInt();

        // Validate the genre choice
        while (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid choice. Please choose a number between 1 and " + genres.length);
            genreChoice = scanner.nextInt();
        }

        // Get the chosen genre
        String favoriteGenre = genres[genreChoice - 1];

        // Display the user profile creation message
        System.out.println("Your user profile has been created!");
        System.out.println("Name: " + name);
        System.out.println("Favorite Genre: " + favoriteGenre);

        // Close the scanner
        scanner.close();
    }
}
