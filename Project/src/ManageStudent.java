import java.util.*;

public class ManageStudent{
    public ArrayList<Student> listStudent;

    public ManageStudent() {
        listStudent = new ArrayList<>();
    }
    public void addStudent(Student s){
        for(int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getID() == s.getID()) {
                listStudent.remove(i);
                listStudent.add(i, s);
                return;
            }
        }
        listStudent.add(s);
    }
    public void editStudentById(int id, Student s){
        for(int i = 0; i < listStudent.size(); i++) {
            if(listStudent.get(i).getID() == id) {
                listStudent.remove(i);
                listStudent.add(i, s);
                break;
            }
        }

    }
    public void deleteStudent(int id){
       for(int i = 0; i < listStudent.size(); i++) {
           if(listStudent.get(i).getID() == id) {
               listStudent.remove(i);
               break;
           }
       }
    }
    public void sortStudentByGpa() {
        for(int i = 0; i < listStudent.size() - 1; i++) {
            for(int j = i + 1; j < listStudent.size() ; j++) {
                if(listStudent.get(i).getGpa() < listStudent.get(j).getGpa()) {
                    Collections.swap(listStudent,i,j);
                }
            }
        }
    }
    public void sortStudentByName() {
        Collections.sort(listStudent);
    }
    public void showAllStudent() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i).getID()  + "\t" + listStudent.get(i).getName());
        }
    }

}
