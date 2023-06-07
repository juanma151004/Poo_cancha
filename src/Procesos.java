

import javax.swing.*;

public class Procesos {
    int numer;
    int i, neg = 0, par = 0;
    
    /*La clase "Procesos" está compuesta por tres variables: "numer" (que almacena el número ingresado por el usuario), "neg" (que registra la cantidad de números negativos) y "par" (que mantiene el conteo de números pares).*/

    public void entrada() {
        for (i = 0; i < 5; i++) {
            numer = ingresarDatos("Digite 1 n�mero");

            if (numer % 2 == 0) {
                par++;
            }

            if (numer < 0) {
                neg++;
            }
        }
        
        /*El método "entrada" utiliza un bucle "for" para repetir cinco veces el proceso de solicitar al usuario que ingrese un número.
Después de que el usuario proporciona un número, el programa verifica si es par o negativo.
Si el número ingresado es par (es decir, divisible por 2), se incrementa en uno la variable "par".
Si el número ingresado es negativo (es decir, menor que cero), se incrementa en uno la variable "neg".*/

        JOptionPane.showMessageDialog(null, "El n�mero de n�meros pares es: " + par +
                " y el n�mero de n�meros negativos es: " + neg);
        
        /*Una vez que se ingresan los cinco números, se muestra una ventana con un mensaje que indica la cantidad de números pares y negativos ingresados.*/
    }

    public static int ingresarDatos(String mensaje) {
        String cadena = JOptionPane.showInputDialog(null, mensaje);
        int valor = Integer.parseInt(cadena);
        return valor;
    }
}

