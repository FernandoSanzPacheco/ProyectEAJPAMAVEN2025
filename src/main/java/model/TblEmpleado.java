package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_empleado database table.
 * 
 */
@Entity
@Table(name="tbl_empleado")
@NamedQuery(name="TblEmpleado.findAll", query="SELECT t FROM TblEmpleado t")
public class TblEmpleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idempleado;

	private String apelempleado;

	private String dniempleado;

	private String emaempleado;

	private String nomempleado;

	private String sexempleado;

	private String telempleado;

	public TblEmpleado() {
	}

	public int getIdempleado() {
		return this.idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getApelempleado() {
		return this.apelempleado;
	}

	public void setApelempleado(String apelempleado) {
		this.apelempleado = apelempleado;
	}

	public String getDniempleado() {
		return this.dniempleado;
	}

	public void setDniempleado(String dniempleado) {
		this.dniempleado = dniempleado;
	}

	public String getEmaempleado() {
		return this.emaempleado;
	}

	public void setEmaempleado(String emaempleado) {
		this.emaempleado = emaempleado;
	}

	public String getNomempleado() {
		return this.nomempleado;
	}

	public void setNomempleado(String nomempleado) {
		this.nomempleado = nomempleado;
	}

	public String getSexempleado() {
		return this.sexempleado;
	}

	public void setSexempleado(String sexempleado) {
		this.sexempleado = sexempleado;
	}

	public String getTelempleado() {
		return this.telempleado;
	}

	public void setTelempleado(String telempleado) {
		this.telempleado = telempleado;
	}

}