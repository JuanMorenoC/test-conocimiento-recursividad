package interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.jfree.chart.*;
import org.jfree.data.category.*;
import org.jfree.chart.plot.*;

public class Graficas {

	
	public Graficas() {
		
	}
	public void graficarEdad(int can1, int can2,int can3) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
		data.addValue(can1,"Respuesta 1","Entre 16 y 20");
		data.addValue(can2,"Respuesta 2","Entre 20 y 26");
		data.addValue(can3,"Respuesta 3","Mas de 26");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Edad de los encuestados", "Edad", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	public  void graficaGenero(int contHombres, int contMujeres) {
		DefaultCategoryDataset data =new DefaultCategoryDataset();
//		final String hombre="Hombres";
//		final String mujer="Mujeres";
		
		data.addValue(contHombres, "Respuesta 1", "Hombres");
		data.addValue(contMujeres, "Respuesta 2", "Mujeres");
		
		JFreeChart grafica= ChartFactory.createBarChart3D("Grafica de generos", "Generos", "Cantidad de hombres y mujeres", data, PlotOrientation.VERTICAL, true, true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public  void graficaEstrato(int can1,int can2,int can3,int can4,int can5) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
//		final String respuesta1="Respuesta 1";
//		final String respuesta2="Respuesta 2";
//		final String respuesta3="Respuesta 3";
//		final String respuesta4="Respuesta 4";
//		final String respuesta5="Respuesta 5";
		data.addValue(can1, "Respuesta 1", "1");
		data.addValue(can2, "Respuesta 2", "2");
		data.addValue(can3, "Respuesta 3", "3");
		data.addValue(can4, "Respuesta 4", "4");
		data.addValue(can5, "Respuesta 5", "5");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Estrato Socioeconomico", "Estrato", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public  void graficarEstadoCivil(int can1,int can2,int can3,int can4) {
		DefaultCategoryDataset data = new DefaultCategoryDataset();
		final String respuesta1="Soltero(a)";
		final String respuesta2="Casado(a)/Union Libre";
		final String respuesta3="Separado(a)/Divorciado";
		final String respuesta4="Viudo(a)";
		data.addValue(can1, "Respuesta 1", "Soltero(a)");
		data.addValue(can2, "Respuesta 2", "Casado(a)/Union Libre");
		data.addValue(can3, "Respuesta 3", "Separado(a)/Divorciado");
		data.addValue(can4, "Respuesta 4", "Viudo(a)");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Estadi Civil", "Estado Civil", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);		
	}
	
	public  void graficarTrabajoActual(int can1,int can2) {
		DefaultCategoryDataset data = new DefaultCategoryDataset();
//		final String respuesta1 ="Si";
//		final String respuesta2="No";
		data.addValue(can1, "Respuesta 1", "Si");
		data.addValue(can2, "Respuesta 2", "No");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Trabajo Actual", "Trabaja Actual", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public  void graficarPersonasACargo(int can1,int can2,int can3,int can4,int can5,int can6,int can7) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
//		final String respuesta1="0";
//		final String respuesta2="1";
//		final String respuesta3="2";
//		final String respuesta4="3";
//		final String respuesta5="4";
//		final String respuesta6="5";
//		final String respuesta7="Mas de 6";
		data.addValue(can1,"Respuesta 1", "Cantidad de personas: 0");
		data.addValue(can2, "Respeuesta 2", "Cantidad de personas: 1");
		data.addValue(can3, "Respuesta 3", "Cantidad de personas: 2");
		data.addValue(can4, "Respuesta 4", "Cantidad de personas: 3");
		data.addValue(can5, "Respuesta 5", "Cantidad de personas: 4");
		data.addValue(can6, "Respuesta 6", "Cantidad de personas: 5");
		data.addValue(can7, "Respuesta 7", "Cantidad de personas: mas de  6");
		
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Personas a cargo", "Personas a cargo", "Respuestas", data, PlotOrientation.VERTICAL,false , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public void graficarPrimedioUniversidad(int can1,int can2,int can3) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
//		final String respuesta1="Entre 3 y 4";
//		final String respuesta2="Entre 4 y 5";
//		final String respuesta3="Entre 5";
		data.addValue(can1,"Respuesta 1","Entre 3 y 4");
		data.addValue(can2,"Respuesta 2","Entre 4 y 5");
		data.addValue(can3,"Respuesta 3","5");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Promedio actual en la Universidad", "Promedio Actual", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public void graficarRepitente(int can1,int can2) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
		final String respuesta1="Si";
		final String respuesta2="No";
		data.addValue(can1, "Respuesta 1", respuesta1);
		data.addValue(can2, "Respuesta 2", respuesta2);
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Repitente del curso", "Repitente del curso", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public void graficarPreguntas(int can1,int can2,int can3,int can4,int can5,int pregunta) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
		data.addValue(can1, "Respuesta 1", "Opcion 1");
		data.addValue(can2, "Respuesa 2", "Opcion 2");
		data.addValue(can3, "Respuesta 3", "Opcion 3");
		data.addValue(can4, "Respuesta 4", "Opcion 4");
		data.addValue(can5, "Respuesta 5", "Opcion 5");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Pregunta "+pregunta, "Datos", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
	
	public void graficarPreguntasTest(int can1,int can2,int can3,int can4,int can5,String pregunta) {
		DefaultCategoryDataset data=new DefaultCategoryDataset();
		data.addValue(can1, "Respuesta 1", "Opcion 1");
		data.addValue(can2, "Respuesa 2", "Opcion 2");
		data.addValue(can3, "Respuesta 3", "Opcion 3");
		data.addValue(can4, "Respuesta 4", "Opcion 4");
		data.addValue(can5, "Respuesta 5", "Opcion 5");
		JFreeChart grafica=ChartFactory.createBarChart3D("Grafica Pregunta "+pregunta+" del test", "Datos", "Respuestas", data, PlotOrientation.VERTICAL,true , true, false);
		ChartPanel contenedor=new ChartPanel(grafica);
		JFrame ventana = new JFrame("Graficas");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.add(contenedor);
		ventana.setSize(600,600);
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
	}
}
