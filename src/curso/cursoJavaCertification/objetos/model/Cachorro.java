package curso.cursoJavaCertification.objetos.model;

import curso.cursoJavaCertification.Repository.Animal;

public class Cachorro implements Animal {

    @Override
    public void fazSom() {
        System.out.println("Au au");
    }

}
