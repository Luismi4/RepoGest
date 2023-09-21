package Gestion;

import java.util.Date;

public class Tarea {

	String tit;
	String desc;
	Date fec;
	
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

	public Date getFec() {
		return fec;
	}

	public void setFec(Date fec) {
		this.fec = fec;
	}

	
	
	public Tarea(String tit, String desc, Date fec) {
		super();
		this.tit = tit;
		this.desc = desc;
		this.fec = fec;
	}
	
		
	
}
