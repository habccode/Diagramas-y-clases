package es.ies.puerto;
import java.util.Date;
import java.util.Objects;
/**
 * @author habccode
 * @version 1.0.0
 */
public class Reserva {
    private Date fechaDeEntrada;
    private Date fechaDeSalida;
    private Cliente cliente;
    private Habitacion habitacion;
    private Boolean confirmacion;

    /**
     * Constructor por defecto.
     */
    public Reserva() {}

    /**
     * Constructor general.
     * @param fechaDeEntrada
     * @param fechaDeSalida
     * @param cliente
     * @param habitacion
     * @param confirmacion
     */
    public Reserva(Date fechaDeEntrada, Date fechaDeSalida, Cliente cliente, Habitacion habitacion, Boolean confirmacion) {
        this.fechaDeEntrada = fechaDeEntrada;
        this.fechaDeSalida = fechaDeSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.confirmacion = confirmacion;
    }

    public Date getFechaDeEntrada() {
        return this.fechaDeEntrada;
    }

    public void setFechaDeEntrada(Date fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    public Date getFechaDeSalida() {
        return this.fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Boolean isConfirmacion() {
        return this.confirmacion;
    }

    public Boolean getConfirmacion() {
        return this.confirmacion;
    }

    public void setConfirmacion(Boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    /**
     * Función para calcular el costo de una reserva.
     * @return
     */
    public float calcularCostoTotal() {
        return 0.0f;
    }

    /**
     * Función para confirmar una reserva.
     * @return
     */
    public boolean confirmarReserva() {
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Reserva)) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(fechaDeEntrada, reserva.fechaDeEntrada) && 
               Objects.equals(fechaDeSalida, reserva.fechaDeSalida) && 
               Objects.equals(cliente, reserva.cliente) && 
               Objects.equals(habitacion, reserva.habitacion) && 
               Objects.equals(confirmacion, reserva.confirmacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaDeEntrada, fechaDeSalida, cliente, habitacion, confirmacion);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaDeEntrada='" + getFechaDeEntrada() + "'" +
            ", fechaDeSalida='" + getFechaDeSalida() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", habitacion='" + getHabitacion() + "'" +
            ", confirmacion='" + isConfirmacion() + "'" +
            "}";
    }
}
