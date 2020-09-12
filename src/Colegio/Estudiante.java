package Colegio;

import java.util.Arrays;
import java.util.Scanner;

public class Estudiante extends Participante {
    String name;
    String lastname;
    String classGroup;
    Scanner scanner = new Scanner(System.in);

    public Estudiante(String name, String lastname, String classGroup) {
        playerName = name;
        playerLastname = lastname;
        this.classGroup = classGroup;
        this.name = name;
        this.lastname = lastname;
    }

    public Estudiante(){}

    @Override
    public String toString() {
        return "Estudiante " +
                "Nombre: " + name +
                ", Apellido: " + lastname +
                ", Grupo: " + classGroup;
    }

    public boolean groupValidator(String studentGroup) {

        try {

            String groupLetter = studentGroup.split("°")[1];
            String[] groups = {"A", "B", "C", "D", "a", "b", "c", "d"};
            int indexGroup = Arrays.asList(groups).indexOf(groupLetter);

            if (indexGroup == -1) {
                return false;
            }

            if (Integer.parseInt(studentGroup.split("°")[0]) < 1 || Integer.parseInt(studentGroup.split("°")[0]) > 11) {
                return false;
            }

            return true;

        }catch (ArrayIndexOutOfBoundsException ex) {
            return false;
        }



    }
}
