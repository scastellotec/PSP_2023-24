package ud0_presentation;

import java.util.ArrayList;

public class StudentRegistry {
    ArrayList<Student> classroom;

    public StudentRegistry() {
        this.classroom = new ArrayList<>();
    }

    public void addStudent(Student student){
        classroom.add(student);
    }

    public void showStudents(){
        for(int i=0; i< classroom.size(); i++){
            System.out.println(classroom.get(i));
        }
    }
}
