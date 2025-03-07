import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TratamentoExcecoes {
    public static void main(String[] args) {

        try {
            int resultado = 10 / 0;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("vc tentou divisão por 0, não pode");
        }

        try {
            Scanner scanner = new Scanner(new File("arquivo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
    }
}
