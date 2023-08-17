
package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class CatalogoCuentaContable {
    
    public int Numero;
    public String Descripcion;
    public boolean Tipo_cuenta;
    public int Nivel;
    public int Cuenta_padre;
    public int Grupo;
    public LocalDate Fecha_creacion;
    public LocalTime Hora_creacion;
    public double Debito_acumulado = 0;
    public double Credito_acumulado = 0;
    public double Balance = 0;
    
}

