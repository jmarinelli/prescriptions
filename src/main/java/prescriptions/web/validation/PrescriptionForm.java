package prescriptions.web.validation;

import java.util.LinkedList;
import java.util.List;

import prescriptions.domain.CorruptedDataException;
import prescriptions.domain.entity.Prescription;
import prescriptions.domain.repositories.PrescriptionRepo;

public class PrescriptionForm {
	
	private Integer prescription;
	
	private Integer pago; // y esto?
	
	// Caratula
	private String serCarat;
	private Integer codCarat;
	private Integer expediente;
	private final Integer delegacion = 0;
	private Integer codObSoc;
	private Integer codPlan;
	private String periodo; // YYYYMMPN
	private Integer codFarma;
	private Integer caja;
	
	// Receta
	private String serReceta;
	private Integer numReceta;
	private Integer orden; // max 3 digitos
	private Integer fecPrescr; // YYYYMMDD
	private Integer fecDisp; // YYYYMMDD
	private String letMatricula; // N, P o X
	private Integer numMatricula; // 0 si es ilegible
	private Integer totRec;
	private Integer totAfil;
	private Integer totAc;
	private Integer ajuste; // y ajusteParcial??
	private String rechazos; // dos digitos por cada rechazo, sale de una tabla...what?
	private Integer poseeTicket; // 0 o 1
	private Integer poseeMarcaComercial; // 0 o 1
	private final String serVale = "";
	private final Integer codVale = 0;
	
	// Afiliado
	private Integer numAfi;
	private Integer parentesco;
	private final String sexo = "0";
	private final String tratProlongado = "0";
	private final String tipoDocumento = "";
	private final Integer numDocumento = 0;
	private final String fecNacimiento = "19000101";
	private final String telefono = "0";
	
	// Codigo de barras?	
		private String codBarra1; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
		private Integer canPresc1;  //
		private Integer canDisp1;	//	los 3 iguales
		private Integer canReal1;	//
		private Integer pciorp1;	//
		private Integer pcioReal1;	//	los 2 iguales
		private Integer troquel1;	// 7 digitos
		private Integer laboratorio1;
		
		// Codigo de barras?	
		private String codBarra2; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
		private Integer canPresc2;  //
		private Integer canDisp2;	//	los 3 iguales
		private Integer canReal2;	//
		private Integer pciorp2;	//
		private Integer pcioReal2;	//	los 2 iguales
		private Integer troquel2;	// 7 digitos
		private Integer laboratorio2;
		
		// Codigo de barras?	
		private String codBarra3; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
		private Integer canPresc3;  //
		private Integer canDisp3;	//	los 3 iguales
		private Integer canReal3;	//
		private Integer pciorp3;	//
		private Integer pcioReal3;	//	los 2 iguales
		private Integer troquel3;	// 7 digitos
		private Integer laboratorio3;
	
	public PrescriptionForm () {
		
	}
	
	public PrescriptionForm(Prescription p) {
		super();
		this.prescription = p.getId();
		this.pago = p.getPago();
		this.serCarat = p.getSerCarat();
		this.codCarat = p.getCodCarat();
		this.expediente = p.getExpediente();
		this.codObSoc = p.getCodObSoc();
		this.codPlan = p.getCodPlan();
		this.periodo = p.getPeriodo();
		this.codFarma = p.getCodFarma();
		this.caja = p.getCaja();
		this.serReceta = p.getSerReceta();
		this.numReceta = p.getNumReceta();
		this.orden = p.getOrden();
		this.fecPrescr = p.getFecPrescr();
		this.fecDisp = p.getFecDisp();
		this.letMatricula = p.getLetMatricula();
		this.numMatricula = p.getNumMatricula();
		this.totRec = p.getTotRec();
		this.totAfil = p.getTotAfil();
		this.totAc = p.getTotAc();
		this.ajuste = p.getAjuste();
		this.rechazos = p.getRechazos();
		this.poseeTicket = p.getPoseeTicket();
		this.poseeMarcaComercial = p.getPoseeMarcaComercial();
		this.numAfi = p.getNumAfi();
		this.parentesco = p.getParentesco();
		this.codBarra1 = p.getCodBarra1();
		this.canPresc1 = p.getCanPresc1();
		this.canDisp1 = p.getCanDisp1();
		this.canReal1 = p.getCanReal1();
		this.pciorp1 = p.getPciorp1();
		this.pcioReal1 = p.getPcioReal1();
		this.troquel1 = p.getTroquel1();
		this.laboratorio1 = p.getLaboratorio1();
		this.codBarra2 = p.getCodBarra2();
		this.canPresc2 = p.getCanPresc2();
		this.canDisp2 = p.getCanDisp2();
		this.canReal2 = p.getCanReal2();
		this.pciorp2 = p.getPciorp2();
		this.pcioReal2 = p.getPcioReal2();
		this.troquel2 = p.getTroquel2();
		this.laboratorio2 = p.getLaboratorio2();
		this.codBarra3 = p.getCodBarra3();
		this.canPresc3 = p.getCanPresc3();
		this.canDisp3 = p.getCanDisp3();
		this.canReal3 = p.getCanReal3();
		this.pciorp3 = p.getPciorp3();
		this.pcioReal3 = p.getPcioReal3();
		this.troquel3 = p.getTroquel3();
		this.laboratorio3 = p.getLaboratorio3();
		
	}



	public List<String> getNulledFields() {
		List<String> nulled = new LinkedList<String>();
		if (this.serCarat == null)
			nulled.add("serCarat");
		if (this.prescription == null)
			nulled.add("prescription");
		if (this.pago == null)
			nulled.add("pago");
		if (this.codCarat == null)
			nulled.add("codCarat");
		if (this.expediente == null)
			nulled.add("expediente");
		if (this.codObSoc == null)
			nulled.add("codObSoc");
		if (this.codPlan == null)
			nulled.add("codPlan");
		if (this.periodo == null)
			nulled.add("periodo");
		if (this.codFarma == null)
			nulled.add("codFarma");
		if (this.caja == null)
			nulled.add("caja");
		if (this.serReceta == null)
			nulled.add("serReceta");
		if (this.numReceta == null)
			nulled.add("numReceta");
		if (this.numAfi == null)
			nulled.add("numAfi");
		if (this.parentesco == null)
			nulled.add("parentesco");
		if (this.codBarra1 == null)
			nulled.add("codBarra1");
		if (this.pcioReal1 == null)
			nulled.add("pcioReal1");
		if (this.codBarra1 == null)
			nulled.add("codBarra1");
		if (this.totRec == null)
			nulled.add("totRec");
		if (this.totAfil == null)
			nulled.add("totAfil");
		if (this.totAc == null)
			nulled.add("totAc");
		if (this.letMatricula == null)
			nulled.add("letMatricula");
		if (this.numMatricula == null)
			nulled.add("numMatricula");
		if (this.ajuste == null)
			nulled.add("ajuste");
		if (this.rechazos == null)
			nulled.add("rechazos");
		if (this.poseeTicket == null)
			nulled.add("poseeTicket");
		if (this.poseeMarcaComercial == null)
			nulled.add("poseeMarcaComercial");
		return nulled;
	}

	public Integer getPrescription() {
		return prescription;
	}

	public void setPrescription(Integer prescription) {
		this.prescription = prescription;
	}

	public Integer getPago() {
		return pago;
	}

	public void setPago(Integer pago) {
		this.pago = pago;
	}

	public String getSerCarat() {
		return serCarat;
	}

	public void setSerCarat(String serCarat) {
		this.serCarat = serCarat;
	}

	public Integer getCodCarat() {
		return codCarat;
	}

	public void setCodCarat(Integer codCarat) {
		this.codCarat = codCarat;
	}

	public Integer getExpediente() {
		return expediente;
	}

	public void setExpediente(Integer expediente) {
		this.expediente = expediente;
	}

	public Integer getCodObSoc() {
		return codObSoc;
	}

	public void setCodObSoc(Integer codObSoc) {
		this.codObSoc = codObSoc;
	}

	public Integer getCodPlan() {
		return codPlan;
	}

	public void setCodPlan(Integer codPlan) {
		this.codPlan = codPlan;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Integer getDelegacion() {
		return delegacion;
	}
	
	public Integer getCodFarma() {
		return codFarma;
	}

	public void setCodFarma(Integer codFarma) {
		this.codFarma = codFarma;
	}

	public Integer getCaja() {
		return caja;
	}

	public void setCaja(Integer caja) {
		this.caja = caja;
	}

	public String getSerReceta() {
		return serReceta;
	}

	public void setSerReceta(String serReceta) {
		this.serReceta = serReceta;
	}

	public Integer getNumReceta() {
		return numReceta;
	}

	public void setNumReceta(Integer numReceta) {
		this.numReceta = numReceta;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public Integer getFecPrescr() {
		return fecPrescr;
	}

	public void setFecPrescr(Integer fecPrescr) {
		this.fecPrescr = fecPrescr;
	}

	public Integer getFecDisp() {
		return fecDisp;
	}

	public void setFecDisp(Integer fecDisp) {
		this.fecDisp = fecDisp;
	}

	public Integer getNumAfi() {
		return numAfi;
	}

	public void setNumAfi(Integer numAfi) {
		this.numAfi = numAfi;
	}

	public Integer getParentesco() {
		return parentesco;
	}

	public void setParentesco(Integer parentesco) {
		this.parentesco = parentesco;
	}

	public String getCodBarra1() {
		return codBarra1;
	}

	public void setCodBarra1(String codBarra1) {
		this.codBarra1 = codBarra1;
	}

	public Integer getCanPresc1() {
		return canPresc1;
	}

	public void setCanPresc1(Integer canPresc1) {
		this.canPresc1 = canPresc1;
	}

	public Integer getCanDisp1() {
		return canDisp1;
	}

	public void setCanDisp1(Integer canDisp1) {
		this.canDisp1 = canDisp1;
	}

	public Integer getCanReal1() {
		return canReal1;
	}

	public void setCanReal1(Integer canReal1) {
		this.canReal1 = canReal1;
	}

	public Integer getPciorp1() {
		return pciorp1;
	}

	public void setPciorp1(Integer pciorp1) {
		this.pciorp1 = pciorp1;
	}

	public Integer getPcioReal1() {
		return pcioReal1;
	}

	public void setPcioReal1(Integer pcioReal1) {
		this.pcioReal1 = pcioReal1;
	}

	public Integer getTroquel1() {
		return troquel1;
	}

	public void setTroquel1(Integer troquel1) {
		this.troquel1 = troquel1;
	}

	public Integer getLaboratorio1() {
		return laboratorio1;
	}

	public void setLaboratorio1(Integer laboratorio1) {
		this.laboratorio1 = laboratorio1;
	}

	public String getCodBarra2() {
		return codBarra2;
	}

	public void setCodBarra2(String codBarra2) {
		this.codBarra2 = codBarra2;
	}

	public Integer getCanPresc2() {
		return canPresc2;
	}

	public void setCanPresc2(Integer canPresc2) {
		this.canPresc2 = canPresc2;
	}

	public Integer getCanDisp2() {
		return canDisp2;
	}

	public void setCanDisp2(Integer canDisp2) {
		this.canDisp2 = canDisp2;
	}

	public Integer getCanReal2() {
		return canReal2;
	}

	public void setCanReal2(Integer canReal2) {
		this.canReal2 = canReal2;
	}

	public Integer getPciorp2() {
		return pciorp2;
	}

	public void setPciorp2(Integer pciorp2) {
		this.pciorp2 = pciorp2;
	}

	public Integer getPcioReal2() {
		return pcioReal2;
	}

	public void setPcioReal2(Integer pcioReal2) {
		this.pcioReal2 = pcioReal2;
	}

	public Integer getTroquel2() {
		return troquel2;
	}

	public void setTroquel2(Integer troquel2) {
		this.troquel2 = troquel2;
	}

	public Integer getLaboratorio2() {
		return laboratorio2;
	}

	public void setLaboratorio2(Integer laboratorio2) {
		this.laboratorio2 = laboratorio2;
	}

	public String getCodBarra3() {
		return codBarra3;
	}

	public void setCodBarra3(String codBarra3) {
		this.codBarra3 = codBarra3;
	}

	public Integer getCanPresc3() {
		return canPresc3;
	}

	public void setCanPresc3(Integer canPresc3) {
		this.canPresc3 = canPresc3;
	}

	public Integer getCanDisp3() {
		return canDisp3;
	}

	public void setCanDisp3(Integer canDisp3) {
		this.canDisp3 = canDisp3;
	}

	public Integer getCanReal3() {
		return canReal3;
	}

	public void setCanReal3(Integer canReal3) {
		this.canReal3 = canReal3;
	}

	public Integer getPciorp3() {
		return pciorp3;
	}

	public void setPciorp3(Integer pciorp3) {
		this.pciorp3 = pciorp3;
	}

	public Integer getPcioReal3() {
		return pcioReal3;
	}

	public void setPcioReal3(Integer pcioReal3) {
		this.pcioReal3 = pcioReal3;
	}

	public Integer getTroquel3() {
		return troquel3;
	}

	public void setTroquel3(Integer troquel3) {
		this.troquel3 = troquel3;
	}

	public Integer getLaboratorio3() {
		return laboratorio3;
	}

	public void setLaboratorio3(Integer laboratorio3) {
		this.laboratorio3 = laboratorio3;
	}

	public Integer getTotRec() {
		return totRec;
	}

	public void setTotRec(Integer totRec) {
		this.totRec = totRec;
	}

	public Integer getTotAfil() {
		return totAfil;
	}

	public void setTotAfil(Integer totAfil) {
		this.totAfil = totAfil;
	}

	public Integer getTotAc() {
		return totAc;
	}

	public void setTotAc(Integer totAc) {
		this.totAc = totAc;
	}

	public String getLetMatricula() {
		return letMatricula;
	}

	public void setLetMatricula(String letMatricula) {
		this.letMatricula = letMatricula;
	}

	public Integer getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(Integer numMatricula) {
		this.numMatricula = numMatricula;
	}

	public Integer getAjuste() {
		return ajuste;
	}

	public void setAjuste(Integer ajuste) {
		this.ajuste = ajuste;
	}

	public String getRechazos() {
		return rechazos;
	}

	public void setRechazos(String rechazos) {
		this.rechazos = rechazos;
	}

	public Integer getPoseeTicket() {
		return poseeTicket;
	}

	public void setPoseeTicket(Integer poseeTicket) {
		this.poseeTicket = poseeTicket;
	}

	public Integer getPoseeMarcaComercial() {
		return poseeMarcaComercial;
	}

	public void setPoseeMarcaComercial(Integer poseeMarcaComercial) {
		this.poseeMarcaComercial = poseeMarcaComercial;
	}

	public String getTratProlongado() {
		return tratProlongado;
	}

	public String getSerVale() {
		return serVale;
	}

	public Integer getCodVale() {
		return codVale;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public Integer getNumDocumento() {
		return numDocumento;
	}

	public String getFecNacimiento() {
		return fecNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getSexo() {
		return sexo;
	}

	public Prescription build(PrescriptionRepo prescriptionRepo) throws CorruptedDataException {
		if (this.prescription == null)
			return new Prescription(pago, serCarat, codCarat, expediente,
					codObSoc, codPlan, periodo, codFarma, caja, serReceta,
					numReceta, orden, fecPrescr, fecDisp, letMatricula,
					numMatricula, totRec, totAfil, totAc, ajuste, rechazos,
					poseeTicket, poseeMarcaComercial, numAfi, parentesco,
					codBarra1, canPresc1, canDisp1, canReal1, pciorp1,
					pcioReal1, troquel1, laboratorio1, codBarra2, canPresc2,
					canDisp2, canReal2, pciorp2, pcioReal2, troquel2,
					laboratorio2, codBarra3, canPresc3, canDisp3, canReal3,
					pciorp3, pcioReal3, troquel3, laboratorio3);
		else {
			Prescription p = prescriptionRepo.get(this.prescription);
			update(p);
			return p;
//			prescription.setPago(pago);
//			prescription.setSerCarat(serCarat);
//			prescription.setCodCarat(codCarat);
//			prescription.setExpediente(expediente);
//			prescription.setCodObSoc(codObSoc);
//			prescription.setCodPlan(codPlan);
//			prescription.setPeriodo(periodo);
//			prescription.setCodFarma(codFarma);
//			prescription.setCaja(caja);
//			prescription.setSerReceta(serReceta);
//			prescription.setNumReceta(numReceta);
//			prescription.setOrden(orden);
//			prescription.setFecPrescr(fecPrescr);
//			prescription.setFecDisp(fecDisp);
//			prescription.setNumAfi(numAfi);
//			prescription.setParentesco(parentesco);
//			prescription.setCanPresc1(canPresc1);
//			prescription.setCanDisp1(canDisp1);
//			prescription.setCanReal1(canReal1);
//			prescription.setTroquel1(troquel1);
//			prescription.setLaboratorio1(laboratorio1);
//			prescription.setCanPresc2(canPresc2);
//			prescription.setCanDisp2(canDisp2);
//			prescription.setCanReal2(canReal2);
//			prescription.setTroquel2(troquel2);
//			prescription.setLaboratorio2(laboratorio2);
//			prescription.setCanPresc3(canPresc3);
//			prescription.setCanDisp3(canDisp3);
//			prescription.setCanReal3(canReal3);
//			prescription.setTroquel3(troquel3);
//			prescription.setLaboratorio3(laboratorio3);
//			prescription.setLetMatricula(letMatricula);
//			prescription.setNumMatricula(numMatricula);
//			prescription.setAjuste(ajuste);
//			prescription.setRechazos(rechazos);
//			prescription.setPoseeTicket(poseeTicket);
//			prescription.setPoseeMarcaComercial(poseeMarcaComercial);
//			return prescription;
		}
	}
	
	public void update(Prescription prescription) {
		prescription.setPago(pago);
		prescription.setSerCarat(serCarat);
		prescription.setCodCarat(codCarat);
		prescription.setExpediente(expediente);
		prescription.setCodObSoc(codObSoc);
		prescription.setCodPlan(codPlan);
		prescription.setPeriodo(periodo);
		prescription.setCodFarma(codFarma);
		prescription.setCaja(caja);
		prescription.setSerReceta(serReceta);
		prescription.setNumReceta(numReceta);
		prescription.setOrden(orden);
		prescription.setFecPrescr(fecPrescr);
		prescription.setFecDisp(fecDisp);
		prescription.setNumAfi(numAfi);
		prescription.setParentesco(parentesco);
		prescription.setCanPresc1(canPresc1);
		prescription.setCanDisp1(canDisp1);
		prescription.setCanReal1(canReal1);
		prescription.setTroquel1(troquel1);
		prescription.setLaboratorio1(laboratorio1);
		prescription.setCanPresc2(canPresc2);
		prescription.setCanDisp2(canDisp2);
		prescription.setCanReal2(canReal2);
		prescription.setTroquel2(troquel2);
		prescription.setLaboratorio2(laboratorio2);
		prescription.setCanPresc3(canPresc3);
		prescription.setCanDisp3(canDisp3);
		prescription.setCanReal3(canReal3);
		prescription.setTroquel3(troquel3);
		prescription.setLaboratorio3(laboratorio3);
		prescription.setLetMatricula(letMatricula);
		prescription.setNumMatricula(numMatricula);
		prescription.setAjuste(ajuste);
		prescription.setRechazos(rechazos);
		prescription.setPoseeTicket(poseeTicket);
		prescription.setPoseeMarcaComercial(poseeMarcaComercial);
	}

}
