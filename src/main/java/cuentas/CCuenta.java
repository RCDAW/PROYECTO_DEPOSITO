package cuentas;

/**
 *
 * @author Rolando
 * @version v1.0 Febrero_2023
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta() {
    }

    /*Constructor por parametros*/
    /**
     *
     * @param nom Nombre del propietario de la cuenta
     * @param cue Numero de cuenta del propiertario
     * @param sal Saldo que tenemos en nuestra cuenta
     * @param tipo tipor de interes que tiene el propietario e la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     *
     * @return devuel el saldo que tengo en la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    //Metodo que permite ingresar dinero a mi cuenta siempre en cuanto la cantidad que ingrese sea positivo*/
    /**
     *
     * @param cantidad ingresamos una cantidad de dinero que se sumara ala saldo
     * que tengamos en la cuenta
     * @throws Exception Hace una llamada a Exeption y lanzara la exepcion
     * cuando ingresemos una cantidad que sea negativo
     */
    //@exception e. Hace una llamada a exepcion "e" y lanzara el error encontrado
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     *
     * @param cantidad ingresamos una cantidad de dinero que se le restara al
     * saldo que tengamos en la cuenta
     * @throws Exception Hace una llamada a Exeption y lanzara la exepcion
     * cuando ingresemos una cantidad que sea negativo.
     */
    //   @exception e. Hace una llamada a exepcion "e" y lanzara el error encontrado
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
     *
     * @return devuelve el nombre del propietario de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre Modifica nombre del propietario de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return Devuelve el numero de cuenta del propietario
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     *
     * @param cuenta Modifica el numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     *
     * @return devuelve el saldo que hay en la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     *
     * @param saldo Modifica el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     *
     * @return Devuelve el tipo de interes del propietaro de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     *
     * @param tipoInteres Modifica el tipo de interes
     */
    public void setTipoInterés(double tipoInteres) {
        this.tipoInterés = tipoInteres;
    }
}