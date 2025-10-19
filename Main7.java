import java.sql.*;
import java.util.*;

public class Main7 {
    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USER = "root";
    static final String PASS = "MySQL@1234"; // change if needed

    static class Student {
        int id;
        String name;
        int age;
        String course;

        Student(int id, String name, int age, String course) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.course = course;
        }

        Student(String name, int age, String course) {
            this.name = name;
            this.age = age;
            this.course = course;
        }
    }

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("\n===== Student Management System =====");
                System.out.println("1. Add Student");
                System.out.println("2. View All Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int ch = sc.nextInt();

                if (ch == 1) {
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Course: ");
                    String course = sc.next();

                    PreparedStatement ps = con.prepareStatement(
                        "INSERT INTO student(name, age, course) VALUES (?, ?, ?)");
                    ps.setString(1, name);
                    ps.setInt(2, age);
                    ps.setString(3, course);
                    ps.executeUpdate();
                    System.out.println("✅ Student added successfully!");
                }

                else if (ch == 2) {
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery("SELECT * FROM student");
                    System.out.println("\nID\tName\tAge\tCourse");
                    System.out.println("--------------------------------");
                    while (rs.next()) {
                        System.out.println(rs.getInt("id") + "\t" +
                                           rs.getString("name") + "\t" +
                                           rs.getInt("age") + "\t" +
                                           rs.getString("course"));
                    }
                }

                else if (ch == 3) {
                    System.out.print("Enter Student ID to update: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new Course: ");
                    String newCourse = sc.next();
                    PreparedStatement ps = con.prepareStatement(
                        "UPDATE student SET course=? WHERE id=?");
                    ps.setString(1, newCourse);
                    ps.setInt(2, id);
                    int rows = ps.executeUpdate();
                    if (rows > 0)
                        System.out.println("✅ Student updated successfully!");
                    else
                        System.out.println("⚠️ No student found with that ID.");
                }

                else if (ch == 4) {
                    System.out.print("Enter Student ID to delete: ");
                    int id = sc.nextInt();
                    PreparedStatement ps = con.prepareStatement(
                        "DELETE FROM student WHERE id=?");
                    ps.setInt(1, id);
                    int rows = ps.executeUpdate();
                    if (rows > 0)
                        System.out.println("🗑️ Student deleted successfully!");
                    else
                        System.out.println("⚠️ No student found with that ID.");
                }

                else if (ch == 5) {
                    System.out.println("Exiting... Goodbye!");
                    break;
                }

                else {
                    System.out.println("Invalid choice!");
                }
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
