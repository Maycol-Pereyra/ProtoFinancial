
package servicios;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Archivos {
    
    File Archivo;
    
    public Archivos(){
        
        String ruta_carpeta = "/Source Packages/archivos";
        File Carpeta = new File(ruta_carpeta);
        
        if(!Carpeta.exists()){
            Carpeta.mkdir();
        }
           
    }
    
    public String Insertar(String nombre_archivo, String[] datos) throws IOException{
        
        try{
            
            String ruta_archivo = "/archivos/" + nombre_archivo + ".txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                Archivo.createNewFile();
            }
            
            try (FileWriter Escritor = new FileWriter(ruta_archivo)) {
                String informaciones = "";
                
                for(int i=0; i<datos.length; i++){
                    
                    if(i != 0){
                        datos[i] = String.join("-", datos[i]);
                    }
                    
                    informaciones += datos[i];
                }
                
                Escritor.write(informaciones);
            }
            return "Insertado correctamente";
        
        }
        
        catch(IOException ex){
            return("Ocurrio un error " + ex);
        }
        
       
        
    }
    
    public String ObtenerDato(String nombre_archivo, int id){
     
        try{
            String ruta_archivo = "/archivos/" + nombre_archivo + ".txt"; 
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
    
    public String ObtenerDatos(String nombre_archivo){
        try{
            
            String ruta_archivo = "/archivos/" + nombre_archivo + ".txt"; 
            Archivo = new File(ruta_archivo);
        
            if(!Archivo.exists()){
                return "No hay datos";
            }
            
            String informaciones = "";
            
            try (Scanner Lector = new Scanner(Archivo)) {
                
                while(Lector.hasNextLine()){
                    
                    informaciones += String.join("/", Lector.nextLine());
                  
                }
            }
            
            return informaciones;
            
        }
        
        catch(IOException ex){
            return("Ocurrio un error");
        }
    }
    
    public int ObtenerId(String nombre_archivo){
        //Falta implementacion
        return 0;
    }
}
