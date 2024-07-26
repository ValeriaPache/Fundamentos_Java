public class Main {
    //Casteo

    //Ejercicio 1
    public static int calcularResultadoDex() {
        int x = (int) 5.89 + (int) 3.45;
        return x;
    }
    //Ejercicio 2
    public static int calcularValorAscii() {
        char c = 'A';
        int ascii = (int) c;
        return ascii;
    }
    //Ejercicio 3
    public static int imprimirValorDei() {
        double d = 100.04;
        long l = (long)d;
        int i = (int)l;
        return i;
    }
    //Ejercicio 4
    public static int convertirStringAint() {
        String valor = "1456";
        int resultadoConversion = Integer.parseInt(valor);
        return resultadoConversion;
    }
    //Ejercicio 5
    public static int resultadoDeConvercion() {
        int resultado = (int) (char) (byte) -1;
        return resultado;
    }
    //Ejercicio 6
    public static int convertirNumeroEnChar() {
        int numero = 65;
        char cambiar = (char) numero;
        return cambiar;
    }
    //Ejercicio 7
    public static int asignarLongAInt() {   // Sin un casteo explícito vota error (int)
        long valorLong = 123456789L;
        int valorInt = (int) valorLong;
        return valorInt;
    }
    //Ejercicio 8
    public static String convertirFloatAString() {
        float valorFloat = 3.14f;
        String valorString = Float.toString(valorFloat);
        return valorString;
    }
    //Ejercicio 9
    public static int resultadoDeIntConMathRound() {
        int resultadoDe = (int) Math.round(3.7);
        return resultadoDe;
    }
    //Ejercicio 10
    public  static short convertirByteAShort() {
        byte b = 50;
        short valorShort = b;
        return valorShort;
    }


    //Operadores de asignacion
    //Ejercicio 1
    public static int valorX() {
        int x = 10;
        x += 5;
        return x;
    }
    //Ejercicio 2
    public static int valorY() {
        int y = 5;
        int x = 7;
        y *= (x + 5);
        return y;
    }
    //Ejercicio 3
    public static int valorDea(){
        int a = 15;
        a %= 4;
        return a;
    }
    //Ejercicio 4
    public static int valorDeXUsandoOperadorDeAsignacionCompuesta(){
        int x = 25;
        int y = 19;
         x += y;
        return x;
    }
    //Ejercicio 5
    public static int resultadoOperacion(){
        int x = 4;
        x ^= 2;
        return x;
    }


    //Operadores de Incremento y Decremento
    //Ejercicio 1
    public static int resultadoDeXyY(){
        int x = 5;
        int y = ++x;
        return y;
    }
    //Ejercicio 2
    public static int resultadoDeAMas(){
        int a = 5;
        a++;
        return a;
    }
    public static int resultadoDeA(){
        int a = 5;
        return a;
    }
    //Ejercicio 3
    public static int resultadoDeDecremento(){
        int count = 1;
        count--;
        return count;
    }
    //Ejercicio 4
    public static int incrementoEnPrefijo(){
        int i = 5;
        ++i;
        return i;
    }
    public static int incrementoEnSufijo(){
        int i = 5;
        i++;
        return i;
    }
    //Ejercicio 5
    public static int valordex (){
        int x = 3;
        x = x++;
        return x;
    }


    //Ejercicios Combinados
    //Ejercicio 1
    public static int resultadoDeI(){
        int i = 5;
        i += ++i + i++ + ++i;
        return i;
    }
    //Ejercicio 2
    public static int convertirDoubleEnIntEincrementar(){
        double d = 10.99;
        int convertedInt = (int) d;
        convertedInt++;
        return convertedInt;
    }
    //Ejercicio 3
    public static int valorDei(){
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        i--;
        return i;
    }
    //Ejercicio 4
    public static double valorDeC() {
        int v = 10;
        double e = v /= 2.0;
        return e;
    }
    //Ejercicio 5
    public static int resultadoDeC(){
        char c = 'X';
        c += 32;
        return c;
    }
    //Ejercicio 6
    public static int convertirLongEnShort() {
        long v = 5000L;
        short g = (short) v;
        g *= 3;
        return g;
    }
    //Ejercicio 7
    public static int resultadoOpercaionX(){
        int x = 10;
        x += (x++) + (++x);
        return x;
    }
    //Ejercicio 8
    public static int resultadoDelPredecremento(){
        float numeroFloat = 123.45f;
        byte numeroByte = (byte) numeroFloat;
        --numeroByte;
        return numeroByte;
    }
    //Ejercicio 9
    public static int resultadoOperacionb(){
        int i = 257;
        byte b = (byte)i;
        return b;
    }
    //Ejercicio 10
    public static int resultadoDeIncrementarleEn1() {
        double numeroDouble = 45.67;
        int numeroInt = (int) numeroDouble;
        numeroInt += 5;
        numeroInt++;
        return  numeroInt;
    }
}