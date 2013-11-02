package prescriptions.domain.entity;

import javax.persistence.Entity;

@Entity
public class Alfabeta extends PersistentEntity {

	private String troquel;
	private String nombre;
	private String presentacion;
	private String IOMA;
	private String IOMA2;
	private String IOMA3;
	private String nombreLaboratorio;
	private int precio;
	private String fecha;
	private String marcaDeProductoControlado;
	private int importado;
	private int tipoDeVenta;
	private int IVA;
	private String codDescuentoPami;
	private int codLab;
	private int registro;
	private int baja;
	private String barras;
	private int unidades;
	private String tamanio;
	private int heladera;
	private String SIFAR;
	private String bajaEspecial;
	private int blanco;
	
	public Alfabeta() {}

	public String getTroquel() {
		return troquel;
	}

	public void setTroquel(String troquel) {
		this.troquel = troquel;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getIOMA() {
		return IOMA;
	}

	public void setIOMA(String iOMA) {
		IOMA = iOMA;
	}

	public String getIOMA2() {
		return IOMA2;
	}

	public void setIOMA2(String iOMA2) {
		IOMA2 = iOMA2;
	}

	public String getIOMA3() {
		return IOMA3;
	}

	public void setIOMA3(String iOMA3) {
		IOMA3 = iOMA3;
	}

	public String getNombreLaboratorio() {
		return nombreLaboratorio;
	}

	public void setNombreLaboratorio(String nombreLaboratorio) {
		this.nombreLaboratorio = nombreLaboratorio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getMarcaDeProductoControlado() {
		return marcaDeProductoControlado;
	}

	public void setMarcaDeProductoControlado(String marcaDeProductoControlado) {
		this.marcaDeProductoControlado = marcaDeProductoControlado;
	}

	public int getImportado() {
		return importado;
	}

	public void setImportado(int importado) {
		this.importado = importado;
	}

	public int getTipoDeVenta() {
		return tipoDeVenta;
	}

	public void setTipoDeVenta(int tipoDeVenta) {
		this.tipoDeVenta = tipoDeVenta;
	}

	public int getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	public String getCodDescuentoPami() {
		return codDescuentoPami;
	}

	public void setCodDescuentoPami(String codDescuentoPami) {
		this.codDescuentoPami = codDescuentoPami;
	}

	public int getCodLab() {
		return codLab;
	}

	public void setCodLab(int codLab) {
		this.codLab = codLab;
	}

	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public int getBaja() {
		return baja;
	}

	public void setBaja(int baja) {
		this.baja = baja;
	}

	public String getBarras() {
		return barras;
	}

	public void setBarras(String barras) {
		this.barras = barras;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public int getHeladera() {
		return heladera;
	}

	public void setHeladera(int heladera) {
		this.heladera = heladera;
	}

	public String getSIFAR() {
		return SIFAR;
	}

	public void setSIFAR(String sIFAR) {
		SIFAR = sIFAR;
	}

	public String getBajaEspecial() {
		return bajaEspecial;
	}

	public void setBajaEspecial(String bajaEspecial) {
		this.bajaEspecial = bajaEspecial;
	}

	public int getBlanco() {
		return blanco;
	}

	public void setBlanco(int blanco) {
		this.blanco = blanco;
	}
	
	
}
