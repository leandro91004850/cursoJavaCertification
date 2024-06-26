package curso.cursoJavaCertification.objetos.model;

public class Course {
    String name;
    static int count = 0;

    public Course(String name) {
        this.name = name;
        count++;
    }


}
