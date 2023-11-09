public class CuentaBancaria {

    
    private int numeroCuenta;
    private double saldo;
    private String nombreCliente;
    private String email;
    private String numeroTelefono;
    

    public CuentaBancaria(int numeroCuenta, double saldo, String nombreCliente, String email, String numeroTelefono) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreCliente = nombreCliente;
        this.email = email;
        this.numeroTelefono = numeroTelefono;
    }
    
    
  


    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNombreCliente() {
        return nombreCliente;
    }
    
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getNumeroTelefono() {
        return numeroTelefono;
    }
    
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
     
     public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Se depositaron " + cantidad + " unidades. El saldo actual es de " + saldo + " unidades.");
    }
    
    public void retirar(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " unidades. El saldo actual es de " + saldo + " unidades.");
        } else {
            System.out.println("No hay fondos suficientes para realizar el retiro.");
        }
    }


    
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(186750, 18000.0, "Daniela lopez", "Danielalopez@email.com", "789-1789");
        
     System.out.println("El saldo actual es de " + cuenta.getSaldo());
     cuenta.depositar(1000.0);
     cuenta.retirar(300.0);
 }
 
    }
        
    
    
    
    



