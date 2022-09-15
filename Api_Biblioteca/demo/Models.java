package com.IniciarBiblioteca.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name= "users")
@EntityListeners(AuditingEntityListener.class)
public class Models {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "last_name_p")
	private String last_name_p;
	
	@Column(name = "last_name_m")
	private String last_name_m;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "sanctions")
	private int sanctions;
	
	@Column(name = "sanc_money")
	private int sancMoney;

		
	public Models() {
		
	}

		
	public Models(int id, String name, String last_name_p, String last_name_m, String domicilio, String tel,
			int sanctions, int sancMoney) {
		super();
		this.id = id;
		this.name = name;
		this.last_name_p = last_name_p;
		this.last_name_m = last_name_m;
		this.domicilio = domicilio;
		this.tel = tel;
		this.sanctions = sanctions;
		this.sancMoney = sancMoney;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name_p() {
		return last_name_p;
	}

	public void setLast_name_p(String last_name_p) {
		this.last_name_p = last_name_p;
	}

	public String getLast_name_m() {
		return last_name_m;
	}

	public void setLast_name_m(String last_name_m) {
		this.last_name_m = last_name_m;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public int getSanctions() {
		return sanctions;
	}

	public void setSanctions(int sanctions) {
		this.sanctions = sanctions;
	}

	public int getSancMoney() {
		return sancMoney;
	}

	public void setSancMoney(int sancMoney) {
		this.sancMoney = sancMoney;
	}
	
	
	
}


