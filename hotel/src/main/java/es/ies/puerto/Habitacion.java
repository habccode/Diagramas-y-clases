package es.ies.puerto;
import java.util.List;
import java.util.Objects;
/**
 * @author habccode
 * @version 1.0.0
 */
public class Habitacion {
    private int numeroDeHabitacion;
    private String tipoDeHabitacion;
    private float precioNoche;
    private List<Reserva> reservas;
    private boolean disponibilidad;

    /**
     * Constructor vacio.
     */
    public Habitacion() {}

    /**
     * Constructor general.
     * @param numeroDeHabitacion
     * @param tipoDeHabitacion
     * @param precioNoche
     * @param reservas
     * @param disponibilidad
     */
    public Habitacion(int numeroDeHabitacion, String tipoDeHabitacion, float precioNoche, List<Reserva> reservas, boolean disponibilidad) {
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precioNoche = precioNoche;
        this.reservas = reservas;
        this.disponibilidad = disponibilidad;
    }

    public int getNumeroDeHabitacion() {
        return this.numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public String getTipoDeHabitacion() {
        return this.tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public float getPrecioNoche() {
        return this.precioNoche;
    }

    public void setPrecioNoche(float precioNoche) {
        this.precioNoche = precioNoche;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public boolean getDisponibilidad() {
        return this.disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    /**
     * Función para comprobar la disponibilidad.
     * @return
     */
    public boolean comprobarDisponobilidad() {
        return false;
    }

    /**
     * Función para cambiar el estado.
     * @return
     */
    public boolean cambiarEstado() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Habitacion)) return false;
        Habitacion habitacion = (Habitacion) o;
        return numeroDeHabitacion == habitacion.numeroDeHabitacion && 
        Objects.equals(tipoDeHabitacion, habitacion.tipoDeHabitacion) && 
                       precioNoche == habitacion.precioNoche && 
        Objects.equals(reservas, habitacion.reservas) && 
                       disponibilidad == habitacion.disponibilidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeHabitacion, tipoDeHabitacion, precioNoche, reservas, disponibilidad);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroDeHabitacion='" + getNumeroDeHabitacion() + "'" +
            ", tipoDeHabitacion='" + getTipoDeHabitacion() + "'" +
            ", precioNoche='" + getPrecioNoche() + "'" +
            ", reservas='" + getReservas() + "'" +
            ", disponibilidad='" + getDisponibilidad() + "'" +
            "}";
    }
}
