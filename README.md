# Resume Uploader

A simple Java console application for creating and exporting structured resume data.

This project is designed to practice object-oriented programming, modular package design, and basic file I/O using Java.

## Project Structure

The application is organized using the following packages:

- **generator**: contains `ResumeApp.java`, the main class that starts the application
- **input**: handles console input (`InputHandler.java`)
- **model**: defines the resume data model (`Resume.java`)
- **util**: provides helper classes such as `FileExporter.java` for file writing
- **view**: manages user interaction and messages (`Main.java`)

## Features

- Collects user input (name, email, etc.) via console
- Saves the collected information in a structured text file named `resume.txt`
- Demonstrates object-oriented programming and modular project design
- Implements basic file I/O in Java using standard libraries

## Requirements

- Java 17 or higher
- IntelliJ IDEA (or any other Java IDE)
- No external libraries required

## How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/Code-By-Reza/resume-uploader.git

