package dec6;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;

class Student {
 private String name;
 private int indexNo;
 private int age;

 public Student(String name, int indexNo, int age) {
     this.name = name;
     this.indexNo = indexNo;
     this.age = age;
 }

 public String getName() {
     return name;
 }

 public Student setName(String name) {
     this.name = name;
     return this;
 }
 
 public int getIndexNo() {
     return indexNo;
 }

 public Student setIndexNo(int indexNo) {
     this.indexNo = indexNo;
     return this;
 }

 public int getAge() {
     return age;
 }

 public Student setAge(int age) {
     this.age = age;
     return this;
 }
}



public class Demo {

 public static void main(String[] args) {
     List<String> names = List.of("Tristan","Matej","Jovan","Prohor","Edis");
     List<Student> students = names.stream().map(name -> createStudent(name, new Random().nextInt(10000) + 1, new Random().nextInt(13) + 18)).toList();

     for (Student s : students) {
         printValues(s);
         System.out.println();
     }
     
 }
 public static Student createStudent(String name, int indexNo, int age) {
     return new Student(name, indexNo, age);
 }

 public static void printValues(Student s) {
     System.out.println("Name: " + s.getName());
     System.out.println("Index No: " + s.getIndexNo());
     System.out.println("Age: " + s.getAge());
 }

}
