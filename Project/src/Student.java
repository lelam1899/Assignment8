//Viết chương trình quản lý sinh viên. Mỗi đối tượng sinh viên có các thuộc tính sau:
//        id, name, age, address và gpa (điểm trung bình).
//1. Add student. 
//        2. Edit student by id.
//         3. Delete student by id. 
//        4. Sort student by gpa. 
//        5. Sort student by name. 
//        6. Show student. 
//        0. Exit.

public class Student implements Comparable<Student>{
    private int ID;
    private String name;
    private int age;
    private String address;
    private float gpa;

    public Student() {

    }
    public Student(int ID, String name, int age, String address, float gpa) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int compareTo(Student s) {
        return this.name.compareTo(s.getName());
    }
    public int compareTo(float f){
        return this.getGpa() < f ? 1 : 0;
    }

}
