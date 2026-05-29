package student_manager.models;

import java.util.ArrayList;

public class Student implements Comparable<Student> {
    private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public ArrayList<Double> getGrades() { return grades; }

    // Thêm điểm
    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10) {
            grades.add(grade);
        }
    }

    // Tính điểm trung bình
    public double getAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }

    // Xếp loại
    public String getClassification() {
        double avg = getAverageGrade();
        if (avg >= 8.5) return "Gioi";
        if (avg >= 7.0) return "Kha";
        if (avg >= 5.5) return "Trung binh";
        if (avg >= 4.0) return "Yeu";
        return "Kem";
    }

    // So sanh dung trong sort (TreeSet, sort...)
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Ten: %s | DTB: %.2f | %s",
                id, name, getAverageGrade(), getClassification());
    }
}
