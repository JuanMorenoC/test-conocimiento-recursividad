package logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

public class Archivos 
{
	// Clase de Archivos
	Operaciones opera;
	File archivo1 = null;
	File archivo2 = null;
	File archivo3 = null;
	File archivo4 = null;
	File archivo5 = null;
	File archivo6 = null;
	
	ArrayList<String> correlacion1;
	ArrayList<String> correlacion2;
	FileReader fr = null;
    BufferedReader br = null;
    FileWriter fw = null;
    BufferedWriter bw = null;
    
    //Constructor de la clase Archivos
    public Archivos()
    {
    	
    	opera=new Operaciones();
    	correlacion1=new ArrayList<String>();
    	correlacion2=new ArrayList<String>();
    	archivo1 = new File("C:\\Users\\ABSALON MORENO P\\workspace\\Proyecto Final Analisis\\conocimientoprevio.txt"); //pregunta conocimeinto previo
    	archivo2 = new File("aptitud.txt"); //pregunta actitud y aptitud
    	archivo3 = new File("C:\\Users\\ABSALON MORENO P\\workspace\\Proyecto Final Analisis\\conocimientorecursividad.txt"); //pregunta conocimiento recursividad
    	archivo4 = new File("C:\\Users\\ABSALON MORENO P\\workspace\\Proyecto Final Analisis\\dificultad.txt"); // dificultades de aprendizaje
    	archivo5 = new File("C:\\Users\\ABSALON MORENO P\\workspace\\Proyecto Final Analisis\\datospersona.txt"); // datos dela personna
    	archivo6 = new File("C:\\Users\\ABSALON MORENO P\\workspace\\Proyecto Final Analisis\\test.txt"); // 5 preguntas 
    }
    public void lectura()
    {
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo1);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	
    }
    
    public void escribir(String linea)
    {
    	try
        {
    		 // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
           
            fw = new FileWriter("");
            bw = new BufferedWriter(fw);
            bw.write(linea);
			bw.newLine();
			bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }    	
    }
    
    //metodo de almacenar archivo conocimiento previo
    public void almacenaArchivo1(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6, String tf7, 
    		String tf8)
    {
    	try
        {
    		 fr = new FileReader (archivo1);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cad=null;
             int cont=0;
             ArrayList<String> array = new ArrayList<String>();
             while((cad=br.readLine())!=null)
             {
             	array.add(cad);
             	cont++;
             }
             String linea = tf1 + ";" + tf2 + ";" + tf3 + ";" + tf4 + ";" + tf5 + ";" + tf6 + ";" + tf7 + ";" + tf8;
             array.add(linea);
             for (int i = 0; i < array.size(); i++) {
     			if (i == 0) {
     				fw = new FileWriter(archivo1);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			} else {
     				fw = new FileWriter(archivo1, true);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			}
     		}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
  //metodo de almacenar archivo aptitud y actitud
    public void almacenaArchivo2(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6, String tf7, 
    		String tf8, String tf9)
    {
    	try
        {
    		 fr = new FileReader (archivo2);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cad=null;
             int cont=0;
             ArrayList<String> array = new ArrayList<String>();
             while((cad=br.readLine())!=null)
             {
             	array.add(cad);
             	cont++;
             }
             String linea = tf1 + ";" + tf2 + ";" + tf3 + ";" + tf4 + ";" + tf5 + ";" + tf6 + ";" + tf7 + ";" + tf8 + ";" + tf9;
             array.add(linea);
             for (int i = 0; i < array.size(); i++) {
     			if (i == 0) {
     				fw = new FileWriter(archivo2);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			} else {
     				fw = new FileWriter(archivo2, true);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			}
     		}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
  //metodo de almacenar archivo conocimiento recursivo
    public void almacenaArchivo3(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6, String tf7, 
    		String tf8)
    {
    	
    	try
        {
    		 fr = new FileReader (archivo3);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cad=null;
             int cont=0;
             ArrayList<String> array = new ArrayList<String>();
             while((cad=br.readLine())!=null)
             {
             	array.add(cad);
             	cont++;
             }
             String linea = tf1 + ";" + tf2 + ";" + tf3 + ";" + tf4 + ";" + tf5 + ";" + tf6 + ";" + tf7 + ";" + tf8;
             array.add(linea);
             for (int i = 0; i < array.size(); i++) {
     			if (i == 0) {
     				fw = new FileWriter(archivo3);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			} else {
     				fw = new FileWriter(archivo3, true);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			}
     		}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
  //metodo de almacenar archivo dificultad de aprendizaje
    public void almacenaArchivo4(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6)
    {
    	
    	try
        {
    		 fr = new FileReader (archivo4);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cad=null;
             int cont=0;
             ArrayList<String> array = new ArrayList<String>();
             while((cad=br.readLine())!=null)
             {
             	array.add(cad);
             	cont++;
             }
             String linea = tf1 + ";" + tf2 + ";" + tf3 + ";" + tf4 + ";" + tf5 + ";" + tf6;
             array.add(linea);
             for (int i = 0; i < array.size(); i++) {
     			if (i == 0) {
     				fw = new FileWriter(archivo4);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			} else {
     				fw = new FileWriter(archivo4, true);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			}
     		}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
  //metodo de almacenar archivo datos de la persona
    public void almacenaArchivo5(String tf1, String tf2, String tf3, String tf4, String tf5, String tf6, String tf7, 
    		String tf8, String tf9, String tf10, String tf11, String tf12, String tf13, String tf14, String tf15, 
    		String tf16, String tf17)
    {
    	
    	try
        {
    		 fr = new FileReader (archivo5);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cad=null;
             int cont=0;
             ArrayList<String> array = new ArrayList<String>();
             while((cad=br.readLine())!=null)
             {
             	array.add(cad);
             	cont++;
             }
             String linea = tf1 + ";" + tf2 + ";" + tf3 + ";" + tf4 + ";" + tf5 + ";" + tf6 + ";" + tf7 + ";" + tf8
         			+ tf9 + ";" + tf10 + ";" + tf11 + ";" + tf12 + ";" + tf13 + ";" + tf14 + ";" + tf15 + ";" + tf16 + ";" + tf17;
             array.add(linea);
             for (int i = 0; i < array.size(); i++) {
     			if (i == 0) {
     				fw = new FileWriter(archivo5);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			} else {
     				fw = new FileWriter(archivo5, true);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			}
     		}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    //metodo de almacenar archivo del test de conocimiento
    public void almacenaArchivo6(String tf1, String tf2, String tf3, String tf4, String tf5)
    {
    	
    	try
        {
    		 fr = new FileReader (archivo6);
             br = new BufferedReader(fr);

             // Lectura del fichero
             String cad=null;
             int cont=0;
             ArrayList<String> array = new ArrayList<String>();
             while((cad=br.readLine())!=null)
             {
             	array.add(cad);
             	cont++;
             }
             String linea = tf1 + ";" + tf2 + ";" + tf3 + ";" + tf4 + ";" + tf5;
             array.add(linea);
             for (int i = 0; i < array.size(); i++) {
     			if (i == 0) {
     				fw = new FileWriter(archivo6);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			} else {
     				fw = new FileWriter(archivo6, true);
     				bw = new BufferedWriter(fw);
     				bw.write(array.get(i));
     				bw.newLine();
     				bw.close();
     			}
     		}

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fw)
              fw.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
    //meotodo de leer archivo conocimeinto previo
    public void leerArchivo1(int posicion,int numero)
    {
    	ArrayList<String> arch1=new ArrayList<>();
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo1);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	String tf1 = arreglo[posicion];
            	arch1.add(tf1);
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	
    	opera.graficarPreguntas(arch1,numero);
    	
    }
  //meotodo de leer archivo aptitud y actitud
    public void leerArchivo2(int posicion,int numero)
    {
    	ArrayList<String> arch1=new ArrayList<>();
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo2);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	String tf1 = arreglo[posicion];
            	arch1.add(tf1);
            }
           
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	opera.graficarPreguntas(arch1,numero);
    	
    }
  //meotodo de leer archivo conocimiento recursividad
    public void leerArchivo3(int posicion,int numero)
    {
    	ArrayList<String> arch1=new ArrayList<>();
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo3);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	String tf1 = arreglo[posicion];
            	arch1.add(tf1);
            }
           
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	opera.graficarPreguntas(arch1,numero);
    	
    }
  //meotodo de leer archivo difiultad de aprendizaje
    public void leerArchivo4(int posicion, int numero)
    {
    	ArrayList<String> arch1=new ArrayList<>();
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo4);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	String tf1 = arreglo[posicion];
            	arch1.add(tf1);
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	opera.graficarPreguntas(arch1,numero);
    	
    }
  //meotodo de leer archivo datos de la persona
    public void leerArchivo5(int posicion)
    {
    	ArrayList<String> arch1=new ArrayList<>();
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo5);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	String tf1 = arreglo[posicion];
            	arch1.add(tf1);
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	if (posicion==0) {
			opera.graficarEdad(arch1);
		}
    	else{
    		if(posicion==1){
    			opera.graficarGenero(arch1);
    		}
    		else{
    			opera.graficarEstrato(arch1);
    		}
    	}
    	
    }
  //meotodo de leer archivo test de conocimiento 
    public void leerArchivo6(int posicion, int numero)
    {
    	ArrayList<String> arch1=new ArrayList<>();
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo6);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	String tf1 = arreglo[posicion];
            	arch1.add(tf1);
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	opera.graficarPreguntas(arch1,numero);
    	arch1.clear();
    }
    public void leerArchivos1(int posicion1, int posicion2)
    {
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo1);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	if (cont==posicion1) {
            		
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion1.add(arreglo[i]);
					}
            		
				}
            	if(cont==posicion2) {
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion2.add(arreglo[i]);
					}
            	}
            	 cont++;
            	System.out.println(cont);
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    	
    	opera.relacion(correlacion1, correlacion2);
    }
    
    public void leerArchivos2(int posicion1, int posicion2)
    {
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo2);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	if (cont==posicion1) {
            		
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion1.add(arreglo[i]);
					}
            		
				}
            	if(cont==posicion2) {
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion2.add(arreglo[i]);
					}
            	}
            	 cont++;
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    }
    
    public void leerArchivos3(int posicion1,int posicion2)
    {
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo3);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	if (cont==posicion1) {
            		
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion1.add(arreglo[i]);
					}
            		
				}
            	if(cont==posicion2) {
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion2.add(arreglo[i]);
					}
            	}
            	 cont++;
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    }
    
    public void leerArchivos4(int posicion1, int posicion2)
    {
    	try {
            // Apertura del fichero y creacion de BufferedReader para poder
            // hacer una lectura comoda (disponer del metodo readLine()).
            fr = new FileReader (archivo4);
            br = new BufferedReader(fr);

            // Lectura del fichero
            String linea;
            int cont=0;
            while((linea=br.readLine())!=null)
            {
            	String arreglo[] = linea.split(";");
            	if (cont==posicion1) {
            		
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion1.add(arreglo[i]);
					}
            		
				}
            	if(cont==posicion2) {
            		for (int i = 0; i < arreglo.length; i++) {
            			correlacion2.add(arreglo[i]);
					}
            	}
            	 cont++;
            }
         }
         catch(Exception e){
            e.printStackTrace();
         }finally{
            // En el finally cerramos el fichero, para asegurarnos
            // que se cierra tanto si todo va bien como si salta 
            // una excepcion.
            try{                    
               if( null != fr ){   
                  fr.close();     
               }                  
            }catch (Exception e2){ 
               e2.printStackTrace();
            }
         }
    }
}//fin de la clase