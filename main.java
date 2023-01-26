import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String frase;
        float x;
        float y;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        frase = escaner.nextLine();

        System.out.println("Introduce un valor");
        x = escaner.nextInt();
        System.out.println("Introduce otro valor");
        y = escaner.nextInt();
        System.out.println("La suma de tus números es: " + (x + y));
        System.out.println("La resta de tus números es: " + (x - y));
        System.out.println("La multiplicacion de tus números es: " + (x * y));
        System.out.println("La division de tus números es: " + (x / y));

        if (x > y) {
            System.out.println(x + " es mayor que " + y);
        } else if (x < y) {
            System.out.println(x + " es menor que " + y);
        } else {
            System.out.println("Son iguales");
        }

        float z;
        System.out.println("Introduce un tercer valor");
        z = escaner.nextInt();

        if (x > y && x > z && z > y) {
            System.out.println("El orden es " + x + ", " + z + ", " + y);
        }
        if (x > y && x > z && y > z) {
            System.out.println("El orden es " + x + ", " + y + ", " + z);
        }
        if (z > y && z > x && x > y) {
            System.out.println("El orden es " + z + ", " + x + ", " + y);
        }
        if (z > y && z > x && y > x) {
            System.out.println("El orden es " + z + ", " + y + ", " + x);
        }
        if (y > x && y > z && x > z) {
            System.out.println("El orden es " + y + ", " + x + ", " + z);
        }
        if (y > x && y > z && z > x) {
            System.out.println("El orden es " + y + ", " + z + ", " + x);
        }
        if (y==x || y==z){
            if(x==z){
                System.out.println("Los valores son iguales");
            }
            if(z>x){
                System.out.println("Son "+x+ " y " +y+ "menores que "+z);
            }
            else{
                System.out.println("Son "+x+ " y " +y+ "menores que "+z);
            }
        }
        if (x==z){
            if(y==z){
                System.out.println("Los valores son iguales");
            }
            if(z>y){
                System.out.println("Son "+x+ " y " +z+ "menores que "+y);
            }
            if(z<y){
                System.out.println("Son "+x+ " y " +y+ "menores que "+z);
            }
            if(y>x){
                System.out.println("Son "+z+ " y " +y+ "menores que "+x);
            }
            else{
                System.out.println("Son "+x+ " y " +y+ "menores que "+y);
            }
        }

        if(frase.contains("m")) {
            System.out.println("La frase contiene m");
            if (frase.contains("b")) {
                System.out.println("La frase contiene b");
                if (frase.contains("y")) {
                    System.out.println("La frase contiene y");
                }
            }
            if (frase.contains("y")) {
                System.out.println("La frase contiene y");
                if (frase.contains("b")) {
                    System.out.println("La frase contiene b");
                }
            }
        }
        if(frase.contains("b")) {
            System.out.println("La frase contiene b");
            if (frase.contains("m")) {
                System.out.println("La frase contiene m");
                if (frase.contains("y")) {
                    System.out.println("La frase contiene y");

                }
            }
            if (frase.contains("y")) {
                System.out.println("La frase contiene y");
                if (frase.contains("m")) {
                    System.out.println("La frase contiene m");
                }
            }
        }
        if(frase.contains("y")){
            System.out.println("La frase contiene y");
            if(frase.contains("b")) {
                System.out.println("La frase contiene b");
                if (frase.contains("m")) {
                    System.out.println("La frase contiene m");
                }
            }
            if (frase.contains("m")) {
                System.out.println("La frase contiene m");
                if(frase.contains("b")) {
                    System.out.println("La frase contiene b");
                }
            }
        }
    }
}
