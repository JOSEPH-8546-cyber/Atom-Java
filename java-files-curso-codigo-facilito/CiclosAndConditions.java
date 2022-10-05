// declaración de la clase

class CiclosAndConditions {

   public static void main(String[] args) {

//en java se pueden hacer tres tipos de intrucciones:

/*

1- de seleccion
2- de iteración
3- de salto

 */

 //usando la seleccion con: if, else y else if para hacer un semáforo
 String colorLuz1 = "Verde";
 String colorLuz2 = "Amarillo";
 String colorLuz3 = "Rojo";

//dentro de los parentesis del if se debe evaluar true or false
 if (colorLuz1.equals("Verde")) {
   System.out.println("Puede continuar");
 }
 else if (colorLuz2.equals("Amarillo")) {
   System.out.println("Tenga precaucion");
 }
 else if (colorLuz3.equals("Rojo")) {
   System.out.println("Alto");
 }
 else {
   System.out.println("Color no valido");
 }


 //condiciones anidadas para evaluar numeros
int promedio = 9;

if ( promedio >= 7 ) {
  //el promedio es aprobatorio

    if ( promedio == 10 ) {
        System.out.println("Muchas felicidades");
    }
    else if (promedio == 9 ) {
      System.out.println("felicidades");
    }
    else {
      System.out.println("Buen trabajo");
    }
}
else {
  //el promedio no es aprobatorio
  System.out.println("Hay que estudiar mas");
}


//Escope en java
int number = 2;

if ( number  > 7 ) {
  String mensaje1 = "felicidades, tu promedio es de "  + number;

    if ( number == 10 ) {
        System.out.println(mensaje1);
    }
    else {
      System.out.println("no esta mal");
    }
}
else {
  System.out.println("no es buen numero");
}

//Usando el Switch con java para hacer un semáforo
String color = "Red";

switch(color) {

  case "Green" :
    System.out.println("Puede continuar");
      //
      break;

  case "yellow" :
      System.out.println("tenga precaucion");
        //
        break;

  case "Red" :
      System.out.println("Pare por completo");
        //
        break;

}


 }

  }
