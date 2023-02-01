package curso.cursoJavaCertification.service.empresa;

public class Operadores {

    public void operacoesIncremento(){

        int x = 10;
        
        ++x;
        System.out.println("o valor de ++x = "+x);

        --x;
        System.out.println("O valor de --y = "  +x);
    }
    
    public void OperadoresDecrementoIncremento(){

        int z = 10, w = 5, a = 5;

        z = w ++;
        System.out.println("z = "+ z);
        System.out.println("w = "+ w);

        z = --a;
        System.out.println("z = "+ z);
        System.out.println("a = "+ a);
    }


}
