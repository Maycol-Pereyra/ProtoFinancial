/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.CabeceraTransaccionContable;
import clases.CatalogoCuentaContable;
import clases.TipoDocumento;
import clases.TransaccionContable;
import clases.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author User
 */
public class Convertidor {
    
    public String[] Separador(String informaciones){
        
        String[] rows = informaciones.split("&");
        
        return rows;
    }
    
    public String[] UsuarioLista(Usuario user){
        
        Archivos Manejador = new Archivos();
        
        String login = user.Login;
        String password = user.Password;
        String nivelAcceso = String.valueOf(user.NivelAcceso);
        String nombre = user.Nombre;
        String apellido = user.Apellido;
        String email = user.Email;

        String[] lista = {login, password, nivelAcceso, nombre, apellido, email}; 
        
        return lista;
    }
    
    public Usuario StringUsuario(String informaciones){
        Usuario user = new Usuario();
                
        String[] infos = informaciones.split("#");
        
        user.Login = infos[0];
        user.Password = infos[1];
        user.NivelAcceso = Integer.parseInt(infos[2]);
        user.Nombre = infos[3];
        user.Apellido = infos[4];
        user.Email = infos[5];
        
        return user;
    }
    
    public TransaccionContable StringTC(String informaciones){
        TransaccionContable tc = new TransaccionContable();
        
        String[] infos = informaciones.split("#");
        
        tc.Numero = infos[0];
        tc.Secuencia = infos[1];
        tc.Cuenta_contable = Integer.parseInt(infos[2]);
        tc.Valor_debito = Double.parseDouble(infos[3]);
        tc.Valor_credito = Double.parseDouble(infos[4]);
        tc.Comentario = infos[5];
        
        return tc;
    }
    
    public TipoDocumento StringTipoDoc(String informaciones){
        TipoDocumento td = new TipoDocumento();
        
        String[] infos = informaciones.split("#");
        
        td.Codigo = Integer.parseInt(infos[0]);
        td.Descripcion = infos[1];
        
        return td;
        
    }
    
    public String[] CatalogoLista(CatalogoCuentaContable CCC){
        
        String numero = String.valueOf(CCC.Numero);
        String descripcion = CCC.Descripcion;
        String tipoCuenta = String.valueOf(CCC.Tipo_cuenta);
        String nivel = String.valueOf(CCC.Nivel);
        String cuentaPadre = String.valueOf(CCC.Cuenta_padre);
        String grupo = String.valueOf(CCC.Grupo);
        String fechaCreacion = CCC.Fecha_creacion.toString();
        String horaCreacion = CCC.Hora_creacion.toString();
        String debito = String.valueOf(CCC.Debito_acumulado);
        String credito = String.valueOf(CCC.Credito_acumulado);
        String balance = String.valueOf(CCC.Balance);
        
        if(debito.equals("0"))
            debito = " ";
        if(credito.equals("0"))
            credito = " ";
        if(balance.equals("0"))
            balance = " ";
        
        String[] lista = {numero, descripcion, tipoCuenta, nivel, cuentaPadre,
            grupo, fechaCreacion, horaCreacion, debito, credito, balance};
        
        return lista;
    }
    
    public CabeceraTransaccionContable StringCTC(String informaciones){
        
        CabeceraTransaccionContable ctc = new CabeceraTransaccionContable();
        
        String[] infos = informaciones.split("#");
        
        ctc.Numero = infos[0];
        ctc.Fecha_documento = LocalDate.parse(infos[1]);
        ctc.Tipo_documento = infos[2];
        ctc.Descripcion_documento = infos[3];
        ctc.Hecho_por = infos[4];
        ctc.Monto_transaccion = Double.parseDouble(infos[5]);
        ctc.Fecha_actualizacion = LocalDate.parse(infos[6]);
        ctc.Status_actualizacion = Boolean.parseBoolean(infos[7]);
        
        return ctc;
    }
    
    public CatalogoCuentaContable StringCCC(String informaciones){
        
        CatalogoCuentaContable ccc = new CatalogoCuentaContable();
        
        String[] infos = informaciones.split("#");
        
        ccc.Numero = Integer.parseInt(infos[0]);
        ccc.Descripcion = infos[1];
        ccc.Tipo_cuenta = Boolean.parseBoolean(infos[2]);
        ccc.Nivel = Integer.parseInt(infos[3]);
        ccc.Cuenta_padre = Integer.parseInt(infos[4]);
        ccc.Grupo = infos[5];
        ccc.Fecha_creacion  = LocalDate.parse(infos[6]);
        ccc.Hora_creacion = LocalTime.parse(infos[7]);
        ccc.Debito_acumulado = Double.parseDouble(infos[8]);
        ccc.Credito_acumulado = Double.parseDouble(infos[9]);
        ccc.Balance = Double.parseDouble(infos[10]);
        
        return ccc;
        
    }
    
    
    
    public String[] CabeceraLista(CabeceraTransaccionContable CTC){
        
        String numero = CTC.Numero;
        String fecha = CTC.Fecha_documento.toString();
        String tipo = String.valueOf(CTC.Tipo_documento);
        String descripcion = CTC.Descripcion_documento;
        String hecho = CTC.Hecho_por;
        String  monto = String.valueOf(CTC.Monto_transaccion);
        String fechaAct = CTC.Fecha_actualizacion.toString();
        String status = String.valueOf(CTC.Status_actualizacion);
        
        if(fechaAct.equals("1/1/2002"))
            fechaAct = " ";

        String[] lista = {numero, fecha, tipo, descripcion, hecho, monto, fechaAct, status};
        
        return lista;
    }
    
    public String[] TransaccionLista(TransaccionContable TC){
        
        String numero = TC.Numero;
        String secuencia = String.valueOf(TC.Secuencia);
        String cuenta = String.valueOf(TC.Cuenta_contable);
        String valorDebito = String.valueOf(TC.Valor_debito);
        String valorCredito = String.valueOf(TC.Valor_credito);
        String comentario = TC.Comentario;
        
        if(secuencia.equals("0"))
            secuencia = " ";
        
        String[] lista = {numero, secuencia, cuenta, valorDebito, valorCredito, comentario}; 
        
        return lista;
    }
    
    public String[] TipoDocLista(TipoDocumento td){
        
        String codigo = String.valueOf(td.Codigo);
        String descripcion = String.valueOf(td.Descripcion);
        
        String[] lista = {codigo, descripcion};
        
        return lista;
        
    }
}
