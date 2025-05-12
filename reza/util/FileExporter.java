package reza.util;

import reza.model.Resume;
import java.io.FileWriter;
import java.io.IOException;

// This class handles exporting resume data to a text file
public class FileExporter {

    public static void exportToFile(Resume resume, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("=== Resume ===\n");
            writer.write("Full Name: " + resume.getFullName() + "\n");
            writer.write("Email: " + resume.getEmail() + "\n");
            writer.write("Phone: " + resume.getPhoneNumber() + "\n");
            writer.write("Summary: " + resume.getSummary() + "\n");
            writer.write("Skills: " + String.join(", ", resume.getSkills()) + "\n");
            writer.write("Experience: " + resume.getExperience() + "\n");
            writer.write("Education: " + resume.getEducation() + "\n");
        } catch (IOException e) {
            System.out.println("Error while exporting the resume: " + e.getMessage());
        }
    }
}
