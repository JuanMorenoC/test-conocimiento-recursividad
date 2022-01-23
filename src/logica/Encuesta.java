package logica;

public class Encuesta {

	//clase de encuesta
	public String genero;
	public int estratoSocioeconomico;
	public String estadoCivil;
	public String trabajaActual;
	public int numeroPersonasCargo;
	public double promedioAcumulado;
	public String repitenteCurso;
	public String egresadoColegio;
	public double pormedioColegia;
	public double icfes;
	public String nivelEducativoMadre;
	public String nivelEducativoPadre;
	public String tipoVivienda;




	public Encuesta(String genero,int estratoSocioeconomico,String estadoCivil,String trabajaActual,int numeroPersonasCargo,double promedioAcumulado ) {
//		 , String repitenteCurso, String egresadoColegio,
//		double pormedioColegia, double icfes, String nivelEducativoMadre, String nivelEducativoPadre,
//		String tipoVivienda
		super();
		this.genero = genero;
		this.estratoSocioeconomico = estratoSocioeconomico;
		this.estadoCivil = estadoCivil;
		this.trabajaActual = trabajaActual;
		this.numeroPersonasCargo = numeroPersonasCargo;
		this.promedioAcumulado = promedioAcumulado;
		this.repitenteCurso = repitenteCurso;
		this.egresadoColegio = egresadoColegio;
		this.pormedioColegia = pormedioColegia;
		this.icfes = icfes;
		this.nivelEducativoMadre = nivelEducativoMadre;
		this.nivelEducativoPadre = nivelEducativoPadre;
		this.tipoVivienda = tipoVivienda;

	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEstratoSocioeconomico() {
		return estratoSocioeconomico;
	}
	public void setEstratoSocioeconomico(int estratoSocioeconomico) {
		this.estratoSocioeconomico = estratoSocioeconomico;
	}
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getTrabajaActual() {
		return trabajaActual;
	}
	public void setTrabajaActual(String trabajaActual) {
		this.trabajaActual = trabajaActual;
	}
	public int getNumeroPersonasCargo() {
		return numeroPersonasCargo;
	}
	public void setNumeroPersonasCargo(int numeroPersonasCargo) {
		this.numeroPersonasCargo = numeroPersonasCargo;
	}
	public double getPromedioAcumulado() {
		return promedioAcumulado;
	}
	public void setPromedioAcumulado(double promedioAcumulado) {
		this.promedioAcumulado = promedioAcumulado;
	}
	public String getRepitenteCurso() {
		return repitenteCurso;
	}
	public void setRepitenteCurso(String repitenteCurso) {
		this.repitenteCurso = repitenteCurso;
	}
	public String getEgresadoColegio() {
		return egresadoColegio;
	}
	public void setEgresadoColegio(String egresadoColegio) {
		this.egresadoColegio = egresadoColegio;
	}
	public double getPormedioColegia() {
		return pormedioColegia;
	}
	public void setPormedioColegia(double pormedioColegia) {
		this.pormedioColegia = pormedioColegia;
	}
	public double getIcfes() {
		return icfes;
	}
	public void setIcfes(double icfes) {
		this.icfes = icfes;
	}
	public String getNivelEducativoMadre() {
		return nivelEducativoMadre;
	}
	public void setNivelEducativoMadre(String nivelEducativoMadre) {
		this.nivelEducativoMadre = nivelEducativoMadre;
	}
	public String getNivelEducativoPadre() {
		return nivelEducativoPadre;
	}
	public void setNivelEducativoPadre(String nivelEducativoPadre) {
		this.nivelEducativoPadre = nivelEducativoPadre;
	}
	public String getTipoVivienda() {
		return tipoVivienda;
	}
	public void setTipoVivienda(String tipoVivienda) {
		this.tipoVivienda = tipoVivienda;
	}
	
	
	
	

	
}//fin de la clase
