package Gestion;

import java.time.LocalDate;
import java.util.Date;

public class Tarea {

	String tit;
	String desc;
	LocalDate fec;
	
	public String getTit() {
		return tit;
	}

	public void setTit(String tit) {
		this.tit = tit;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public LocalDate getFec() {
		return fec;
	}

	public void setFec(LocalDate fec) {
		this.fec = fec;
	}

	
	
	public Tarea(String tit, String desc, LocalDate fec) {
		super();
		this.tit = tit;
		this.desc = desc;
		this.fec = fec;
	}
	
		
	
}
