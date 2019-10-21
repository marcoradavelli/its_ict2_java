package org.fondazionejac.figure.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.Data;

@Entity
@Table(name = "figure")
@Data
public class Figura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6516876154094212785L;

	@Id
	private int idfigure;
	
	@Basic
	private String type;
	
	@Basic
	private Double a;
	
	@Basic
	private Double b;

	@Basic
	private Double c;

	public Figura() {}
	
	public Figura(int idfigure, String type, Double a, Double b, Double c) {
		this.idfigure = idfigure;
		this.type = type;
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public int getIdfigure() {
		return idfigure;
	}

	public void setIdfigure(int idfigure) {
		this.idfigure = idfigure;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getA() {
		return a;
	}

	public void setA(Double a) {
		this.a = a;
	}

	public Double getB() {
		return b;
	}

	public void setB(Double b) {
		this.b = b;
	}

	public Double getC() {
		return c;
	}

	public void setC(Double c) {
		this.c = c;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
