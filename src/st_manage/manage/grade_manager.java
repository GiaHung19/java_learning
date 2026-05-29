package st_manage.manage;
import st_manage.student.Student;
import java.util.*;


public class grade_manager {
    private ArrayList<Student> listStudents =new ArrayList<>();
    private HashMap<String,Double> Board=new HashMap<>();
    //add a student to list:
    public void addStudent(String name,Double score){
        listStudents.add(new Student(name, score));
        Board.put(name, score);
    }
    //sort by ascending:
    public void sort_grade(){
        listStudents.sort((a, b) -> Double.compare(b.getScore(), a.getScore()));
    }
    //print students:
    public void printAll(){
        System.out.println("List Students:");
        for(int i=0;i<listStudents.size();i++){
            System.out.println((i+1)+"."+listStudents.get(i));
        }
    }

    //Search:
    public void Search(String name){
        System.out.println("-------Search-------");
        if(Board.containsKey(name)){
            System.out.println("result :"+name+"-"+Board.get(name));
        }
        else{
            System.out.println("No result");
        }
    }

}
