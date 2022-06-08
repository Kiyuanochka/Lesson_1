package Lesson5;

public class lesson5 {
    public static void main(String[] args) {

        Staff staff1 = new Staff("GFR", "accountant", "dd@mail.ru", 45, 40);
        Staff staff2 = new Staff("YUH", "master", "eg@mail.ru", 40.5, 60);
        Staff staff3 = new Staff("VFR", "worker", "as@mail.ru", 37, 25);
        Staff staff4 = new Staff("LKI", "director", "qw@mail.ru", 89, 38);
        Staff staff5 = new Staff("FJU", "cleaner", "11@mail.ru", 20, 50);

        Staff[] staffs = {staff1, staff2, staff3, staff4, staff5};
        for (int i =0; i < staffs.length; i++){
            staffs[i].print();
        }
        System.out.println();

        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i].age > 40){
            staffs[i].print();
        }
        }




    }
}
