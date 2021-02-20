import java.util.Scanner;
import java.lang.Math;

public class main {
    public static void main (String [ ] args) {

        ejercicios1y2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
        ejercicio11();
        ejercicio12();
    }
    public static void ejercicios1y2(){
        double var1;
        double var2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese valor de la variable 1");
        var1 = teclado.nextDouble();

        System.out.println("Ingrese valor de la variable 2");
        var2 = teclado.nextDouble();

        if(var1>var2)
            System.out.println("El valor de la primera variable es mayor");
        else if(var1==var2)
            System.out.println("Ambas variables tienen igual valor");
        else
            System.out.println("La segunda variable es mayor");
    }

    public static void ejercicio3(){
        Scanner teclado = new Scanner(System.in);
        double radio;
        double area;
        double pi = Math.PI;

        System.out.println("Ingrese valor del radio");
        radio = teclado.nextDouble();
        area = (pi*(radio*radio));

        System.out.println("El area del circulo es: "+area);
    }
    public static void ejercicio4(){
        Scanner teclado = new Scanner(System.in);
        double valor;
        double valorIVA;

        System.out.println("Ingrese el valor del producto");
        valor = teclado.nextDouble();

        valorIVA = valor*(valor*0.21);

        System.out.println("El valor con IVA del producto es: "+valorIVA);
    }

    public static void ejercicio5() {
        int i = 1;
        System.out.println("Números impares");
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
        i=1;
        System.out.println("Números pares");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
    public static void ejercicio6() {
        System.out.println("Números impares");
       for (int i=1;i <= 100;i++){
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println("\n");
        System.out.println("Números pares");

        for (int i=1;i <= 100;i++){
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
    }
    public static void ejercicio7() {
        Scanner teclado = new Scanner(System.in);
        double numero;
        do {

            System.out.println("Ingrese el numero");
            numero = teclado.nextDouble();

        }while (numero<0);
        System.out.println("El numero es: "+numero);
    }

    public static void ejercicio8() {
        Scanner teclado = new Scanner(System.in);
        String dia;
        System.out.println("Ingrese un día de la semana lunes, martes, miercoles, jueves, viernes, sabado o domingo");
        dia = teclado.nextLine();
        switch (dia) {
            case "lunes", "jueves", "martes", "miercoles", "viernes", "sabado" -> System.out.println("Es un día laboral");
            case "domingo" -> System.out.println("Es un día NO laboral");
        }
    }
    public static void ejercicio9() {
        String texto = "La sonrisa sera la mejor arma contra la tristeza";
        Scanner teclado = new Scanner(System.in);
        String texto2;
        System.out.println("Ingrese texto para concatenar");
        texto2 = teclado.nextLine();
            System.out.println(texto.replace("a", "e")+texto2);
    }
    public static void ejercicio10() {
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese texto");
        texto = teclado.nextLine();
        System.out.println(texto.replace(" ", ""));
    }
    public static void ejercicio11() {
        String texto;
        int cont=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese texto");
        texto = teclado.nextLine();

        for (int x=0;x<texto.length();x++) {
            if(texto.charAt(x)=='a'||texto.charAt(x)=='e'||texto.charAt(x)=='i'||texto.charAt(x)=='o'||texto.charAt(x)=='u')
            cont++;
        }
        System.out.println("La longitud de la frase es: "+texto.length());
        System.out.println("El numero de vocales es: "+ cont);
    }
    public static void ejercicio12() {
        String texto1;
        String texto2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese texto 1");
        texto1 = teclado.nextLine();
        System.out.println("Ingrese texto 2");
        texto2 = teclado.nextLine();
        if(texto1.equals(texto2)){
            System.out.println("Ambos textos son iguales");
        }


    }

}
