package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bienvenido a la resolución del taller2\n " +
                "por favor indique de cual inciso quiere ver la respuesta\n" +
                "las opciones son desde el 1 hasta el 4\n" +
                "Si dese salir presione 0");
        boolean n = true;
        while(n == true){
            int point= input.nextInt();
            switch (point){
                //punto1
                case 1:
                    Options punto1  = new Options();
                    punto1.option1();
                    break;
                //punto2
                case 2:
                    Options punto2  = new Options();
                    punto2.option2();
                    break;
                //punto3
                case 3:
                    Options punto3  = new Options();
                    punto3.option3();
                    break;
                //punto4
                case 4:
                    Options punto4  = new Options();
                    punto4.option4();
                    break;
                //punto5
                case 5:
                    Options punto5  = new Options();
                    punto5.option5();
                    break;
                //punto6
                case 6:
                    Options punto6  = new Options();
                    punto6.option6();
                    break;
                //punto7
                case 7:
                    Options punto7  = new Options();
                    punto7.option7();
                    break;
                //punto8
                case 8:
                    Options punto8  = new Options();
                    punto8.option8();
                    break;
                //punto9
                case 9:
                    Options punto9  = new Options();
                    punto9.option9();
                    break;
                //punto10
                case 10:
                    Options punto10  = new Options();
                    punto10.option10();
                    break;
                //Salir
                case 0:
                    n = false;
                    break;


            }
            if(n == true){
                System.out.println("Quiere seguir viendo más respuestas ? por favor indique de cual inciso quiere ver la respuesta\n" +
                        "las opciones son desde el 1 hasta el 4\n" +
                        "Si quiere salir del programa ingrese 0");

            }else{
                System.out.println("Graciasss");
            }

        }
    }
}