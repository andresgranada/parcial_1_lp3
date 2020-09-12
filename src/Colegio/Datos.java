package Colegio;
import java.util.Scanner;

public class Datos {

    Estudiante studentClass = new Estudiante();
    Scanner scanner = new Scanner(System.in);
    Participante teacher;
    Participante student;

    public Datos() {
        teacherData();
        studentData();
    }


    public void teacherData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre del docente");
        String teacherName = scanner.nextLine();

        System.out.println("Apellido del docente");
        String teacherLastname = scanner.nextLine();

        System.out.println("Asignatura");
        String teacherSubject = scanner.nextLine();

        teacher = new Docente(teacherName,teacherLastname,teacherSubject);
    }

    public void studentData() {
        System.out.println("Nombre del estudiante");
        String studentName = scanner.nextLine();

        System.out.println("Apellido del estudiante");
        String studentLastname = scanner.nextLine();

        String studentGroup = askStudentGroup();

        boolean correctGroup = studentClass.groupValidator(studentGroup);

        while (!correctGroup) {
            System.out.println("El grupo es incorrecto. Vuelva a intentar");
            studentGroup = askStudentGroup();
            correctGroup = studentClass.groupValidator(studentGroup);
        }

        student = new Estudiante(studentName,studentLastname,studentGroup);
        winner();
    }

    public String askStudentGroup() {
        System.out.println("Grupo del estudiante");
        String studentGroup = scanner.nextLine();

        return  studentGroup;
    }

    public void winner() {
        if (student.randomNumber > teacher.randomNumber) {
            System.out.println("El ganador fue:");
            System.out.println(student + " con el número " + student.randomNumber);

            return;
        }

        if (student.randomNumber < teacher.randomNumber) {
            System.out.println("El ganador fue:");
            System.out.println(teacher + " con el número " + teacher.randomNumber);


            return;
        }

        student.getRandomNumber();
        teacher.getRandomNumber();
        winner();
    }
}
