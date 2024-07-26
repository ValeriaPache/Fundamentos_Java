import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionPrincipal;

        do {
            System.out.println("===== Menú Principal =====");
            System.out.println("1. Casteo y Operaciones");
            System.out.println("2. Operadores de Asignación");
            System.out.println("3. Operadores de Incremento y Decremento");
            System.out.println("4. Ejercicios Combinados");
            System.out.println("0. Salir");
            System.out.println("Seleccione una opcion: ");
            opcionPrincipal = scanner.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    submenuCasteoYOperaciones(scanner);
                    break;
                case 2:
                    submenuOperadoresDeAsignacion(scanner);
                    break;
                case 3:
                    submenuOperadoresDeIncrementoYDecremento(scanner);
                    break;
                case 4:
                    submenuEjerciciosCombinados(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intentelo nuevamente.");
            }
        } while (opcionPrincipal != 0);

        scanner.close();

    }

    private static void submenuCasteoYOperaciones(Scanner scanner) {
        int option;
        do {
            System.out.println("Submenú Casteo y Operadores:");
            System.out.println("1. Resultado de (int) 5.89 + (int) 3.45");
            System.out.println("2. Resultado del valor ASCII de 'A'");
            System.out.println("3. Resultado del valor double 100.04");
            System.out.println("4. Resultado de convertir un String a int");
            System.out.println("5. Resultado de (int) (char) (byte) -1");
            System.out.println("6. Resultado del número 65 a un char");
            System.out.println("7. Resultado de asignar un long a un int sin casteo explícito");
            System.out.println("8. Resultado de convertir un float a un String");
            System.out.println("9. Resultado de de (int) Math.round(3.7)");
            System.out.println("10. Resultado de convertir byte b = 50 a short");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("El resultado de la operacion es: " + Main.calcularResultadoDex());
                    break;
                case 2:
                    System.out.println("El valor ASCII de A es: " + Main.calcularValorAscii());
                    break;
                case 3:
                    System.out.println("El valor que se imprimira es: " + Main.imprimirValorDei());
                    break;
                case 4:
                    System.out.println("El valor que se imprimira es: " + Main.convertirStringAint());
                    break;
                case 5:
                    System.out.println("El resultado es: " + Main.resultadoDeConvercion());
                    break;
                case 6:
                    System.out.println("El resultado de (int) (char) (byte) -1 es: " + Main.convertirNumeroEnChar());
                    break;
                case 7:
                    System.out.println("¿Qué sucede si intentas asignar un long a un int sin casteo explícito?: " + Main.asignarLongAInt());
                    break;
                case 8:
                    System.out.println("float 3.14 a String: " + Main.convertirFloatAString());
                    break;
                case 9:
                    System.out.println("Resultado de (int) Math.round(3.7): " + Main.resultadoDeIntConMathRound());
                    break;
                case 10:
                    System.out.println("Resultado byte 50 a short:: " + Main.convertirByteAShort());
                    break;
                case 0:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        } while (option != 0);
    }

    private static void submenuOperadoresDeAsignacion(Scanner scanner) {
        int option;
        do {
            System.out.println("Submenú Operadores de Asignación:");
            System.out.println("1. Resultado del valor de x despues de x += 5");
            System.out.println("2. Resultado de simplificar la expresión usando un operador de asignación compuesta");
            System.out.println("3. Resultado del valor de a despues de a %= 4");
            System.out.println("4. Resultado de una expresión equivalente a x = x + y");
            System.out.println("5. Resultado de x ^= 2;");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("El valor de X es: " + Main.valorX());
                    break;
                case 2:
                    System.out.println("El valor de Y es: " + Main.valorY());
                    break;
                case 3:
                    System.out.println("El valor de a es: " + Main.valorDea());
                    break;
                case 4:
                    System.out.println("El valor de X es: " + Main.valorDeXUsandoOperadorDeAsignacionCompuesta());
                    break;
                case 5:
                    System.out.println("El resultado de la operacion es: " + Main.resultadoOperacion());
                    break;
                case 0:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        } while (option != 0);
    }

    private static void submenuOperadoresDeIncrementoYDecremento(Scanner scanner) {
        int option;
        do {
            System.out.println("Submenu Operadores de Incremento y Decremento:");
            System.out.println("1. Resultado del valor de x despues de x = 5 y Y despues de y = ++x");
            System.out.println("2. ¿Qué se imprimirá en la consola?  int a = 5");
            System.out.println("3. Resultado de un código que use el operador de decremento para disminuir una variable count en 1");
            System.out.println("4. Resultado de la diferencia entre ++i y i++");
            System.out.println("5. Resultado de x despues de x = x++");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("El resultado de Y es: " + Main.resultadoDeXyY());
                    break;
                case 2:
                    System.out.println("El resultado de a++ es: " + Main.resultadoDeAMas() + "  El resultado de a es: " + Main.resultadoDeA());
                    break;
                case 3:
                    System.out.println("El resultado del decremento es: " + Main.resultadoDeDecremento());
                    break;
                case 4:
                    System.out.println("El valor de ++i es :" + Main.incrementoEnPrefijo() + " el cual aumento 2 mas en cambio el i++ es : " + Main.incrementoEnSufijo() + " el cual aumento solo uno mas");
                    break;
                case 5:
                    System.out.println("El valor que tiene x es : " + Main.valordex());
                    break;
                case 0:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        } while (option != 0);
    }

    private static void submenuEjerciciosCombinados(Scanner scanner) {
        int option;
        do {
            System.out.println("Submenú Ejercicios Combinados:");
            System.out.println("1. Resultado de la siguiente expresion i += ++i + i++ + ++i");
            System.out.println("2. Resultado de convertir un double a un int, y luego incrementa el resultado en 1 usando el operador de postincremento");
            System.out.println("3. Resultado de imprimir en la consola i--");
            System.out.println("4. Resultado de la expresión que use casteo y un operador de asignación compuesta para dividir un int por 2.0 y asignar el resultado a una variable double.");
            System.out.println("5. Resultado de c despues de c += 32");
            System.out.println("6. Resultado de convertir un long a un short, y luego usa un operador de asignación compuesta para multiplicarlo por 3");
            System.out.println("7. Resultado del valor de x despues de x += (x++) + (++x)");
            System.out.println("8. Resultado de la expresión que use casteo para convertir un float a un byte, y luego usa el operador de predecremento");
            System.out.println("9. Resultado de b despues de byte b = (byte)");
            System.out.println("10. Resultado de la expresión que combine casteo, un operador de asignación compuesta y un operador de incremento para convertir un double a un int, sumarle 5 y luego incrementarlo en 1");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("El resultado de i es: " + Main.resultadoDeI());
                    break;
                case 2:
                    System.out.println("El resultado de convertir el Double en Int y luego incrementar es: " + Main.convertirDoubleEnIntEincrementar());
                    break;
                case 3:
                    System.out.println("El valor de i es : " + Main.valorDei());
                    break;
                case 4:
                    System.out.println("Resultado: " + Main.valorDeC());
                    break;
                case 5:
                    System.out.println("El resultado de la operacion es: " + Main.resultadoDeC());
                    break;
                case 6:
                    System.out.println("El resultado de convertir long en short y luego multiplicarlo por 3 es: " + Main.convertirLongEnShort());
                    break;
                case 7:
                    System.out.println("El resultado de X en la operacion es: " + Main.resultadoOpercaionX());
                    break;
                case 8:
                    System.out.println("El resultado de convertir Float en Byte y luego hacer e predecremento es: " + Main.resultadoDelPredecremento());
                    break;
                case 9:
                    System.out.println("El resultado de b en la operacion es: " + Main.resultadoOperacionb());
                    break;
                case 10:
                    System.out.println("El resultado es: " + Main.resultadoDeIncrementarleEn1());
                    break;
                case 0:
                    return; // Volver al menú principal
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            System.out.println();
        } while (option != 0);
    }
}