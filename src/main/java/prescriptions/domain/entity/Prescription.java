package prescriptions.domain.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Prescription extends PersistentEntity {

	private Integer pago = 0;
	
	@ManyToOne
	private Role creator;
	
	// Caratula
	private String ser_carat;
	private Integer cod_carat;
	private Integer expediente;
	private final Integer delegacion = 0;
	private Integer cod_obsoc;
	private Integer cod_plan;
	private String periodo; // YYYYMMPN
	private Integer cod_farma;
	private Integer caja;
	
	// Receta
	private String ser_receta = "";
	private Integer num_receta = 0;
	private Integer orden; // max 3 digitos
	private Integer fec_prescr; // YYYYMMDD
	private Integer fec_disp; // YYYYMMDD
	private String let_matricula; // N, P o X
	private Integer num_matricula; // 0 si es ilegible
	private Integer tot_rec;
	private Integer tot_afil;
	private Integer tot_ac;
	private Integer ajuste; // y ajusteParcial??
	private Integer ajuste_parcial; // y ajusteParcial??
	private String rechazos; // dos digitos por cada rechazo, sale de una tabla...what?
	private Integer posee_ticket; // 0 o 1
	private Integer posee_marca_comercial; // 0 o 1
	private final String ser_vale = "";
	private final Integer cod_vale = 0;
	
	// Afiliado
	private Integer num_afi;
	private Integer parentesco;
	private final String sexo = "0";
	private final String trat_prolongado = "0";
	private final String tipo_documento = "";
	private final Integer num_documento = 0;
	private final String fec_nacimiento = "19000101";
	private final String telefono = "0";
	
	// Codigo de barras?	
	private String cod_barra_1; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
	private Integer can_presc_1;  //
	private Integer can_disp_1;	//	los 3 iguales
	private Integer can_real_1;	//
	private Integer pciorp_1;	//
	private Integer pcio_real_1;	//	los 2 iguales
	private Integer troquel_1;	// 7 digitos
	private Integer laboratorio_1;
	private Integer alfabeta_1;
	
	// Codigo de barras?	
	private String cod_barra_2; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
	private Integer can_presc_2;  //
	private Integer can_disp_2;	//	los 3 iguales
	private Integer can_real_2;	//
	private Integer pciorp_2;	//
	private Integer pcio_real_2;	//	los 2 iguales
	private Integer troquel_2;	// 7 digitos
	private Integer laboratorio_2;
	private Integer alfabeta_2;
	
	// Codigo de barras?	
	private String cod_barra_3; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
	private Integer can_presc_3;  //
	private Integer can_disp_3;	//	los 3 iguales
	private Integer can_real_3;	//
	private Integer pciorp_3;	//
	private Integer pcio_real_3;	//	los 2 iguales
	private Integer troquel_3;	// 7 digitos
	private Integer laboratorio_3;
	private Integer alfabeta_3;
	
	public Prescription() {
		
	}

	public Prescription(Integer pago, String ser_carat, Integer cod_carat,
			Integer expediente, Integer cod_obsoc, Integer cod_plan,
			String periodo, Integer cod_farma, Integer caja, String ser_receta,
			Integer num_receta, Integer orden, Integer fec_prescr,
			Integer fec_disp, String let_matricula, Integer num_matricula,
			Integer tot_rec, Integer tot_afil, Integer tot_ac, Integer ajuste,
			Integer ajuste_parcial, String rechazos, Integer posee_ticket,
			Integer posee_marca_comercial, Integer num_afi, Integer parentesco,
			String cod_barra_1, Integer can_presc_1, Integer can_disp_1,
			Integer can_real_1, Integer pciorp_1, Integer pcio_real_1,
			Integer troquel_1, Integer laboratorio_1, Integer alfabeta_1,
			String cod_barra_2, Integer can_presc_2, Integer can_disp_2,
			Integer can_real_2, Integer pciorp_2, Integer pcio_real_2,
			Integer troquel_2, Integer laboratorio_2, Integer alfabeta_2,
			String cod_barra_3, Integer can_presc_3, Integer can_disp_3,
			Integer can_real_3, Integer pciorp_3, Integer pcio_real_3,
			Integer troquel_3, Integer laboratorio_3, Integer alfabeta_3) {
		super();
		this.pago = pago;
		this.ser_carat = ser_carat;
		this.cod_carat = cod_carat;
		this.expediente = expediente;
		this.cod_obsoc = cod_obsoc;
		this.cod_plan = cod_plan;
		this.periodo = periodo;
		this.cod_farma = cod_farma;
		this.caja = caja;
		this.ser_receta = ser_receta;
		this.num_receta = num_receta;
		this.orden = orden;
		this.fec_prescr = fec_prescr;
		this.fec_disp = fec_disp;
		this.let_matricula = let_matricula;
		this.num_matricula = num_matricula;
		this.tot_rec = tot_rec;
		this.tot_afil = tot_afil;
		this.tot_ac = tot_ac;
		this.ajuste = ajuste;
		this.ajuste_parcial = ajuste_parcial;
		this.rechazos = rechazos;
		this.posee_ticket = posee_ticket;
		this.posee_marca_comercial = posee_marca_comercial;
		this.num_afi = num_afi;
		this.parentesco = parentesco;
		this.cod_barra_1 = cod_barra_1;
		this.can_presc_1 = can_presc_1;
		this.can_disp_1 = can_disp_1;
		this.can_real_1 = can_real_1;
		this.pciorp_1 = pciorp_1;
		this.pcio_real_1 = pcio_real_1;
		this.troquel_1 = troquel_1;
		this.laboratorio_1 = laboratorio_1;
		this.alfabeta_1 = alfabeta_1;
		this.cod_barra_2 = cod_barra_2;
		this.can_presc_2 = can_presc_2;
		this.can_disp_2 = can_disp_2;
		this.can_real_2 = can_real_2;
		this.pciorp_2 = pciorp_2;
		this.pcio_real_2 = pcio_real_2;
		this.troquel_2 = troquel_2;
		this.laboratorio_2 = laboratorio_2;
		this.alfabeta_2 = alfabeta_2;
		this.cod_barra_3 = cod_barra_3;
		this.can_presc_3 = can_presc_3;
		this.can_disp_3 = can_disp_3;
		this.can_real_3 = can_real_3;
		this.pciorp_3 = pciorp_3;
		this.pcio_real_3 = pcio_real_3;
		this.troquel_3 = troquel_3;
		this.laboratorio_3 = laboratorio_3;
		this.alfabeta_3 = alfabeta_3;
	}

	public Integer getPago() {
		return pago;
	}

	public void setPago(Integer pago) {
		this.pago = pago;
	}

	public Role getCreator() {
		return creator;
	}

	public void setCreator(Role creator) {
		this.creator = creator;
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

	public Integer getExpediente() {
		return expediente;
	}

	public void setExpediente(Integer expediente) {
		this.expediente = expediente;
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

	public Integer getCaja() {
		return caja;
	}

	public void setCaja(Integer caja) {
		this.caja = caja;
	}

	public String getSer_receta() {
		return ser_receta;
	}

	public void setSer_receta(String ser_receta) {
		this.ser_receta = ser_receta;
	}

	public Integer getNum_receta() {
		return num_receta;
	}

	public void setNum_receta(Integer num_receta) {
		this.num_receta = num_receta;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public Integer getFec_prescr() {
		return fec_prescr;
	}

	public void setFec_prescr(Integer fec_prescr) {
		this.fec_prescr = fec_prescr;
	}

	public Integer getFec_disp() {
		return fec_disp;
	}

	public void setFec_disp(Integer fec_disp) {
		this.fec_disp = fec_disp;
	}

	public String getLet_matricula() {
		return let_matricula;
	}

	public void setLet_matricula(String let_matricula) {
		this.let_matricula = let_matricula;
	}

	public Integer getNum_matricula() {
		return num_matricula;
	}

	public void setNum_matricula(Integer num_matricula) {
		this.num_matricula = num_matricula;
	}

	public Integer getTot_rec() {
		return tot_rec;
	}

	public void setTot_rec(Integer tot_rec) {
		this.tot_rec = tot_rec;
	}

	public Integer getTot_afil() {
		return tot_afil;
	}

	public void setTot_afil(Integer tot_afil) {
		this.tot_afil = tot_afil;
	}

	public Integer getTot_ac() {
		return tot_ac;
	}

	public void setTot_ac(Integer tot_ac) {
		this.tot_ac = tot_ac;
	}

	public Integer getAjuste() {
		return ajuste;
	}

	public void setAjuste(Integer ajuste) {
		this.ajuste = ajuste;
	}

	public Integer getAjuste_parcial() {
		return ajuste_parcial;
	}

	public void setAjuste_parcial(Integer ajuste_parcial) {
		this.ajuste_parcial = ajuste_parcial;
	}

	public String getRechazos() {
		return rechazos;
	}

	public void setRechazos(String rechazos) {
		this.rechazos = rechazos;
	}

	public Integer getPosee_ticket() {
		return posee_ticket;
	}

	public void setPosee_ticket(Integer posee_ticket) {
		this.posee_ticket = posee_ticket;
	}

	public Integer getPosee_marca_comercial() {
		return posee_marca_comercial;
	}

	public void setPosee_marca_comercial(Integer posee_marca_comercial) {
		this.posee_marca_comercial = posee_marca_comercial;
	}

	public Integer getNum_afi() {
		return num_afi;
	}

	public void setNum_afi(Integer num_afi) {
		this.num_afi = num_afi;
	}

	public Integer getParentesco() {
		return parentesco;
	}

	public void setParentesco(Integer parentesco) {
		this.parentesco = parentesco;
	}

	public String getCod_barra_1() {
		return cod_barra_1;
	}

	public void setCod_barra_1(String cod_barra_1) {
		this.cod_barra_1 = cod_barra_1;
	}

	public Integer getCan_presc_1() {
		return can_presc_1;
	}

	public void setCan_presc_1(Integer can_presc_1) {
		this.can_presc_1 = can_presc_1;
	}

	public Integer getCan_disp_1() {
		return can_disp_1;
	}

	public void setCan_disp_1(Integer can_disp_1) {
		this.can_disp_1 = can_disp_1;
	}

	public Integer getCan_real_1() {
		return can_real_1;
	}

	public void setCan_real_1(Integer can_real_1) {
		this.can_real_1 = can_real_1;
	}

	public Integer getPciorp_1() {
		return pciorp_1;
	}

	public void setPciorp_1(Integer pciorp_1) {
		this.pciorp_1 = pciorp_1;
	}

	public Integer getPcio_real_1() {
		return pcio_real_1;
	}

	public void setPcio_real_1(Integer pcio_real_1) {
		this.pcio_real_1 = pcio_real_1;
	}

	public Integer getTroquel_1() {
		return troquel_1;
	}

	public void setTroquel_1(Integer troquel_1) {
		this.troquel_1 = troquel_1;
	}

	public Integer getLaboratorio_1() {
		return laboratorio_1;
	}

	public void setLaboratorio_1(Integer laboratorio_1) {
		this.laboratorio_1 = laboratorio_1;
	}

	public String getCod_barra_2() {
		return cod_barra_2;
	}

	public void setCod_barra_2(String cod_barra_2) {
		this.cod_barra_2 = cod_barra_2;
	}

	public Integer getCan_presc_2() {
		return can_presc_2;
	}

	public void setCan_presc_2(Integer can_presc_2) {
		this.can_presc_2 = can_presc_2;
	}

	public Integer getCan_disp_2() {
		return can_disp_2;
	}

	public void setCan_disp_2(Integer can_disp_2) {
		this.can_disp_2 = can_disp_2;
	}

	public Integer getCan_real_2() {
		return can_real_2;
	}

	public void setCan_real_2(Integer can_real_2) {
		this.can_real_2 = can_real_2;
	}

	public Integer getPciorp_2() {
		return pciorp_2;
	}

	public void setPciorp_2(Integer pciorp_2) {
		this.pciorp_2 = pciorp_2;
	}

	public Integer getPcio_real_2() {
		return pcio_real_2;
	}

	public void setPcio_real_2(Integer pcio_real_2) {
		this.pcio_real_2 = pcio_real_2;
	}

	public Integer getTroquel_2() {
		return troquel_2;
	}

	public void setTroquel_2(Integer troquel_2) {
		this.troquel_2 = troquel_2;
	}

	public Integer getLaboratorio_2() {
		return laboratorio_2;
	}

	public void setLaboratorio_2(Integer laboratorio_2) {
		this.laboratorio_2 = laboratorio_2;
	}

	public String getCod_barra_3() {
		return cod_barra_3;
	}

	public void setCod_barra_3(String cod_barra_3) {
		this.cod_barra_3 = cod_barra_3;
	}

	public Integer getCan_presc_3() {
		return can_presc_3;
	}

	public void setCan_presc_3(Integer can_presc_3) {
		this.can_presc_3 = can_presc_3;
	}

	public Integer getCan_disp_3() {
		return can_disp_3;
	}

	public void setCan_disp_3(Integer can_disp_3) {
		this.can_disp_3 = can_disp_3;
	}

	public Integer getCan_real_3() {
		return can_real_3;
	}

	public void setCan_real_3(Integer can_real_3) {
		this.can_real_3 = can_real_3;
	}

	public Integer getPciorp_3() {
		return pciorp_3;
	}

	public void setPciorp_3(Integer pciorp_3) {
		this.pciorp_3 = pciorp_3;
	}

	public Integer getPcio_real_3() {
		return pcio_real_3;
	}

	public void setPcio_real_3(Integer pcio_real_3) {
		this.pcio_real_3 = pcio_real_3;
	}

	public Integer getTroquel_3() {
		return troquel_3;
	}

	public void setTroquel_3(Integer troquel_3) {
		this.troquel_3 = troquel_3;
	}

	public Integer getLaboratorio_3() {
		return laboratorio_3;
	}

	public void setLaboratorio_3(Integer laboratorio_3) {
		this.laboratorio_3 = laboratorio_3;
	}

	public Integer getDelegacion() {
		return delegacion;
	}

	public String getSer_vale() {
		return ser_vale;
	}

	public Integer getCod_vale() {
		return cod_vale;
	}

	public String getSexo() {
		return sexo;
	}

	public String getTrat_prolongado() {
		return trat_prolongado;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public Integer getNum_documento() {
		return num_documento;
	}

	public String getFec_nacimiento() {
		return fec_nacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public Integer getAlfabeta_1() {
		return alfabeta_1;
	}

	public void setAlfabeta_1(Integer alfabeta_1) {
		this.alfabeta_1 = alfabeta_1;
	}

	public Integer getAlfabeta_2() {
		return alfabeta_2;
	}

	public void setAlfabeta_2(Integer alfabeta_2) {
		this.alfabeta_2 = alfabeta_2;
	}

	public Integer getAlfabeta_3() {
		return alfabeta_3;
	}

	public void setAlfabeta_3(Integer alfabeta_3) {
		this.alfabeta_3 = alfabeta_3;
	}

}
