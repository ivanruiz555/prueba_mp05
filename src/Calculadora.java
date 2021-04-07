import java.util.Scanner;
public class Calculadora {
    /* Saludos Olimpia */
    public static void main(String[] args)
    {
        System.out.println("indica el primer y segundo numero de la operación:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1 = inp.nextInt();
        num2 = inp.nextInt();

        System.out.println("Indica la operación:1-Suma 2-Resta 3-multiplicación 4-división");
        int eleccion;
        eleccion = inp.nextInt();
        switch (eleccion){
        case 1 -> System.out.println("El resultado es:"+add( num1,num2));
        case 2 -> System.out.println("El resultado es:"+sub( num1,num2));
        case 3 -> System.out.println("El resultado es:"+mult( num1,num2));
        case 4 -> System.out.println("El resultado es:"+div( num1,num2));
            default -> System.out.println("Operación inválida");
        }
    }
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

}

