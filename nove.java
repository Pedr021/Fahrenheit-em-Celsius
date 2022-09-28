import java.util.Scanner;

public class nove {
    public static void main(String[] args) throws Exception {
        
        Scanner leia = new Scanner (System.in);
        int fire, graus;
        System.out.println("Digite a temperatura em Fahrenheit! ");
        fire = leia.nextInt();
        graus = 5 * ((fire - 32) / 9);
        System.out.println( fire + " Fahrenheit é: " + graus + " em graus Celsius");
    }
    }
    
