package br.com.unicuritiba.projectinvestimento.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Investimento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private int period;
	private double inicialApplic;
	private double rentability;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public double getInicialApplic() {
		return inicialApplic;
	}
	public void setInicialApplic(double inicialApplic) {
		this.inicialApplic = inicialApplic;
	}
	public double getRentability() {
		return rentability;
	}
	public void setRentability(double rentability) {
		this.rentability = rentability;
	}
	
	

}
