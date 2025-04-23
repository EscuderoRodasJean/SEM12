# SEM12
AUTOMOVIL

public class Automovil extends Vehiculo{
    
    //Atributos
    private int nRuedas;
    private String tipoMotor;
    private String placa;
    
    //Metodos
    public Automovil(){}
    
    public void derrapar(){
        System.out.println("El vehiculo esta DERRAPANDO");
    }
    
    public void hacerCambiosr(){
        System.out.println("El Automovil hace CAMBIOS DE VELOCIDAD");
    }
    
    //Getters and Setters

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    //SOBRECARGA DE METODOS

    @Override
    public void transportar() {
        //super.transportar(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("El Autmovil se TRANSPORTA");
    }
    
    @Override
    public void tanquear(){
        System.out.println("El Autmovil se TANQUEA");
    }
    
}

AVION
public class Avion extends Vehiculo {
    //Atributos
    private String tipoAvion;
    private int nMotores;
    private int nRuedas;
    
    public Avion(){}
    
    public void volar(){
        System.out.println("El avion Vuela");
    }
    
    public void aterrizar(){
        System.out.println("El avion Aterriza");
    }
    
    public void planear(){
        System.out.println("El avion Planea");
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public int getnMotores() {
        return nMotores;
    }

    public void setnMotores(int nMotores) {
        this.nMotores = nMotores;
    }

    public int getnRuedas() {
        return nRuedas;
    }

    public void setnRuedas(int nRuedas) {
        this.nRuedas = nRuedas;
    }
    
    @Override
    public void transportar(){
        System.out.println("El avion se ESTÁ TRANSPORTANDO");
    }

    VEHICULO
    public class Vehiculo {
    //Atributos
    private int capacPasajeros;
    private double capcCarga;
    private String tipoVehiculo;
    private String marca;
    private String modelo;
    
    //metodos
    public Vehiculo(){
    }
    
    public void encender(){
        System.out.println("El Vehiculo ENCIENDE");
    }
    
    public void apagar(){
        System.out.println("El vehiculo se APAGA");
    }
    
    public void acelerar( double valor ){
        System.out.println("Aceleracion de Vehiculo: "+valor);
    }
    
    public void transportar(){
        System.out.println("El vehiculo SE TRANSPORTA");
    }
    public void tanquear(){
        System.out.println("El vehiculo TANQUEA");
    }
    
    //Getters and setters

    public int getCapacPasajeros() {
        return capacPasajeros;
    }

    public void setCapacPasajeros(int capacPasajeros) {
        this.capacPasajeros = capacPasajeros;
    }

    public double getCapcCarga() {
        return capcCarga;
    }

    public void setCapcCarga(double capcCarga) {
        this.capcCarga = capcCarga;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }


EJECUCION

    public class _Ejecucion {

    public static void main(String[] args) {
       
        System.out.println("Instancia de tipo Vehiculo: oVehiculo01");
        Vehiculo oVehiculo01 = new Vehiculo();
        System.out.println("\n >> Atributos del Vehiculo: ");
        System.out.println("Capacidad de pasajeros: "+ oVehiculo01.getCapacPasajeros());
        System.out.println("Tipo de vehiculo: "+ oVehiculo01.getTipoVehiculo());
        System.out.println("Marca de vehiculo: "+ oVehiculo01.getMarca());
        
        //Modificar los atributos de Vehiculo
        System.out.println("\nModificamos los atributos de oVehiculo01");
        oVehiculo01.setCapacPasajeros(70);
        oVehiculo01.setCapcCarga(6000);
        oVehiculo01.setTipoVehiculo("Vehiculo de carga");
        oVehiculo01.setMarca("Volvo");
        oVehiculo01.setModelo("FGX-2545H");
        
        System.out.println("Atributos de oVehiculo01");
        System.out.println("Capacidad de Pasajeros: "+oVehiculo01.getCapacPasajeros());
        System.out.println("Capacidad carga: "+oVehiculo01.getCapcCarga());
        System.out.println("Tipo de Vehiculo"+oVehiculo01.getTipoVehiculo());
        System.out.println("Marca: "+oVehiculo01.getMarca());
        System.out.println("Modelo: "+oVehiculo01.getModelo());
        
        System.out.println("\n\n Instancia de la clase Automovil: oAuto01");
        Automovil oAuto01=new Automovil();
        oAuto01.setnRuedas(4);
        oAuto01.setTipoMotor("Motor Gasolinero");
        oAuto01.setPlaca("XCI-343");
        
        oAuto01.setCapacPasajeros(7);
        oAuto01.setCapcCarga(3500);
        oAuto01.setTipoVehiculo("MINIVAN");
        oAuto01.setMarca("Toyota");
        oAuto01.setModelo("Avanza");
        
        System.out.println("\n Atributos de Vehiculo oAuto01");
        System.out.println("Nro de ruedas: "+oAuto01.getnRuedas());
        System.out.println("Tipo de Motor: "+oAuto01.getTipoMotor());
        System.out.println("Codigo de placa: "+oAuto01.getPlaca());
        
        System.out.println("Capacidad de pasajeros: "+oAuto01.getCapacPasajeros());
        System.out.println("Capacidad de carga: "+oAuto01.getCapcCarga());
        System.out.println("Tipo de Vehiculo: "+oAuto01.getTipoVehiculo());
        System.out.println("Marca de Vehiculo: "+oAuto01.getMarca());
        System.out.println("Modelo de Vehiculo: "+oAuto01.getModelo());
        
        oAuto01.derrapar();
        oAuto01.hacerCambiosr();
        oAuto01.transportar();
    }
    
}
