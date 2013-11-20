package prescriptions.domain.entity;

import javax.persistence.Entity;

@Entity
public class Caratula extends PersistentEntity {
	
	private String ser_carat;
	private Integer cod_carat;
	private Integer expediente;
	private Integer delegacion;
	private Integer cod_obsoc;
	private Integer cod_plan;
	private String periodo;
	private Integer cod_farma;
	private Double mto_total;
	private Double mto_ac;
	private Integer can_rec;
	private Integer can_rec_real;
	private Integer caja;
	private Integer refacturacion;
	private Integer cargadas = 0;
	
	public Caratula() {
	}
	
	public Caratula(String ser_carat, Integer cod_carat) {
		this.ser_carat = ser_carat;
		this.cod_carat = cod_carat;
	}
	
	public void cargar() {
		this.cargadas++;
	}

	public String getSer_carat() {
		return ser_carat;
	}

	public void setSer_carat(String ser_carat) {
		this.ser_carat = ser_carat;
	}

	public Integer getCod_carat() {
		return cod_carat;
	}

	public void setCod_carat(Integer cod_carat) {
		this.cod_carat = cod_carat;
	}

	public Integer getCargadas() {
		return cargadas;
	}

	public void setCargadas(Integer cargadas) {
		this.cargadas = cargadas;
	}

	public Integer getExpediente() {
		return expediente;
	}

	public void setExpediente(Integer expediente) {
		this.expediente = expediente;
	}

	public Integer getDelegacion() {
		return delegacion;
	}

	public void setDelegacion(Integer delegacion) {
		this.delegacion = delegacion;
	}

	public Integer getCod_obsoc() {
		return cod_obsoc;
	}

	public void setCod_obsoc(Integer cod_obsoc) {
		this.cod_obsoc = cod_obsoc;
	}

	public Integer getCod_plan() {
		return cod_plan;
	}

	public void setCod_plan(Integer cod_plan) {
		this.cod_plan = cod_plan;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Integer getCod_farma() {
		return cod_farma;
	}

	public void setCod_farma(Integer cod_farma) {
		this.cod_farma = cod_farma;
	}

	public Double getMto_total() {
		return mto_total;
	}

	public void setMto_total(Double mto_total) {
		this.mto_total = mto_total;
	}

	public Double getMto_ac() {
		return mto_ac;
	}

	public void setMto_ac(Double mto_ac) {
		this.mto_ac = mto_ac;
	}

	public Integer getCan_rec() {
		return can_rec;
	}

	public void setCan_rec(Integer can_rec) {
		this.can_rec = can_rec;
	}

	public Integer getCan_rec_real() {
		return can_rec_real;
	}

	public void setCan_rec_real(Integer can_rec_real) {
		this.can_rec_real = can_rec_real;
	}

	public Integer getCaja() {
		return caja;
	}

	public void setCaja(Integer caja) {
		this.caja = caja;
	}

	public Integer getRefacturacion() {
		return refacturacion;
	}

	public void setRefacturacion(Integer refacturacion) {
		this.refacturacion = refacturacion;
	}

}
