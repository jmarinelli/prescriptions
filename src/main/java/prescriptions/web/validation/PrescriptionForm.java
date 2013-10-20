package prescriptions.web.validation;

import prescriptions.domain.CorruptedDataException;
import prescriptions.domain.entity.Prescription;

public class PrescriptionForm {
	
	private Prescription prescription;
	
	private int pago; // y esto?
	
	// Caratula
	private String serCarat;
	private int codCarat;
	private int expediente;
	private final int delegacion = 0;
	private int codObSoc;
	private int codPlan;
	private String periodo; // YYYYMMPN
	private int codFarma;
	private int caja;
	
	// Receta
	private String serReceta;
	private int numReceta;
	private int orden; // max 3 digitos
	private int fecPrescr; // YYYYMMDD
	private int fecDisp; // YYYYMMDD
	private String letMatricula; // N, P o X
	private int numMatricula; // 0 si es ilegible
	private int totRec;
	private int totAfil;
	private int totAc;
	private int ajuste; // y ajusteParcial??
	private String rechazos; // dos digitos por cada rechazo, sale de una tabla...what?
	private int poseeTicket; // 0 o 1
	private int poseeMarcaComercial; // 0 o 1
	private final String serVale = "";
	private final int codVale = 0;
	
	// Afiliado
	private int numAfi;
	private int parentesco;
	private final String sexo = "0";
	private final String tratProlongado = "0";
	private final String tipoDocumento = "";
	private final int numDocumento = 0;
	private final String fecNacimiento = "19000101";
	private final String telefono = "0";
	
	// Codigo de barras?	
	private String codBarraN; // codigo de barras -> alfabetaN, atributoAN, atributoBN, atributoCN??
	private int canPrescN;  //
	private int canDispN;	//	los 3 iguales
	private int canRealN;	//
	private int pciorpN;	//
	private int pcioRealN;	//	los 2 iguales
	private int troquelN;	// 7 digitos
	private int laboratorioN;
	
	public PrescriptionForm () {
		
	}

	public PrescriptionForm(Prescription prescription, int pago,
			String serCarat, int codCarat, int expediente, int codObSoc,
			int codPlan, String periodo, int codFarma, int caja,
			String serReceta, int numReceta, int orden, int fecPrescr,
			int fecDisp, int numAfi, int parentesco, int canPrescN,
			int canDispN, int canRealN, int troquelN, int laboratorioN,
			int pciorpN, int pcioRealN, String codBarraN, int totRec,
			int totAfil, int totAc, String letMatricula, int numMatricula,
			int ajuste, String rechazos, int poseeTicket,
			int poseeMarcaComercial) {
		super();
		this.prescription = prescription;
		this.pago = pago;
		this.serCarat = serCarat;
		this.codCarat = codCarat;
		this.expediente = expediente;
		this.codObSoc = codObSoc;
		this.codPlan = codPlan;
		this.periodo = periodo;
		this.codFarma = codFarma;
		this.caja = caja;
		this.serReceta = serReceta;
		this.numReceta = numReceta;
		this.orden = orden;
		this.fecPrescr = fecPrescr;
		this.fecDisp = fecDisp;
		this.numAfi = numAfi;
		this.parentesco = parentesco;
		this.canPrescN = canPrescN;
		this.canDispN = canDispN;
		this.canRealN = canRealN;
		this.troquelN = troquelN;
		this.laboratorioN = laboratorioN;
		this.pciorpN = pciorpN;
		this.pcioRealN = pcioRealN;
		this.codBarraN = codBarraN;
		this.totRec = totRec;
		this.totAfil = totAfil;
		this.totAc = totAc;
		this.letMatricula = letMatricula;
		this.numMatricula = numMatricula;
		this.ajuste = ajuste;
		this.rechazos = rechazos;
		this.poseeTicket = poseeTicket;
		this.poseeMarcaComercial = poseeMarcaComercial;
	}

	public Prescription getPrescription() {
		return prescription;
	}

	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}

	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}

	public String getSerCarat() {
		return serCarat;
	}

	public void setSerCarat(String serCarat) {
		this.serCarat = serCarat;
	}

	public int getCodCarat() {
		return codCarat;
	}

	public void setCodCarat(int codCarat) {
		this.codCarat = codCarat;
	}

	public int getExpediente() {
		return expediente;
	}

	public void setExpediente(int expediente) {
		this.expediente = expediente;
	}

	public int getCodObSoc() {
		return codObSoc;
	}

	public void setCodObSoc(int codObSoc) {
		this.codObSoc = codObSoc;
	}

	public int getCodPlan() {
		return codPlan;
	}

	public void setCodPlan(int codPlan) {
		this.codPlan = codPlan;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public int getDelegacion() {
		return delegacion;
	}
	
	public int getCodFarma() {
		return codFarma;
	}

	public void setCodFarma(int codFarma) {
		this.codFarma = codFarma;
	}

	public int getCaja() {
		return caja;
	}

	public void setCaja(int caja) {
		this.caja = caja;
	}

	public String getSerReceta() {
		return serReceta;
	}

	public void setSerReceta(String serReceta) {
		this.serReceta = serReceta;
	}

	public int getNumReceta() {
		return numReceta;
	}

	public void setNumReceta(int numReceta) {
		this.numReceta = numReceta;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getFecPrescr() {
		return fecPrescr;
	}

	public void setFecPrescr(int fecPrescr) {
		this.fecPrescr = fecPrescr;
	}

	public int getFecDisp() {
		return fecDisp;
	}

	public void setFecDisp(int fecDisp) {
		this.fecDisp = fecDisp;
	}

	public int getNumAfi() {
		return numAfi;
	}

	public void setNumAfi(int numAfi) {
		this.numAfi = numAfi;
	}

	public int getParentesco() {
		return parentesco;
	}

	public void setParentesco(int parentesco) {
		this.parentesco = parentesco;
	}

	public int getCanPrescN() {
		return canPrescN;
	}

	public void setCanPrescN(int canPrescN) {
		this.canPrescN = canPrescN;
	}

	public int getCanDispN() {
		return canDispN;
	}

	public void setCanDispN(int canDispN) {
		this.canDispN = canDispN;
	}

	public int getCanRealN() {
		return canRealN;
	}

	public void setCanRealN(int canRealN) {
		this.canRealN = canRealN;
	}

	public int getTroquelN() {
		return troquelN;
	}

	public void setTroquelN(int troquelN) {
		this.troquelN = troquelN;
	}

	public int getLaboratorioN() {
		return laboratorioN;
	}

	public void setLaboratorioN(int laboratorioN) {
		this.laboratorioN = laboratorioN;
	}

	public int getPciorpN() {
		return pciorpN;
	}

	public void setPciorpN(int pciorpN) {
		this.pciorpN = pciorpN;
	}

	public int getPcioRealN() {
		return pcioRealN;
	}

	public void setPcioRealN(int pcioRealN) {
		this.pcioRealN = pcioRealN;
	}

	public String getCodBarraN() {
		return codBarraN;
	}

	public void setCodBarraN(String codBarraN) {
		this.codBarraN = codBarraN;
	}

	public int getTotRec() {
		return totRec;
	}

	public void setTotRec(int totRec) {
		this.totRec = totRec;
	}

	public int getTotAfil() {
		return totAfil;
	}

	public void setTotAfil(int totAfil) {
		this.totAfil = totAfil;
	}

	public int getTotAc() {
		return totAc;
	}

	public void setTotAc(int totAc) {
		this.totAc = totAc;
	}

	public String getLetMatricula() {
		return letMatricula;
	}

	public void setLetMatricula(String letMatricula) {
		this.letMatricula = letMatricula;
	}

	public int getNumMatricula() {
		return numMatricula;
	}

	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}

	public int getAjuste() {
		return ajuste;
	}

	public void setAjuste(int ajuste) {
		this.ajuste = ajuste;
	}

	public String getRechazos() {
		return rechazos;
	}

	public void setRechazos(String rechazos) {
		this.rechazos = rechazos;
	}

	public int getPoseeTicket() {
		return poseeTicket;
	}

	public void setPoseeTicket(int poseeTicket) {
		this.poseeTicket = poseeTicket;
	}

	public int getPoseeMarcaComercial() {
		return poseeMarcaComercial;
	}

	public void setPoseeMarcaComercial(int poseeMarcaComercial) {
		this.poseeMarcaComercial = poseeMarcaComercial;
	}

	public String getTratProlongado() {
		return tratProlongado;
	}

	public String getSerVale() {
		return serVale;
	}

	public int getCodVale() {
		return codVale;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public int getNumDocumento() {
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

	public Prescription build() throws CorruptedDataException {
		if (this.prescription == null)
			return new Prescription(pago, serCarat, codCarat, expediente,
					codObSoc, codPlan, periodo, codFarma, caja, serReceta,
					numReceta, orden, fecPrescr, fecDisp, numAfi, parentesco,
					canPrescN, canDispN, canRealN, troquelN, laboratorioN,
					pciorpN, pcioRealN, codBarraN, totRec, totAfil, totAc,
					letMatricula, numMatricula, ajuste, rechazos, poseeTicket,
					poseeMarcaComercial);
		else {			
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
			prescription.setCanPrescN(canPrescN);
			prescription.setCanDispN(canDispN);
			prescription.setCanRealN(canRealN);
			prescription.setTroquelN(troquelN);
			prescription.setLaboratorioN(laboratorioN);
			prescription.setLetMatricula(letMatricula);
			prescription.setNumMatricula(numMatricula);
			prescription.setAjuste(ajuste);
			prescription.setRechazos(rechazos);
			prescription.setPoseeTicket(poseeTicket);
			prescription.setPoseeMarcaComercial(poseeMarcaComercial);
			return prescription;
		}
	}

}
