# Resume Generator

A simple Java command-line application to generate structured resume files.  
This project is designed to practice object-oriented programming, clean package structure, and basic file handling in Java.

## Project Structure

The application follows a modular structure using packages:

- **generator**: contains the `ResumeApp.java` – the main class that starts the application.
- **input**: responsible for handling user input (`InputHandler.java`).
- **model**: contains the `Resume.java` class representing the resume data model.
- **util**: utility classes, including `FileExporter.java` for exporting data to text files.
- **view**: presentation logic, such as user interaction messages (`Main.java`).

## Features

- Collects personal and professional data via console
- Saves the data in a text file named `resume.txt`
- Clean and organized package structure
- Demonstrates basic Java file I/O and object-oriented design

## Requirements

- Java 17
- IntelliJ IDEA or any other Java IDE
- No external dependencies

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/YOUR_USERNAME/resume-generator-cli.git
