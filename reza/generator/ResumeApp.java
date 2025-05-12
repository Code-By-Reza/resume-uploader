package reza.generator;

import reza.input.InputHandler;
import reza.model.Resume;
import reza.util.FileExporter;
import java.util.Arrays;

/**
 * This is the main class that runs the resume generator application.
 */
public class ResumeApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Resume Generator!");

        // Create a Resume object
        Resume resume = new Resume();

        // Create InputHandler object
        InputHandler inputHandler = new InputHandler();

        // Ask user to input all fields using InputHandler
        resume.setFullName(inputHandler.getInput("Enter your full name:"));
        resume.setEmail(inputHandler.getInput("Enter your email:"));
        resume.setPhoneNumber(inputHandler.getInput("Enter your phone number:"));
        resume.setSummary(inputHandler.getInput("Enter a short summary or objective:"));
        resume.setEducation(inputHandler.getInput("Enter your education background:"));
        resume.setExperience(inputHandler.getInput("Enter your work experience:"));
        resume.setSkills(Arrays.asList(inputHandler.getInput("Enter your skills (comma-separated):").split(",\s*")));

        // Display the formatted resume
        System.out.println("\n--- Generated Resume ---\n");
        System.out.println(resume.formatResume());

        // Export resume to file
        FileExporter.exportToFile(resume, "resume.txt");
    }
}


