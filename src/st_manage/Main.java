package st_manage;
import st_manage.manage.grade_manager;
public class Main {
    public static void main(String[] args) {
        grade_manager mn=new grade_manager();

        mn.addStudent("GiaHung",10.0);
        mn.addStudent("Bin",9.0);
        mn.addStudent("GiaHuy",8.0);

        mn.sort_grade();

        mn.printAll();
        mn.Search("GiaHung");
    }
}
