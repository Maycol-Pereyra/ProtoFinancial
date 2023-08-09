/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import clases.CabeceraTransaccionContable;
import clases.CatalogoCuentaContable;
import clases.TransaccionContable;
import clases.Usuario;

/**
 *
 * @author User
 */
public class Convertidor {
    
    public Convertidor(){
    
        
        
    }
    
    public String[] UsuarioLista(Usuario user){
        
        Archivos Manejador = new Archivos();
        
        String id = String.valueOf(Manejador.ObtenerNuevoId(Manejador.Usuarios));
        String login = user.Login;
        String password = user.Password;
        String nivelAcceso = String.valueOf(user.NivelAcceso);
        String nombre = user.Nombre;
        String apellido = user.Apellido;
        String email = user.Email;

        String[] lista = {id, login, password, nivelAcceso,
            nombre, apellido, email}; 
        
        return lista;
    }
    
    public Usuario StringUsuario(String informaciones){
        Usuario user = new Usuario();
                
        String[] infos = informaciones.split("-");
        
        user.Id = Integer.parseInt(infos[0]);
        user.Login = infos[1];
        user.Password = infos[2];
        user.NivelAcceso = Integer.parseInt(infos[3]);
        user.Nombre = infos[4];
        user.Apellido = infos[5];
        user.Email = infos[6];
        
        return user;
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
    
    public String[] CabeceraLista(CabeceraTransaccionContable CTC){
        
        String numero = CTC.Numero;
        String fecha = CTC.Fecha_documento.toString();
        String tipo = String.valueOf(CTC.Tipo_documento);
        String hecho = CTC.Hecho_por;
        String  monto = String.valueOf(CTC.Monto_transaccion);
        String fechaAct = CTC.Fecha_actualizacion.toString();
        String status = String.valueOf(CTC.Status_actualizacio);
        
        if(monto.equals("0"))
            monto = " ";
        if(fechaAct.equals("1/1/2002"))
            fechaAct = " ";
        if(status.equals("false"))
            status = " ";
        
        String[] lista = {numero, fecha, tipo, hecho, monto, fechaAct, status};
        
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
}
