import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        float sal;
        int num1,num2;
        do {
            System.out.println("elige una opcion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. multiplicacion");
            System.out.println("4. Divicion");
            System.out.println("5. salir del programa");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("ingrese el primer numero");
                    num1= scanner.nextInt();
                    System.out.println("ingrese el segundo numero");
                    num2= scanner.nextInt();
                    sal=num1*num2;
                    System.out.println("el resultado de la multiplicacion es "+sal);
                    break;
                case 4:
                    System.out.println("ingrese el primer numero");
                    num1= scanner.nextInt();
                    System.out.println("ingrese el segundo numero");
                    num2= scanner.nextInt();
                    sal=num1*num2;
                    System.out.println("el resultado de la divicion es "+sal);
                    break;
                case 5:
                    System.out.println("saliendo del sistema");
                    System.out.println(".........");
                    break;
            }
            System.out.println();
        } while (opcion != 5);
        scanner.close();
    }
}