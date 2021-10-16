package lab1.task2;

public class Test {
    public static void main(String[] args){
        Course course = new Course();
        course.setTitle("POO");
        course.setDescription("programare orientata pe obiecte");

        Student[] students = new Student[3];

        students[0] = new Student();
        students[0].setName("Ana");
        students[0].setYear(2);

        students[1] = new Student();
        students[1].setName("Adrian");
        students[1].setYear(3);

        students[2] = new Student();
        students[2].setName("Sofia");
        students[2].setYear(2);

        course.setStudents(students);

        if(args.length <= 0){
            System.exit(2);
        }

        int aux = Integer.parseInt(args[0]);
        System.out.println(course.filterYear(aux, course));

        //Task 3:
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setYear(1);
        s2.setYear(1);
        s1.setName("student");
        s2.setName("student");
        System.out.println(s1.equals(s2));
    }
}
