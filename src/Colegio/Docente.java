package Colegio;

public class Docente extends Participante {
    String name;
    String lastname;
    String subject;

    public Docente(String teacherName, String teacherLastname, String teacherSubject) {
        playerName = teacherName;
        playerLastname = teacherLastname;
        this.subject = teacherSubject;
        this.name = teacherName;
        this.lastname = teacherLastname;
    }

    @Override
    public String toString() {
        return "Docente " +
                "Nombre: " + name +
                ", Apellido: " + lastname +
                ", Asignatura " + subject;
    }
}
