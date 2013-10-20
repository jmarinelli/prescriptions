package prescriptions.domain.entity;

import javax.persistence.Entity;

@Entity
public class Prescription extends PersistentEntity {

	private int pago;
	
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
	
	public Prescription() {
		
	}

	public Prescription(int pago, String serCarat, int codCarat, int expediente,
			int codObSoc, int codPlan, String periodo, int codFarma, int caja,
			String serReceta, int numReceta, int orden, int fecPrescr,
			int fecDisp, int numAfi, int parentesco, int canPrescN,
			int canDispN, int canRealN, int troquelN, int laboratorioN,
			int pciorpN, int pcioRealN, String codBarraN, int totRec,
			int totAfil, int totAc, String letMatricula, int numMatricula,
			int ajuste, String rechazos, int poseeTicket,
			int poseeMarcaComercial) {
		super();
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
	public int getDelegacion() {
		return delegacion;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ajuste;
		result = prime * result + caja;
		result = prime * result + canDispN;
		result = prime * result + canPrescN;
		result = prime * result + canRealN;
		result = prime * result
				+ ((codBarraN == null) ? 0 : codBarraN.hashCode());
		result = prime * result + codCarat;
		result = prime * result + codFarma;
		result = prime * result + codObSoc;
		result = prime * result + codPlan;
		result = prime * result + codVale;
		result = prime * result + delegacion;
		result = prime * result + expediente;
		result = prime * result + fecDisp;
		result = prime * result
				+ ((fecNacimiento == null) ? 0 : fecNacimiento.hashCode());
		result = prime * result + fecPrescr;
		result = prime * result + laboratorioN;
		result = prime * result
				+ ((letMatricula == null) ? 0 : letMatricula.hashCode());
		result = prime * result + numAfi;
		result = prime * result + numDocumento;
		result = prime * result + numMatricula;
		result = prime * result + numReceta;
		result = prime * result + orden;
		result = prime * result + pago;
		result = prime * result + parentesco;
		result = prime * result + pcioRealN;
		result = prime * result + pciorpN;
		result = prime * result + ((periodo == null) ? 0 : periodo.hashCode());
		result = prime * result + poseeMarcaComercial;
		result = prime * result + poseeTicket;
		result = prime * result
				+ ((rechazos == null) ? 0 : rechazos.hashCode());
		result = prime * result
				+ ((serCarat == null) ? 0 : serCarat.hashCode());
		result = prime * result
				+ ((serReceta == null) ? 0 : serReceta.hashCode());
		result = prime * result + ((serVale == null) ? 0 : serVale.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result
				+ ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result
				+ ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		result = prime * result + totAc;
		result = prime * result + totAfil;
		result = prime * result + totRec;
		result = prime * result
				+ ((tratProlongado == null) ? 0 : tratProlongado.hashCode());
		result = prime * result + troquelN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prescription other = (Prescription) obj;
		if (ajuste != other.ajuste)
			return false;
		if (caja != other.caja)
			return false;
		if (canDispN != other.canDispN)
			return false;
		if (canPrescN != other.canPrescN)
			return false;
		if (canRealN != other.canRealN)
			return false;
		if (codBarraN == null) {
			if (other.codBarraN != null)
				return false;
		} else if (!codBarraN.equals(other.codBarraN))
			return false;
		if (codCarat != other.codCarat)
			return false;
		if (codFarma != other.codFarma)
			return false;
		if (codObSoc != other.codObSoc)
			return false;
		if (codPlan != other.codPlan)
			return false;
		if (codVale != other.codVale)
			return false;
		if (delegacion != other.delegacion)
			return false;
		if (expediente != other.expediente)
			return false;
		if (fecDisp != other.fecDisp)
			return false;
		if (fecNacimiento == null) {
			if (other.fecNacimiento != null)
				return false;
		} else if (!fecNacimiento.equals(other.fecNacimiento))
			return false;
		if (fecPrescr != other.fecPrescr)
			return false;
		if (laboratorioN != other.laboratorioN)
			return false;
		if (letMatricula == null) {
			if (other.letMatricula != null)
				return false;
		} else if (!letMatricula.equals(other.letMatricula))
			return false;
		if (numAfi != other.numAfi)
			return false;
		if (numDocumento != other.numDocumento)
			return false;
		if (numMatricula != other.numMatricula)
			return false;
		if (numReceta != other.numReceta)
			return false;
		if (orden != other.orden)
			return false;
		if (pago != other.pago)
			return false;
		if (parentesco != other.parentesco)
			return false;
		if (pcioRealN != other.pcioRealN)
			return false;
		if (pciorpN != other.pciorpN)
			return false;
		if (periodo == null) {
			if (other.periodo != null)
				return false;
		} else if (!periodo.equals(other.periodo))
			return false;
		if (poseeMarcaComercial != other.poseeMarcaComercial)
			return false;
		if (poseeTicket != other.poseeTicket)
			return false;
		if (rechazos == null) {
			if (other.rechazos != null)
				return false;
		} else if (!rechazos.equals(other.rechazos))
			return false;
		if (serCarat == null) {
			if (other.serCarat != null)
				return false;
		} else if (!serCarat.equals(other.serCarat))
			return false;
		if (serReceta == null) {
			if (other.serReceta != null)
				return false;
		} else if (!serReceta.equals(other.serReceta))
			return false;
		if (serVale == null) {
			if (other.serVale != null)
				return false;
		} else if (!serVale.equals(other.serVale))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento))
			return false;
		if (totAc != other.totAc)
			return false;
		if (totAfil != other.totAfil)
			return false;
		if (totRec != other.totRec)
			return false;
		if (tratProlongado == null) {
			if (other.tratProlongado != null)
				return false;
		} else if (!tratProlongado.equals(other.tratProlongado))
			return false;
		if (troquelN != other.troquelN)
			return false;
		return true;
	}

}
