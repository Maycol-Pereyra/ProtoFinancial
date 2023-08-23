
package clases;
import java.time.LocalDate;

public class CabeceraTransaccionContable {

    public String Numero;
    public LocalDate Fecha_documento;
    public String Tipo_documento;
    public String Hecho_por;
    public String Descripcion_documento;
    public double Monto_transaccion = 0;
    public LocalDate Fecha_actualizacion = LocalDate.now();
    public boolean Status_actualizacion = false;
}
