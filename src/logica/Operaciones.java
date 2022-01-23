package logica;

import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;
import interfaz.*;

public class Operaciones {
	
	//clase de operaciones
	
	static Graficas gf=new Graficas();
	static Archivos ar=new Archivos();
	//meotodo de graficar edad
	public static void graficarEdad(ArrayList<String>array) {
		int can1=0;
		int can2=0;
		int can3=0;
		ArrayList<Integer>array1=new ArrayList<Integer>();
		for (int i = 0; i < array.size(); i++) {
			array1.add(Integer.parseInt(array.get(i)));
		}
		
		for (int i = 0; i < array.size(); i++) {
			if (array1.get(i)>=16&&array1.get(i)<20) {
				can1++;
			}
			else {
				if(array1.get(i)>=20&&array1.get(i)<26) {
					can2++;
				}
				else {
					if(array1.get(i)>=5) {
						can3++;
					}
				}
			}
		}
		gf.graficarEdad(can1, can2, can3);
	}
	//meotodo de graficar genero
	public static void graficarGenero(ArrayList<String>array) {
		int contHombres=0;
		int contMujeres=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("m")) {
				contMujeres++;
			}
			else {
				contHombres++;
			}
		}
		gf.graficaGenero(contHombres, contMujeres);
	}
	
	//meotodo de graficar estrato
	public static void graficarEstrato(ArrayList<String> array) {
		int can1=0;
		int can2=0;
		int can3=0;
		int can4=0;
		int can5=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("1")){
				can1++;
			}
			else {
				if(array.get(i).equals("2")) {
					can2++;
				}
				else {
					if(array.get(i).equals("3")) {
						can3++;
					}
					else {
						if(array.get(i).equals("4")) {
							can4++;
						}
						else {
							can5++;
						}
					}
				}
			}
			
		}
		
		gf.graficaEstrato(can1, can2, can3, can4, can5);
	}
	//meotodo de  graficar estado civil
	public static void graficarEstadoCivil(ArrayList<String> array) {
		int can1=0;
		int can2=0;
		int can3=0;
		int can4=0;
		
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("s")) {
				can1++;
			}
			else {
				if(array.get(i).equals("c")) {
					can2++;
				}
				else {
					if(array.get(i).equals("d")) {
						can3++;
					}
					else {
							can4++;
					}
				}
			}
			
		}
		
		gf.graficarEstadoCivil(can1, can2, can3, can4);
	}
	//meotodo de graficar trabajar actualmente
	public static void graficarTrabajoActual(ArrayList<String>array) {
		int can1=0;
		int can2=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("s")) {
				can1++;
			}
			else {
				can2++;
			}
		}
		
		gf.graficarTrabajoActual(can1, can2);
	}
	//meotodo de graficar personas a cargo
	public static void graficarPersonasACargo(ArrayList<Encuesta>array) {
		int can1=0;
		int can2=0;
		int can3=0;
		int can4=0;
		int can5=0;
		int can6=0;
		int can7=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("0")) {
				can1++;
			}
			else {
				if(array.get(i).equals("1")) {
					can2++;
				}
				else {
					if(array.get(i).equals("2")) {
						can3++;
					}
					else {
						if(array.get(i).equals("3")) {
							can4++;
						}
						else {
							if(array.get(i).equals("4")) {
								can5++;
							}
							else {
								if(array.get(i).equals("5")) {
									can6++;
								}
								else {
									can7++;
								}
							}
						}
					}
				}
			}
			
		}
		gf.graficarPersonasACargo(can1, can2, can3, can4, can5, can6, can7);
	}
	//meotodo de graficar promedio universidad
	public static void graficarPromedioUniversidad(ArrayList<String>array) {
		int can1=0;
		int can2=0;
		int can3=0;
		ArrayList<Double>array1=new ArrayList<Double>();
		for (int i = 0; i < array.size(); i++) {
			array1.add(Double.parseDouble(array.get(i)));
		}
		
		for (int i = 0; i < array.size(); i++) {
			if (array1.get(i)>=3&&array1.get(i)<4) {
				can1++;
			}
			else {
				if(array1.get(i)>=4&&array1.get(i)<5) {
					can2++;
				}
				else {
					if(array1.get(i)==5) {
						can3++;
					}
				}
			}
		}
		gf.graficarPrimedioUniversidad(can1, can2, can3);
	}
	//meotodo de graficar repitente del curso
	public static void graficarRepitente(ArrayList<String>array) {
		int can1=0;
		int can2=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("si")) {
				can1++;
			}
			else {
			can2++;
			}
		}
		gf.graficarRepitente(can1, can2);
	}
	//meotodo de graficar preguntas
	public static void graficarPreguntas(ArrayList<String>array, int pregunta) {
		int can1=0;
		int can2=0;
		int can3=0;
		int can4=0;
		int can5=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("1")) {
				can1++;
			}
			else {
				if(array.get(i).equals("2")) {
					can2++;
				}
				else {
					if(array.get(i).equals("3")) {
						can3++;
					}
					else {
						if(array.get(i).equals("4")) {
							can4++;
						}
						else {
							can5++;
							}
						}
					}
				}
			}
			
		
		gf.graficarPreguntas(can1, can2, can3, can4, can5, pregunta);
	}
	//meotodo de graficar preguntas del test de conocimeinto
	public static void graficarPreguntasTest(ArrayList<String>array, String pregunta) {
		int can1=0;
		int can2=0;
		int can3=0;
		int can4=0;
		int can5=0;
		for (int i = 0; i < array.size(); i++) {
			if(array.get(i).equals("1")) {
				can1++;
			}
			else {
				if(array.get(i).equals("2")) {
					can2++;
				}
				else {
					if(array.get(i).equals("3")) {
						can3++;
					}
					else {
						if(array.get(i).equals("4")) {
							can4++;
						}
						else {
							if(array.get(i).equals("5")) 
							{
								can5++;
							}
							}
						}
					}
				}
			}
			
		
		gf.graficarPreguntasTest(can1, can2, can3, can4, can5, pregunta);
	}
	//metodo de relacion de laas preguntas
	public static void relacion(ArrayList<String>array1,ArrayList<String>array2) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		double mediaX=0;
		double mediaY=0;
		double sumaOperacion3=0;
		double sumaOperacion4=0;
		double sumaOperacion5=0;
		double resultado=0;
		ArrayList<Double> operacion1=new ArrayList<Double>();
		ArrayList<Double> operacion2=new ArrayList<Double>();
		ArrayList<Double> operacion3=new ArrayList<Double>();
		ArrayList<Double> operacion4=new ArrayList<Double>();
		ArrayList<Double> operacion5= new ArrayList<Double>();
		for (int i = 0; i < array1.size(); i++) {
			arr1.add(Integer.parseInt(array1.get(i)));
			arr2.add(Integer.parseInt(array2.get(i)));
		}
		
		for (int i = 0; i < arr1.size(); i++) {
			mediaX+=arr1.get(i);
			mediaY+=arr2.get(i);
		}
		mediaX=mediaX/arr1.size();
		mediaY=mediaY/arr2.size();
		for (int i = 0; i < arr1.size(); i++) {
			operacion1.add(arr1.get(i)-mediaX);
			operacion2.add(arr2.get(i)-mediaY);
		}
		
		for (int i = 0; i < arr2.size(); i++) {
			operacion3.add(Math.pow(operacion1.get(i), 2));
			operacion4.add(Math.pow(operacion2.get(i), 2));
		}
		for (int i = 0; i < arr1.size(); i++) {
			operacion5.add(operacion1.get(i)*operacion2.get(i));
		}
		for (int i = 0; i < arr1.size(); i++) {
			sumaOperacion3+=operacion3.get(i);
			sumaOperacion4+=operacion4.get(i);
			sumaOperacion5+=operacion5.get(i);
		}
		
		resultado=(sumaOperacion5)/((Math.sqrt(sumaOperacion3))*(Math.sqrt(sumaOperacion4)));
		
		if(resultado<0) {
			resultado=resultado*-1;
		}
		
		if(resultado<0.5) {
			JOptionPane.showMessageDialog(null, "Las dos preguntas seleccionadas no comparten relación ya que el valor es: "+ resultado+ " aproximandoce a 0");
		}
		else {
			JOptionPane.showMessageDialog(null, "Las dos preguntas seleccionadas si comparten relación ya que el valor es: "+ resultado+ " aproximandoce a 1");
		}
	}
	//metodo mostrar lista
	public static void mostrarLista(ArrayList<String>array) {
		ArrayList<String>lista=new ArrayList<String>();
			for (int i = 0; i < array.size(); i++) {
				if(array.get(i).equals("5")) {
					lista.add(array.get(i));
					array.remove(i);
				}
			}
			for (int i = 0; i < array.size(); i++) {
				if(array.get(i).equals("4")) {
					lista.add(array.get(i));
					array.remove(i);
				}
			}
			for (int i = 0; i < array.size(); i++) {
				if(array.get(i).equals("3")) {
					lista.add(array.get(i));
					array.remove(i);
				}
			}
			for (int i = 0; i < array.size(); i++) {
				if(array.get(i).equals("2")) {
					lista.add(array.get(i));
					array.remove(i);
				}
			}
			for (int i = 0; i < array.size(); i++) {
				if(array.get(i).equals("1")) {
					lista.add(array.get(i));
					array.remove(i);
				}
			}
			String f="";
			for (int i = 0; i < lista.size(); i++) {
				f+=  i+1+":    "+lista.get(i)+"\n";
			}
			JOptionPane.showMessageDialog(null, f);
	}
	
	public static void main(String []args) {
		ArrayList<String> a=new ArrayList<String>();
		
		a.add("5");
		a.add("3");
		a.add("5");
		a.add("1");
		a.add("1");
		
		mostrarLista(a);

	}
	
	
}//fin de la clase