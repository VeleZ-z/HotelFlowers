/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valids;
import java.util.Scanner;
/**
 *
 * @author camilo.velez4
 */
public class ValidateForGest {
        Scanner sc = new Scanner(System.in);

    public int leeryValidarCaracter(String mensaje) {
        int dato;
        do {
            System.out.print(mensaje + " debe ser el número 1 o el 2: ");
            while (!sc.hasNextInt()) {
                System.out.println("Valor no válido");
                sc.next();
                System.out.print("debe ser el número 1 o el 2:");
            }
            dato = sc.nextInt();
            if (dato < 1 || dato > 2) {
                System.out.println("El número debe ser positivo y entre las opciones");
            }
        } while (dato < 0 || dato > 2);
        return dato;

    }
}
