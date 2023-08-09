
package clases;
import java.time.LocalDate;

public class CabeceraTransaccionContable {

    public String Numero;
    public LocalDate Fecha_documento;
    public int Tipo_documento;
    public String Hecho_por;
    public double Monto_transaccion = 0;
    public LocalDate Fecha_actualizacion = LocalDate.parse("1/1/2002");
    public boolean Status_actualizacio = false;
}
