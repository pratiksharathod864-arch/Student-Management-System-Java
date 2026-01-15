import java.util.ArrayList;
import java.util.Scanner;

class Student 
{
int id;
String name;
Student(int id, String name) 
{
this.id = id;
this.name = name;
}
}
public class StudentManagementSystem 
{
static ArrayList<Student> students = new ArrayList<>();
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) 
{
int choice;
do
{
System.out.println("\n--- Student Management System ---");
System.out.println("1. Add Student");
System.out.println("2. View Students");
System.out.println("3. Search Student");
System.out.println("4. Delete Student");
System.out.println("5. Exit");
System.out.print("Enter choice: ");
choice = sc.nextInt();
switch (choice) 
{
case 1: addStudent(); break;
case 2: viewStudents(); break;
case 3: searchStudent(); break;
case 4: deleteStudent(); break;
case 5: System.out.println("Thank you!"); break;
default: System.out.println("Invalid choice");
}
}
while (choice != 5);
}
static void addStudent() {
System.out.print("Enter ID: ");
int id = sc.nextInt();
sc.nextLine();
System.out.print("Enter Name: ");
String name = sc.nextLine();
students.add(new Student(id, name));
System.out.println("Student Added Successfully!");
}
static void viewStudents() 
{
if (students.isEmpty()) {
System.out.println("No students found.");
return;
}
for (Student s : students) {
System.out.println("ID: " + s.id + ", Name: " + s.name);
}
}
static void searchStudent() {
System.out.print("Enter ID to search: ");
int id = sc.nextInt();
for (Student s : students) {
if (s.id == id) {
System.out.println("Student Found: " + s.name);
return;
}
}
System.out.println("Student not found.");
}
static void deleteStudent() {
System.out.print("Enter ID to delete: ");
int id = sc.nextInt();
for (Student s : students) {
if (s.id == id) {
students.remove(s);
System.out.println("Student deleted successfully!");
return;
}
}
System.out.println("Student not found.");
}
}
