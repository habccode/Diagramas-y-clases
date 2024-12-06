package es.ies.puerto;
/**
 * @author habccode
 * @version 1.0.0
 */
import java.util.List;
import java.util.Objects;

public class Cliente {
    private String nombre;
    private int numeroDeContacto;
    private String correoElectronico;
    private List<Reserva> reservas;

    /**
     * Constructor por defecto.
     */
    public Cliente() {}

    /**
     * Constructor general.
     * @param nombre
     * @param numeroDeContacto
     * @param correoElectronico
     * @param reservas
     */
    public Cliente(String nombre, int numeroDeContacto, String correoElectronico, List<Reserva> resrvas) {
        this.nombre = nombre;
        this.numeroDeContacto = numeroDeContacto;
        this.correoElectronico = correoElectronico;
        this.reservas = resrvas;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeContacto() {
        return this.numeroDeContacto;
    }

    public void setNumeroDeContacto(int numeroDeContacto) {
        this.numeroDeContacto = numeroDeContacto;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> resrvas) {
        this.reservas = resrvas;
    }

    /**
     * Funcíon para registrar un cliente.
     * @return
     */
    public boolean registrarCliente() {
        return false;
    }

    /**
     * Función para obtener información.
     * @return
     */
    public String obtenerInformacion() {
        return "";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && 
                              numeroDeContacto == cliente.numeroDeContacto && 
               Objects.equals(correoElectronico, cliente.correoElectronico) && 
               Objects.equals(reservas, cliente.reservas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroDeContacto, correoElectronico, reservas);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numeroDeContacto='" + getNumeroDeContacto() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            ", resrvas='" + getReservas() + "'" +
            "}";
    }
    
}
