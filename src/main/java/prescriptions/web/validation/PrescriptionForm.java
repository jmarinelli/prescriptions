package prescriptions.web.validation;

import java.util.LinkedList;
import java.util.List;

import prescriptions.domain.entity.Prescription;
import prescriptions.domain.repositories.PrescriptionRepo;

public class PrescriptionForm {
	
	private Prescription prescription;
	
	private boolean duplicated;
	private boolean fix_ser_carat;
	private boolean fix_cod_carat;
	private boolean fix_let_matricula;
	private boolean fix_fec_prescr;
	private boolean fix_fec_disp;
	private boolean fix_convenio;

	private String convenio;

	private Integer pago;
	
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
	private String ser_receta;
	private Integer num_receta;
	private Integer orden; // max 3 digitos
	private Integer fec_prescr; // YYYYMMDD
	private Integer fec_disp; // YYYYMMDD
	private String let_matricula; // N, P o X
	private Integer num_matricula; // 0 si es ilegible
	private Integer tot_rec;
	private Integer tot_afil;
	private Integer tot_ac;
	private Integer ajuste = 0; // y ajusteParcial??
	private Integer ajuste_parcial; // y ajusteParcial??
	private String rechazos = ""; // dos digitos por cada rechazo, sale de una tabla...what?
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
	
	public PrescriptionForm () {
		
	}
	
	public PrescriptionForm(Prescription p) {
		super();
		this.prescription = p;
		this.pago = p.getPago();
		this.ser_carat = p.getSer_carat();
		this.cod_carat = p.getCod_carat();
		this.expediente = p.getExpediente();
		this.cod_obsoc = p.getCod_obsoc();
		this.cod_plan = p.getCod_plan();
		this.periodo = p.getPeriodo();
		this.cod_farma = p.getCod_farma();
		this.caja = p.getCaja();
		this.ser_receta = p.getSer_receta();
		this.num_receta = p.getNum_receta();
		this.orden = p.getOrden();
		this.fec_prescr = p.getFec_prescr();
		this.fec_disp = p.getFec_disp();
		this.let_matricula = p.getLet_matricula();
		this.num_matricula = p.getNum_matricula();
		this.tot_rec = p.getTot_rec();
		this.tot_afil = p.getTot_afil();
		this.tot_ac = p.getTot_ac();
		this.ajuste = p.getAjuste();
		this.rechazos = p.getRechazos();
		this.posee_ticket = p.getPosee_ticket();
		this.posee_marca_comercial = p.getPosee_marca_comercial();
		this.num_afi = p.getNum_afi();
		this.parentesco = p.getParentesco();
		this.cod_barra_1 = p.getCod_barra_1();
		this.can_presc_1 = p.getCan_presc_1();
		this.can_disp_1 = p.getCan_disp_1();
		this.can_real_1 = p.getCan_real_1();
		this.pciorp_1 = p.getPciorp_1();
		this.pcio_real_1 = p.getPcio_real_1();
		this.troquel_1 = p.getTroquel_1();
		this.laboratorio_1 = p.getLaboratorio_1();
		this.alfabeta_1 = p.getAlfabeta_1();
		this.cod_barra_2 = p.getCod_barra_2();
		this.can_presc_2 = p.getCan_presc_2();
		this.can_disp_2 = p.getCan_disp_2();
		this.can_real_2 = p.getCan_real_2();
		this.pciorp_2 = p.getPciorp_2();
		this.pcio_real_2 = p.getPcio_real_2();
		this.troquel_2 = p.getTroquel_2();
		this.laboratorio_2 = p.getLaboratorio_2();
		this.alfabeta_2 = p.getAlfabeta_2();
		this.cod_barra_3 = p.getCod_barra_3();
		this.can_presc_3 = p.getCan_presc_3();
		this.can_disp_3 = p.getCan_disp_3();
		this.can_real_3 = p.getCan_real_3();
		this.pciorp_3 = p.getPciorp_3();
		this.pcio_real_3 = p.getPcio_real_3();
		this.troquel_3 = p.getTroquel_3();
		this.laboratorio_3 = p.getLaboratorio_3();
		this.alfabeta_3 = p.getAlfabeta_3();
		this.ajuste_parcial = p.getAjuste_parcial();
	}



	public List<String> getNulledFields() {
		List<String> nulled = new LinkedList<String>();
		if (this.ser_carat == null)
			nulled.add("ser_carat");
//		if (this.prescription == null)
//			nulled.add("prescription");
//		if (this.pago == null)
//			nulled.add("pago");
		if (this.cod_carat == null)
			nulled.add("cod_carat");
		if (this.expediente == null)
			nulled.add("expediente");
		if (this.cod_obsoc == null)
			nulled.add("cod_obsoc");
		if (this.cod_plan == null)
			nulled.add("cod_plan");
		if (this.periodo == null)
			nulled.add("periodo");
		if (this.cod_farma == null)
			nulled.add("cod_farma");
		if (this.caja == null)
			nulled.add("caja");
		if (this.ser_receta == null)
			nulled.add("ser_receta");
//		if (this.num_receta == null)
//			nulled.add("num_receta");
		if (this.num_afi == null && !this.rechazos.equals("05")
				&& !this.rechazos.equals("5"))
			nulled.add("num_afi");
		if (this.parentesco == null && !this.rechazos.equals("05")
				&& !this.rechazos.equals("5"))
			nulled.add("parentesco");
//		if (this.cod_barra_1 == null)
//			nulled.add("cod_barra_1");
//		if (this.pcio_real_1 == null)
//			nulled.add("pcio_real_1");
		if (this.tot_rec == null)
			nulled.add("tot_rec");
		if (this.tot_afil == null)
			nulled.add("tot_afil");
		if (this.tot_ac == null)
			nulled.add("tot_ac");
		if (this.let_matricula == null)
			nulled.add("let_matricula");
		if (this.num_matricula == null)
			nulled.add("num_matricula");
		if (this.ajuste == null)
			nulled.add("ajuste");
//		if (this.rechazos == null)
//			nulled.add("rechazos");
		if (this.posee_ticket == null)
			nulled.add("posee_ticket");
		if (this.posee_marca_comercial == null)
			nulled.add("posee_marca_comercial");
		return nulled;
	}
	
	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public Integer getPago() {
		return pago;
	}

	public void setPago(Integer pago) {
		this.pago = pago;
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

	public boolean isDuplicated() {
		return duplicated;
	}

	public void setDuplicated(boolean duplicated) {
		this.duplicated = duplicated;
	}

	public boolean isFix_ser_carat() {
		return fix_ser_carat;
	}

	public void setFix_ser_carat(boolean fix_ser_carat) {
		this.fix_ser_carat = fix_ser_carat;
	}

	public boolean isFix_cod_carat() {
		return fix_cod_carat;
	}

	public void setFix_cod_carat(boolean fix_cod_carat) {
		this.fix_cod_carat = fix_cod_carat;
	}

	public boolean isFix_let_matricula() {
		return fix_let_matricula;
	}

	public void setFix_let_matricula(boolean fix_let_matricula) {
		this.fix_let_matricula = fix_let_matricula;
	}

	public boolean isFix_fec_prescr() {
		return fix_fec_prescr;
	}

	public void setFix_fec_prescr(boolean fix_fec_prescr) {
		this.fix_fec_prescr = fix_fec_prescr;
	}
	
	public boolean isFix_fec_disp() {
		return fix_fec_disp;
	}

	public void setFix_fec_disp(boolean fix_fec_disp) {
		this.fix_fec_disp = fix_fec_disp;
	}
	
	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}
	
	public boolean isFix_convenio() {
		return fix_convenio;
	}

	public void setFix_convenio(boolean fix_convenio) {
		this.fix_convenio = fix_convenio;
	}

	public Prescription build(PrescriptionRepo prescriptionRepo) {
		return new Prescription(pago, ser_carat, cod_carat, expediente,
				cod_obsoc, cod_plan, periodo, cod_farma, caja, ser_receta,
				num_receta, orden, fec_prescr, fec_disp, let_matricula,
				num_matricula, tot_rec, tot_afil, tot_ac, ajuste, ajuste_parcial, rechazos,
				posee_ticket, posee_marca_comercial, num_afi, parentesco,
				cod_barra_1, can_presc_1, can_disp_1, can_real_1, pciorp_1,
				pcio_real_1, troquel_1, laboratorio_1, alfabeta_1, cod_barra_2, can_presc_2, can_disp_2, can_real_2, pciorp_2,
				pcio_real_2, troquel_2, laboratorio_2, alfabeta_2, cod_barra_3, can_presc_3, can_disp_3, can_real_3, pciorp_3,
				pcio_real_3, troquel_3, laboratorio_3, alfabeta_3);
	
	}
	
	public void update() {
		prescription.setPago(pago);
		prescription.setSer_carat(ser_carat);
		prescription.setCod_carat(cod_carat);
		prescription.setExpediente(expediente);
		prescription.setCod_obsoc(cod_obsoc);
		prescription.setCod_plan(cod_plan);
		prescription.setPeriodo(periodo);
		prescription.setCod_farma(cod_farma);
		prescription.setCaja(caja);
		prescription.setSer_receta(ser_receta);
		prescription.setNum_receta(num_receta);
		prescription.setOrden(orden);
		prescription.setFec_prescr(fec_prescr);
		prescription.setFec_disp(fec_disp);
		prescription.setNum_afi(num_afi);
		prescription.setParentesco(parentesco);
		prescription.setCan_presc_1(can_presc_1);
		prescription.setCan_disp_1(can_disp_1);
		prescription.setCan_real_1(can_real_1);
		prescription.setCod_barra_1(cod_barra_1);
		prescription.setPcio_real_1(pcio_real_1);
		prescription.setPciorp_1(pciorp_1);
		prescription.setTroquel_1(troquel_1);
		prescription.setLaboratorio_1(laboratorio_1);
		prescription.setAlfabeta_1(alfabeta_1);
		prescription.setCan_presc_2(can_presc_2);
		prescription.setCan_disp_2(can_disp_2);
		prescription.setCan_real_2(can_real_2);
		prescription.setTroquel_2(troquel_2);
		prescription.setLaboratorio_2(laboratorio_2);
		prescription.setAlfabeta_2(alfabeta_2);
		prescription.setCod_barra_2(cod_barra_2);
		prescription.setPcio_real_2(pcio_real_2);
		prescription.setPciorp_2(pciorp_2);
		prescription.setCan_presc_3(can_presc_3);
		prescription.setCan_disp_3(can_disp_3);
		prescription.setCan_real_3(can_real_3);
		prescription.setTroquel_3(troquel_3);
		prescription.setLaboratorio_3(laboratorio_3);
		prescription.setAlfabeta_3(alfabeta_3);
		prescription.setCod_barra_3(cod_barra_3);
		prescription.setPcio_real_3(pcio_real_3);
		prescription.setPciorp_3(pciorp_3);
		prescription.setLet_matricula(let_matricula);
		prescription.setNum_matricula(num_matricula);
		prescription.setAjuste(ajuste);
		prescription.setRechazos(rechazos);
		prescription.setPosee_ticket(posee_ticket);
		prescription.setPosee_marca_comercial(posee_marca_comercial);
		prescription.setAjuste_parcial(ajuste_parcial);
	}

}
