package prescriptions.web.wrappers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.joda.time.DateTime;

import prescriptions.domain.entity.Alfabeta;
import prescriptions.domain.entity.Price;

public class AlfabetaWrapper {
	
	private Price price;
	private Alfabeta alfabeta;
	
	public AlfabetaWrapper(String nombre, String fecha) {
		List<Price> prices = new LinkedList<Price> ();
		Price p1 = new Price();
		
		p1.setFecha("20140620");
		p1.setPrecio(123);
		p1.setRegistro(1);
		p1.setTurno("turno");
		
		Price p2 = new Price();
		
		p2.setFecha("20140629");
		p2.setPrecio(125);
		p2.setRegistro(1);
		p2.setTurno("turno");
		
		prices.add(p1);
		prices.add(p2);
		
		Alfabeta alfabeta = new Alfabeta();
		
		alfabeta.setNombre(nombre);
		alfabeta.setPrecio(123);
		
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			DateTime currentDate = new DateTime(format.parse(String.valueOf(fecha)));
			long minDays = Long.MAX_VALUE;
			Price auxPrice = null;
			for (Price p : prices) {
				DateTime pDate = new DateTime(format.parse(p.getFecha()));
				long millisBetween = currentDate.getMillis() - pDate.getMillis(); 
				if (millisBetween > 0 && millisBetween < minDays) {
					minDays = millisBetween;
					auxPrice = p;
				}
			}
			this.price = auxPrice;
		} catch (ParseException e) {
			this.price = null;
		} finally {
			this.alfabeta = alfabeta;
		}
	}
	
	public AlfabetaWrapper(List<Price> prices, Alfabeta alfabeta, Integer fecha) {
		try {
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			DateTime currentDate = new DateTime(format.parse(String.valueOf(fecha)));
			long minDays = Long.MAX_VALUE;
			Price auxPrice = null;
			for (Price p : prices) {
				DateTime pDate = new DateTime(format.parse(p.getFecha()));
				long millisBetween = currentDate.getMillis() - pDate.getMillis(); 
				if (millisBetween > 0 && millisBetween < minDays) {
					minDays = millisBetween;
					auxPrice = p;
				}
			}
			this.price = auxPrice;
		} catch (ParseException e) {
			this.price = null;
		} finally {
			this.alfabeta = alfabeta;
		}
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Alfabeta getAlfabeta() {
		return alfabeta;
	}

	public void setAlfabeta(Alfabeta alfabeta) {
		this.alfabeta = alfabeta;
	}

}
