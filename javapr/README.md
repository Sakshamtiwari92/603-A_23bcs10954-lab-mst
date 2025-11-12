# Java Practicals (javapr)

This folder contains Java practical programs for the course/repository "603-A_23bcs10954-lab-mst". The programs are small, self-contained Java exercises used for lab work and learning core Java concepts.

## Location

- Path: javapr/

## Prerequisites

- Java Development Kit (JDK) 8 or later installed.
- Basic knowledge of compiling and running Java from the command line.

## How to compile and run

1. Open a terminal and change to the javapr directory:
   cd javapr

2. Compile a single program:
   javac Example.java

3. Compile all Java files in the directory:
   javac *.java

4. Run a compiled program (use the class name containing main):
   java Example

Replace "Example" with the actual class name you want to run.

## Project structure

- Each exercise is provided as a separate .java file. File names generally match their public class names.
- If a program depends on other classes in the folder, compile them together (javac *.java).
User Input:

User enters personal details: Name, Age, Gender, Location.

User selects up to three symptoms from a dropdown list.

Symptom Selection Handling:

The system prevents duplicate symptom selection to ensure accurate diagnosis.

Diagnosis Process:

The app compares the selected symptoms with a predefined disease dataset.

Matches are identified where all selected symptoms correspond to a disease.

Result Generation:

Displays disease name, treatment suggestions, and prevention tips.

If no match is found, advises the user to consult a doctor.

Location-Based Recommendations:

Provides Google Maps links to nearby hospitals or medical shops based on symptoms and location.

User Interface:

Built using Java Swing with a clean and responsive GUI.

Includes input forms, dropdowns, and a scrollable results area for diagnosis outcomes.

Dataset Management:

Uses a hardcoded dataset of common diseases and associated symptoms, treatments, and prevention methods.

Overall Goal:

Helps users get a quick preliminary assessment of their health.

Promotes awareness of possible diseases and encourages timely medical consultation.
## Style and conventions

- Follow standard Java naming conventions: PascalCase for class names, camelCase for methods and variables.
- Keep each public class in its own .java file named after the class.

## Troubleshooting

- If you see "NoClassDefFoundError" or "ClassNotFoundException", ensure you run java from the directory containing the compiled .class files and use the correct class name.
- If compilation fails, read the compiler errors; they usually indicate the file and line number with the problem.

## Contributing

- If you want to add new practicals, create a new .java file with a clear name and include a brief comment at the top describing the exercise.
- Open an issue or a pull request in the repository with a description of your addition.

## Contact

- Repository owner / maintainer: @Sakshamtiwari92

## License

- This repository currently has no license specified. Add a LICENSE file if you want to set one.
