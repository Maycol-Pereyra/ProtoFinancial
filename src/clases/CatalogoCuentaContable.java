
package clases;

import java.time.LocalDate;
import java.time.LocalTime;

public class CatalogoCuentaContable {
    
    int Id;
    int Numero;
    String Descripcion;
    boolean Tipo_cuenta;
    int Nivel;
    int Cuenta_padre;
    int Grupo;
    LocalDate Fehca_creacion;
    LocalTime Hora_creacion;
    double Debito_acumulado;
    double Credito_acumulado;
    double Balance;
    
}
