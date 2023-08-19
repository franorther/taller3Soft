package org.example;

import org.example.punto1.Circulo;
import org.example.punto1.Cuadrado;
import org.example.punto1.Triangulo;
import org.example.punto10.Circuloe;
import org.example.punto10.Lienzo;
import org.example.punto10.Rectanguloe;
import org.example.punto10.interfaces.Dibujable;
import org.example.punto2.Email;
import org.example.punto2.NotificacionPush;
import org.example.punto2.TextMessage;
import org.example.punto2.interfaces.Notification;
import org.example.punto3.CuentaAhorro;
import org.example.punto3.CuentaCorriente;
import org.example.punto3.interfaces.CuentaBancaria;
import org.example.punto4.Baraja;
import org.example.punto4.interfaces.Carta;
import org.example.punto5.Camiseta;
import org.example.punto5.Smartphone;
import org.example.punto5.interfaces.Producto;
import org.example.punto6.Animal;
import org.example.punto6.Gato;
import org.example.punto6.Pajaro;
import org.example.punto6.Perro;
import org.example.punto7.Circuloi;
import org.example.punto7.Rectangulo;
import org.example.punto7.interfaces.Forma;
import org.example.punto8.Asalariado;
import org.example.punto8.Empleado;
import org.example.punto8.PorHoras;
import org.example.punto9.*;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Options {
    Scanner input = new Scanner(System.in);
    DecimalFormat formatNumber = new DecimalFormat("#.##");

    public void option1() {
        System.out.println("1. Figuras geométricas: Crea una jerarquía de clases que representan diferentes figuras geométricas, como círculos, triángulos y cuadrados. \n" +
                "Utiliza una interfaz para definir métodos comunes como cálculo de área y perímetro. Cada figura debe tener su propia implementación de estos métodos.");
        System.out.println("Ingrese que opción desea hacer\n" +
                "1 --> Calcular area y perimetro de un Círculo\n" +
                "2 --> Calcular area y perimetro de un Triangulo\n" +
                "3 --> Calcular area y perimetro de un Cuadrado ");
        int option = input.nextInt();
        if(option == 1){
            System.out.println("Elegistes Circulo\n" +
                    "Por favor ingresa el radio");
            int radio = input.nextInt();
            String area = formatNumber.format(new Circulo("Circulo", radio).calculateArea());
            String perimetro = formatNumber.format(new Circulo("Circulo", radio).calculatePerimeter());
            System.out.println("El Círculo de radio "+radio+"\n" +
                    "tiene un area de: "+area+"\n" +
                    "y un perimetro de: "+perimetro);
        } else if (option == 2) {
            System.out.println("Elegistes Triangulo\n" +
                    "Por favor ingresa el lado 1");
            int lado1 = input.nextInt();
            input.nextLine();
            System.out.println(
                    "Por favor ingresa el lado 2");
            int lado2 = input.nextInt();
            input.nextLine();
            System.out.println(
                    "Por favor ingresa el lado 3");
            int lado3 = input.nextInt();
            String area = formatNumber.format(new Triangulo("",lado1, lado2, lado3, lado1, lado2).calculateArea());
            String perimetro = formatNumber.format(new Triangulo("",lado1, lado2, lado3, lado1, lado2).calculatePerimeter());

            System.out.println("El Triangulo\n" +
                    "tiene un area de: "+area+"\n" +
                    "y un perimetro de: "+perimetro);
        }else{
            System.out.println("Elegistes Cuadrado\n" +
                    "Por favor ingresa el lado");
            int lado = input.nextInt();
            String area = formatNumber.format(new Cuadrado("",lado).calculateArea());
            String perimetro = formatNumber.format(new Cuadrado("",lado).calculatePerimeter());

            System.out.println("El Cuadrado de lado"+lado+"\n" +
                    "tiene un area de: "+area+"\n" +
                    "y un perimetro de: "+perimetro);
        }

    }
    public void option2() {

        System.out.println("2. Sistema de notificaciones: Diseña un sistema de notificaciones que pueda manejar varios tipos de notificaciones, \n" +
                "como correos electrónicos, mensajes de texto y notificaciones push.\n" +
                " Crea una interfaz que defina un método enviar y clases abstractas para cada tipo de notificación.\n" +
                " Luego, implementa las clases concretas para cada tipo de notificación.\n");
        System.out.println("Ingresa la notificación a enviar");
        String messageNoti = input.nextLine();
        Email correo = new Email("Tienes un nuevo mensaje.");
        correo.enviar(correo.getMensaje());
        TextMessage mensaje = new TextMessage(messageNoti);
        mensaje.enviar(mensaje.getMensaje());
        NotificacionPush pushNoti = new NotificacionPush("Nueva actualización disponible.");
        pushNoti.enviar(pushNoti.getMensaje());

    }
    public void option3() {

        System.out.println("3. Banco y cuentas: Desarrolla un sistema bancario que incluya una interfaz para representar cuentas bancarias y métodos para depositar\n" +
                " y retirar dinero. Crea una clase abstracta que implemente parte de la lógica común de las cuentas,\n" +
                " y luego implementa clases concretas para diferentes tipos de cuentas, como cuentas de ahorro y cuentas corrientes.\n");
        System.out.println("Ingresa la cantidad a depositar en la cuenta de ahorro");
        int montoAhorro = input.nextInt();
        input.nextLine();
        System.out.println("Ingresa la cantidad a depositar en la cuenta corriente");
        int montoCorriente = input.nextInt();
        input.nextLine();
        CuentaBancaria cuentaAhorro = new CuentaAhorro(5000);
        CuentaBancaria cuentaCorriente = new CuentaCorriente(8000, 6000);

        cuentaAhorro.depositar(montoAhorro);
        cuentaCorriente.depositar(montoCorriente);
        System.out.println("Ingresa la cantidad a retirar en la cuenta de ahorro");
        int retiroAhorro = input.nextInt();
        input.nextLine();
        System.out.println("Ingresa la cantidad a retirar en la cuenta corriente");
        int retiroCorriente = input.nextInt();
        input.nextLine();
        cuentaAhorro.retirar(retiroAhorro);
        cuentaCorriente.retirar(retiroCorriente);

        System.out.println("Saldo de la cuenta de ahorro: " + cuentaAhorro.getSaldo());
        System.out.println("Saldo de la cuenta corriente: " + cuentaCorriente.getSaldo());

    }
    public void option4() {
        System.out.println("4. Juego de cartas: Crea un juego de cartas en el que puedas representar diferentes tipos de cartas (por ejemplo, cartas de póker)\n" +
                "utilizando una jerarquía de clases y una interfaz.\n La interfaz podría definir métodos como mostrarCarta y valorNumerico. Luego, implementa\n" +
                "clases para los diferentes tipos de cartas y para la baraja.");

        Baraja baraja = new Baraja();
        baraja.barajar();

        for (int i = 0; i < 5; i++) {
            Carta carta = baraja.tomarCarta();
            if (carta != null) {
                carta.mostrarCarta();
                System.out.println("Valor numérico: " + carta.valorNumerico());
                System.out.println();
            }
        }
    }
    public void option5() {
        System.out.println("5. Tienda en línea: Construye un sistema básico para una tienda en línea. Crea una interfaz para representar productos \n" +
                "y métodos como calcularPrecio y mostrarDetalles. Luego, implementa clases abstractas para diferentes categorías de productos\n" +
                "(electrónica, ropa, libros, etc.) y clases concretas para productos específicos en cada categoría.");

        Producto smartphone = new Smartphone("iPhone 13", 999.99);
        Producto camiseta = new Camiseta("M", 19.99);

        System.out.println("Detalles del producto 1:");
        smartphone.mostrarDetalles();
        System.out.println("Precio total: $" + smartphone.calcularPrecio());

        System.out.println("\nDetalles del producto 2:");
        camiseta.mostrarDetalles();
        System.out.println("Precio total: $" + camiseta.calcularPrecio());

    }
    public void option6() {
        System.out.println("6. Animales y sonidos: Crea una jerarquía de clases que representen diferentes tipos de animales,\n" +
                " como perros, gatos y pájaros. Cada clase de animal debe tener un método hacerSonido() que imprima el sonido\n" +
                " característico del animal. Luego, crea un array de animales y recorre el array llamando al método hacerSonido() en cada uno.\n" +
                " Esto demuestra cómo el polimorfismo permite tratar objetos de diferentes clases de manera uniforme.");
        Animal[] animales = new Animal[3];
        animales[0] = new Perro();
        animales[1] = new Gato();
        animales[2] = new Pajaro();

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
    public void option7() {
        System.out.println("7. Formas geométricas y áreas: Utiliza la jerarquía de clases de formas geométricas que creaste en el ejercicio \n" +
                "anterior (con interfaces y clases abstractas). Agrega un método calcularArea() a la interfaz de las formas y luego implementa \n" +
                "este método en las clases concretas. Crea un array de formas y calcula el área de cada una utilizando polimorfismo.");
        System.out.println("Trabajaremos con un Circulo y un rectangulo\n" +
                "Por favor ingrese el radio del círculo");
        int radio = input.nextInt();
        input.nextLine();
        System.out.println("Ingrese la base y la altura del rectangulo");
        System.out.println("Base: ");
        int base = input.nextInt();
        input.nextLine();
        System.out.println("Altura: ");
        int altura = input.nextInt();
        input.nextLine();
        Forma[] formas = new Forma[2];
        formas[0] = new Circuloi(radio);
        formas[1] = new Rectangulo(base, altura);

        for (Forma forma : formas) {
            forma.mostrarDetalles();
            System.out.println("Área: " + forma.calcularArea());
            System.out.println();
        }
    }
    public void option8(){
        Empleado[] empleados = new Empleado[2];

        System.out.println("8. Empleados y salarios: Crea una jerarquía de clases para representar diferentes tipos de empleados,\n" +
                " como asalariados y por horas. Cada clase debe tener un método para calcular el salario. Utiliza el polimorfismo para calcular \n" +
                "el salario de diferentes tipos de empleados en un array.");
        System.out.println("Ingrese el nombre y el salario para tipo asalariado");

        System.out.println("Nombre: ");
        String nombre = input.nextLine();
        System.out.println("Salario: ");
        int salario = input.nextInt();
        empleados[0] = new Asalariado(nombre, salario );
        input.nextLine();
        System.out.println("Ingrese el nombre y el salario para tipo por horas");

        System.out.println("Nombre: ");
        nombre = input.nextLine();
        System.out.println("Horas: ");
        int horas = input.nextInt();
        System.out.println("Tarifa por hora: ");
        int tarifa = input.nextInt();
        empleados[1] = new PorHoras(nombre, horas, tarifa );

        for (Empleado empleado : empleados) {
            System.out.println("Empleado: " + empleado.nombre);
            System.out.println("Salario: $" + empleado.calcularSalario());
            System.out.println();
        }
    }
    public void option9(){
        System.out.println("9. Instrumentos musicales: Diseña una jerarquía de clases para instrumentos musicales, como guitarras, pianos \n" +
                "y violines. Cada instrumento debe tener un método tocar() que imprima cómo suena. Luego, crea un método que acepte un arreglo \n" +
                "de instrumentos y los haga tocar a todos utilizando polimorfismo.\n");
        InstrumentoMusical[] instrumentos = new InstrumentoMusical[3];
        instrumentos[0] = new Guitarra("Guitarra eléctrica");
        instrumentos[1] = new Piano("Piano de cola");
        instrumentos[2] = new Violin("Violín clásico");

        Musica.hacerTocarInstrumentos(instrumentos);
    }
    public void option10(){
        System.out.println("10. Figuras en un lienzo: Crea una interfaz llamada Dibujable que tenga un método dibujar() \n" +
                "y una clase abstracta Figura que implemente esta interfaz. Luego, implementa diferentes clases de figuras \n" +
                "(círculos, rectángulos, etc.) que extiendan la clase Figura. Crea una clase Lienzo que tenga un arreglo de \n" +
                "objetos Dibujable y, utilizando polimorfismo, llama al método dibujar() en cada objeto.\n");
        System.out.println("Ingrese el radio de un circulo");
        int radio = input.nextInt();
        Dibujable[] figuras = new Dibujable[2];
        figuras[0] = new Circuloe(radio);
        System.out.println("Ingrese la base de un rectangulo");
        int base = input.nextInt();
        System.out.println("Ingrese la altura de un rectangulo");
        int altura = input.nextInt();
        figuras[1] = new Rectanguloe(base, altura);

        Lienzo.dibujarEnLienzo(figuras);
    }

}
