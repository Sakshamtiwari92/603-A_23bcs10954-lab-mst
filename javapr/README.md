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
