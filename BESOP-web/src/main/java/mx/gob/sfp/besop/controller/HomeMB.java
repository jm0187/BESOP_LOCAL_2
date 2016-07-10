package mx.gob.sfp.besop.controller;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mx.gob.sfp.besop.service.HomeServiceLocal;

@ManagedBean
@SessionScoped
public class HomeMB extends GenericMB {
	
	private static final long serialVersionUID = 1L;
	
	@EJB
	private HomeServiceLocal homeServiceLocal;
	
	private String datos;
	
	@PostConstruct
	private void init(){
		datos = "Bienvenido al SISTEMA BESOP";
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}

}
