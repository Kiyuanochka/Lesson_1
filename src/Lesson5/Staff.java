package Lesson5;

public class Staff {


    String name;
    String profession;
    String email;
    String tel;
    double earn;
    int age;

    public Staff(String nameStaff, String professionStaff, String emailStaff, double earnStaff, int ageStaff){
    name = nameStaff;
    profession = professionStaff;
    email = emailStaff;
    earn = earnStaff;
    age = ageStaff;
    }
    public void print(){
        System.out.println("[ " + name + ", " + profession + ", " +  email+ ", " + earn + ", " + age + "]");
    }

}
