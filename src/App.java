import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        double area;
        double raio;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o raio do circulo: ");
        raio = teclado.nextDouble();

        area = Math.PI * raio;

        System.out.println("A area é: " + area);
    }
}

