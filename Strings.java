

class Strings {

  public static void main(String[] args) {
    String cadena1 = "HOLA";
    String cadena2 = "Hola";

    boolean resultado1 = cadena1.equals(cadena2);

    System.out.println(resultado1);

    //para poder validar que ambas cadenas son iguales se puede hacer así
    String nuevaCadena1;
    String nuevaCadena2;

    nuevaCadena1 = cadena1.toUpperCase();
    nuevaCadena2 = cadena2.toUpperCase();

    boolean resultado2 = nuevaCadena1.equals(nuevaCadena2);

    System.out.println(resultado2);

    //si queremos que inore si esta en cualquier formato
    resultado2 = cadena1.equalsIgnoreCase(cadena2);

    System.out.println(resultado2);

    //concatenar usando +
    String firts = "Flores";
    String second = ", como estas este dia ";
    int third = 24;
    String fourth = " de marzo";


    String mensaje = "Hola Joseph Blanco" + firts + second + third + fourth;

    System.out.println(mensaje);

    //

  }
}







//comparar strings
