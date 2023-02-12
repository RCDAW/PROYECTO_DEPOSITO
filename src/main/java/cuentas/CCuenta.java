package cuentas;

/**
 * @author Cepeda Guaman Rolando
 *
 * @version v1 Febrero_2023
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /*COnstructor por parametro*/
    /**
     * @param nom. Nombre del propietario de la cuenta y es una cadena de texto.
     * @param cue. Numero de cuenta del propietario y sera una cadena de texto.
     * @param sal. Valor en decimal (double) y sera el saldo que tenemos dentro
     * de la cuenta.
     * @param tipo. Valor en decimal (double). 
     *
     *
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /*Metodo que permite consultar consultar mi saldo actual*/
    /**
     * @return devuelve el saldo de mi cuenta en decimales
     */
    public double estado() {
        return getSaldo();
    }

    /*Metodo que permite ingresar dinero a mi cuenta siempre en cuanto la cantidad que ingrese sea positivo*/
    /**
     * @throws Execption. Hace una llamada a Exeption y lanzara la exepcion
     * cuando ingresemos una cantidad que sea negativo.
     *
     * @exception e. Hace una llamada a exepcion "e" y lanzara el error
     * encontrado.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /*Metodo que permite retirar dinero a mi cuenta siempre en cuanto la cantidad que ingrese sea positivo y sea menor 
    a la cantidad que tengamos en la cuenta*/
    /**
     * @throws Execption. Hace una llamada a Exeption y lanzara la exepcion
     * cuando ingresemos una cantidad que sea negativo o que la cantidad que
     * tengamos en la cuenta sea inferior a lo que vamos a retirar.
     *
     * @exception e. Hace una llamada a exepcion "e" y lanzara el error
     * encontrado.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * @return devuelve el nombre del propietario de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombres. Es el nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return devuelve el numero de la cuenta del propietario.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta. Es el numero de cuenta del propiertario
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

     /**
     * @return devuelve el saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo. Es el saldo que tenemos en la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return devuelve el tipo de interes que tiene el propietario.
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés. Es el tipo de interes que tiene el propietario.
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
