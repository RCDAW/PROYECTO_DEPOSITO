package cuentas;

/**
 * @author Cepeda Guaman Rolando
 *
 * @version v1 Febrero_2023
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        /* Creacion de una cuenta para Antonio Lopez, con numero de cuenta 1000-2365-85-1230456789 que 
        tendra 2500 como cantida y un 0 como interes*/
        /**
         *
         * @param nom. Nombre del propietario de la cuenta y es una cadena de
         * texto.
         * @param cue. Numero de cuenta del propietario y sera una cadena de
         * texto.
         * @param sal. Valor en decimal (double) y sera el saldo que tenemos
         * dentro de la cuenta.
         * @param tipo. Valor en decimal (double) que sera el tipo de interes 
         * que tiene el propiertario.
         */
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        /**
         * @param saldo. valor decimal(double). cuanto dinero queremos retirar o 
         * agregar al saldo que tenemos.
         * @exeption e. Hace referencia a la ecepcion de nombre "e" y s elanzara cuando sea requerida
         */

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
