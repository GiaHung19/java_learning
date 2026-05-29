package student_manager;

import student_manager.services.StudentManager;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        System.out.println("========== THEM SINH VIEN ==========");
        manager.addStudent("SV01", "Nguyen An");
        manager.addStudent("SV02", "Tran Binh");
        manager.addStudent("SV03", "Le Chi");
        manager.addStudent("SV04", "Pham Dung");
        manager.addStudent("SV05", "Hoang Em");

        System.out.println("\n========== THEM DIEM ==========");
        manager.addGrade("SV01", 8.5);
        manager.addGrade("SV01", 9.0);
        manager.addGrade("SV01", 8.0);

        manager.addGrade("SV02", 7.5);
        manager.addGrade("SV02", 7.0);
        manager.addGrade("SV02", 6.5);

        manager.addGrade("SV03", 6.0);
        manager.addGrade("SV03", 5.5);

        manager.addGrade("SV04", 9.5);
        manager.addGrade("SV04", 9.0);
        manager.addGrade("SV04", 10.0);

        manager.addGrade("SV05", 4.5);
        manager.addGrade("SV05", 3.5);

        manager.displayAllStudents();
        manager.displayStudentsByName();

        System.out.println("\n========== TIM KIEM ==========");
        manager.findStudentById("SV03");
        manager.findStudentById("SV999");  // Khong ton tai

        manager.showTopStudents(3);
        manager.showStudentsByGrade();

        manager.showStatistics();

        System.out.println("\n========== XOA SINH VIEN ==========");
        manager.removeStudent("SV05");
        manager.displayAllStudents();
    }
}
