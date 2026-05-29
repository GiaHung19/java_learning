package student_manager.services;

import student_manager.models.Student;
import java.util.*;

public class StudentManager {

    // ArrayList: luu danh sach sinh vien (theo thu tu them vao)
    private ArrayList<Student> students = new ArrayList<>();

    // HashMap: tim nhanh sinh vien theo ID (O(1))
    private HashMap<String, Student> studentById = new HashMap<>();

    // TreeSet: danh sach sinh vien sap xep theo ten (tu dong sort)
    private TreeSet<Student> studentsByName = new TreeSet<>();

    // HashSet: luu danh sach ID (kiem tra trung ID nhanh)
    private HashSet<String> usedIds = new HashSet<>();

    // TreeMap: luu diem trung binh theo ten (sap xep)
    private TreeMap<String, Double> gradesByName = new TreeMap<>();

    // ===== THEM SINH VIEN =====
    public void addStudent(String id, String name) {
        // Kiem tra ID trung
        if (usedIds.contains(id)) {
            System.out.println("Loi: ID " + id + " da ton tai!");
            return;
        }

        Student student = new Student(id, name);
        students.add(student);               // them vao ArrayList
        studentById.put(id, student);        // them vao HashMap
        studentsByName.add(student);         // them vao TreeSet (tu dong sort)
        usedIds.add(id);                     // them vao HashSet
        System.out.println("Them sinh vien thanh cong: " + name);
    }

    // ===== THEM DIEM =====
    public void addGrade(String id, double grade) {
        Student student = studentById.get(id);  // tim nhanh theo ID
        if (student == null) {
            System.out.println("Loi: Khong tim thay ID " + id);
            return;
        }

        student.addGrade(grade);
        updateAverageGrade(student);  // cap nhat diem TB
        System.out.println("Them diem " + grade + " cho " + student.getName());
    }

    // Cap nhat diem trung binh trong TreeMap
    private void updateAverageGrade(Student student) {
        gradesByName.put(student.getName(), student.getAverageGrade());
    }

    // ===== HIEN THI DANH SACH =====
    public void displayAllStudents() {
        System.out.println("\n--- Danh sach tat ca sinh vien (theo thu tu them vao) ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void displayStudentsByName() {
        System.out.println("\n--- Danh sach sinh vien (sap xep theo ten) ---");
        for (Student s : studentsByName) {
            System.out.println(s);
        }
    }

    // ===== TIM SINH VIEN =====
    public void findStudentById(String id) {
        Student student = studentById.get(id);  // HashMap -> O(1)
        if (student != null) {
            System.out.println("\nTim thay: " + student);
        } else {
            System.out.println("Khong tim thay sinh vien co ID: " + id);
        }
    }

    // ===== THONG KE =====
    public void showTopStudents(int n) {
        System.out.println("\n--- Top " + n + " sinh vien co diem cao nhat ---");

        // PriorityQueue: lay n sinh vien co diem cao nhat
        // Dung Comparator dao nguoc (descending)
        PriorityQueue<Student> topStudents = new PriorityQueue<>(
                (a, b) -> Double.compare(b.getAverageGrade(), a.getAverageGrade())
        );

        topStudents.addAll(students);

        int count = 0;
        while (!topStudents.isEmpty() && count < n) {
            System.out.println(topStudents.poll());
            count++;
        }
    }

    public void showStudentsByGrade() {
        System.out.println("\n--- Danh sach diem trung binh (sap xep theo ten) ---");
        for (Map.Entry<String, Double> entry : gradesByName.entrySet()) {
            System.out.printf("%s: %.2f\n", entry.getKey(), entry.getValue());
        }
    }

    public void showStatistics() {
        System.out.println("\n--- Thong ke ---");
        System.out.println("Tong so sinh vien: " + students.size());
        System.out.println("So sinh vien danh dau trong HashSet: " + usedIds.size());

        // Dem so sinh vien theo xep loai
        HashMap<String, Integer> classificationCount = new HashMap<>();
        for (Student s : students) {
            String clf = s.getClassification();
            classificationCount.put(clf, classificationCount.getOrDefault(clf, 0) + 1);
        }

        System.out.println("Phan loai sinh vien:");
        for (Map.Entry<String, Integer> entry : classificationCount.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " sinh vien");
        }
    }

    // ===== XOA SINH VIEN =====
    public void removeStudent(String id) {
        Student student = studentById.get(id);
        if (student != null) {
            students.remove(student);
            studentById.remove(id);
            studentsByName.remove(student);
            usedIds.remove(id);
            gradesByName.remove(student.getName());
            System.out.println("Da xoa sinh vien: " + student.getName());
        } else {
            System.out.println("Khong tim thay sinh vien co ID: " + id);
        }
    }
}
