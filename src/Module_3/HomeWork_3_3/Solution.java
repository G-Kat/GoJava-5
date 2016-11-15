package Module_3.HomeWork_3_3;

import java.sql.Date;

/**
 * Created by guzya on 12.11.2016.
 */

public class Solution {

    Course maths = new Course(new Date(115, 8, 28), "Maths"); // указать дату
    Course biology = new Course(new Date(115, 8, 1), "Biology"); // указать дату
    Course chemistry = new Course("Chemistry", 80, "John Smith");
    Course polish = new Course("Polish", 100, "Lora Palmer");
    Course english = new Course("English", 120, "Christian Bale");

    Student fresh = new Student("Anthony", "Hopkins", 2);
    Student junior = new Student("Nicholson", new Course[]{polish, english});

    CollegeStudent student1 = new CollegeStudent("KMA", 86, 25025);
    CollegeStudent student2 = new CollegeStudent("Tom", "Hardy", 3);
    CollegeStudent student3 = new CollegeStudent("Nicholson", new Course[]{maths, biology, polish, english});

    SpecialStudent specialStudent1 = new SpecialStudent("Al", "Pacino", 10);
    SpecialStudent specialStudent2 = new SpecialStudent("Lucas", new Course[]{maths, biology, chemistry, polish});
    SpecialStudent specialStudent3 = new SpecialStudent(100500);


}


