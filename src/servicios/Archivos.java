
package servicios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {
    
    public String Usuarios = "Usuarios";
    public String CatalogoCuenta = "Catalogo cuenta contable";
    public String CabeceraTrans = "Cabecera Transaccion Contable";
    public String TransacContable = "Transaccion contable";
    
    File Archivo;
    String ruta_archivos;
    
            
    public Archivos(){
        
        String pathProyecto = System.getProperty("user.dir");
        String ruta_carpeta = "\\src\\archivos";
        
        ruta_archivos = pathProyecto + ruta_carpeta;
        
        File Carpeta = new File(ruta_archivos);
        
        if(!Carpeta.exists()){
            Carpeta.mkdir();
            
        }
           
    }
    
    public String Insertar(String nombre_archivo, String[] datos){
        
        try{
            
            String ruta_archivo = ruta_archivos + "\\" + nombre_archivo + ".txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                Archivo.createNewFile();
            }
            
            try (FileWriter Escritor = new FileWriter(ruta_archivo, true)) {
                String informaciones = "";
                
                for(int i=0; i<datos.length; i++){
                    
                    if(i != 0){
                        datos[i] = "-" + datos[i];
                    }
                    
                    informaciones += datos[i];
                }
                
                if(Archivo.length() != 0){
                    
                    Scanner scanner = new Scanner(ruta_archivo);
                    while(scanner.hasNextLine()){
                        scanner.nextLine();
                        informaciones = "\n" + informaciones;
                    }
                }
                
                Escritor.write(informaciones);
                Escritor.close();
            }
            return "Insertado correctamente";
        
        }
        
        catch(IOException ex){
            return("Ocurrio un error " + ex);
        }
        
       
        
    }
    
    public String Actualizar(String nombre_archivo, String[] datos){
        
        try{
            
            String ruta_archivo = ruta_archivos + "\\" + nombre_archivo + ".txt"; 
            String rutaNueva  = ruta_archivos + "\\" + nombre_archivo + "1.txt";
            Archivo = new File(ruta_archivo);
            
            File Nuevo =  new File(ruta_archivos + "\\" + nombre_archivo + "1.txt");
            
            Archivo.createNewFile();            
            try (Scanner Lector = new Scanner(Archivo)) {
                
                try (FileWriter Escritor = new FileWriter(rutaNueva, true)){
                    
                    String login = datos[1];
                    String password  = datos[2];
                    String info = "";

                    while(Lector.hasNextLine()){

                        String informaciones = Lector.nextLine();

                        String login_obtenido = informaciones.split("-")[1];
                        String password_obtenida = informaciones.split("-")[2];

                        if((login_obtenido.equals(login) && password_obtenida.equals(password))){

                            for(int i=0; i<datos.length; i++){

                                if(i != 0){
                                    datos[i] = "-" + datos[i];
                                }

                                info += datos[i];
                            }

                            if(Nuevo.length() != 0){

                                Scanner scanner = new Scanner(Nuevo);
                                while(scanner.hasNextLine()){
                                    scanner.nextLine();
                                    info = "\n" + info;
                                }
                            }

                            Escritor.write(info);
                        }
                        else{

                            if(Nuevo.length() != 0){

                                Scanner scanner = new Scanner(Nuevo);
                                while(scanner.hasNextLine()){
                                    scanner.nextLine();
                                    informaciones = "\n" + informaciones;
                                }
                            }

                            Escritor.write(informaciones);
                        }
                    }

                    
                }
            }
            
            Archivo.delete();
            Nuevo.renameTo(new File(ruta_archivo));
            Nuevo.delete();

            return "todo correcto";
            
        }
        
        catch(IOException ex){
            System.out.println("Ocurrio un error " + ex);
            return ""+ex;
        }
        
    }
    
    public String ObtenerDato(String nombre_archivo, int id){
     
        try{
            String ruta_archivo = ruta_archivos + "\\" + nombre_archivo + ".txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                return "No hay datos";
            }
            
            try (Scanner Lector = new Scanner(Archivo)) {
                
                while(Lector.hasNextLine()){
                    
                    String informaciones = Lector.nextLine();
                    
                    String id_obtenido = informaciones.split("-")[0];
                    
                    if(id_obtenido.equals(String.valueOf(id))){
                        
                        return informaciones;
                    }
                }
            }
            return "No se encontro el registro";
        }
        
        catch(IOException ex){
            return("Ocurrio un error");
        }
        
    }
    
    public String ObtenerUsuario(String nombre_archivo, String login){

        try{
            String ruta_archivo = ruta_archivos + "\\Usuarios.txt"; 
            Archivo = new File(ruta_archivo);

            if(!Archivo.exists()){
                return "No hay datos";
            }

            try (Scanner Lector = new Scanner(Archivo)) {

                while(Lector.hasNextLine()){

                    String informaciones = Lector.nextLine();

                    String login_obtenido = informaciones.split("-")[1];

                    if(login_obtenido.equals(login)){

                        return informaciones;
                    }
                }
            }
            return "No se encontro el registro";
        }

        catch(IOException ex){
            return("Ocurrio un error");
        }

    }
    
    public String ObtenerDatos(String nombre_archivo){
        try{
            
            String ruta_archivo = ruta_archivos + "\\" + nombre_archivo + ".txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                return "No hay datos";
            }
            
            String informaciones = "";
            
            try (Scanner Lector = new Scanner(Archivo)) {
                
                int contador = 0;
                
                while(Lector.hasNextLine()){
                    
                    if(contador == 0){
                        informaciones += Lector.nextLine();
                    }
                    else{
                        informaciones += ("/" + Lector.nextLine());
                    }
                    
                    contador++;
                  
                }
            }
            
            return informaciones;
            
        }
        
        catch(IOException ex){
            return("Ocurrio un error");
        }
    }
    
    public int ObtenerNuevoId(String nombre_archivo){
        
        try{
            String ruta_archivo = ruta_archivos + "\\" + nombre_archivo + ".txt"; 
            Archivo = new File(ruta_archivo);

            if(!Archivo.exists()){
                return 1;
            }

            String ultimoId = "";

            Scanner Lector = new Scanner(Archivo);
            
            while(Lector.hasNextLine()){
                ultimoId = Lector.nextLine().split("-")[0];
            }

            Lector.close();
            return (Integer.parseInt(ultimoId))+1;
        }
        
       catch(IOException ex){
           return 0;
       }
    }

    public boolean ValidarUsuario(String nombre, String password){
        
        try{
            String ruta_archivo = ruta_archivos + "\\Usuarios.txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                return false;
            }
            
            try (Scanner Lector = new Scanner(Archivo)) {
                
                while(Lector.hasNextLine()){
                    
                    String[] informaciones = Lector.nextLine().split("-");
                    
                    String login = informaciones[1], password_obtenida = informaciones[2];
                    
                    if(login.equals(nombre) && password_obtenida.equals(password)){
                        return true;
                    }
                }
                
                return false;
            }
        }
        
        catch(IOException ex){
            return false;
        }
    }
    
    public boolean ValidarCatalogoCuenta(String numero){
        
        try{
            String ruta_archivo = ruta_archivos + "\\Catalogo cuenta contable.txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                return false;
            }
            
            try (Scanner Lector = new Scanner(Archivo)) {
                
                while(Lector.hasNextLine()){
                    
                    String[] informaciones = Lector.nextLine().split("-");
                    
                    String numeroObtenido = informaciones[0];
                    
                    if(numeroObtenido.equals(numero)){
                        return true;
                    }
                }
                
                return false;
            }
        }
        
        catch(IOException ex){
            return false;
        }
    }
    
    
//    public String Eliminar(String nombre_archivo, int id){
//        try{
//            String ruta_archivo = ruta_archivos + "\\" + nombre_archivo + ".txt"; 
//            Archivo = new File(ruta_archivo);
//        
//            if(!Archivo.exists()){
//                return "No hay datos";
//            }
//            
//            try (Scanner Lector = new Scanner(Archivo)) {
//                
//                while(Lector.hasNextLine()){
//                    
//                    String informaciones = Lector.nextLine();
//                    
//                    String id_obtenido = informaciones.split("-")[0];
//                    
//                    if(id_obtenido.equals(String.valueOf(id))){
//                        
//                        return informaciones;
//                    }
//                }
//            }
//            
//        }
//        
//        catch(IOException ex){
//            return "Ocurrio un error";
//        }
//    }
}
