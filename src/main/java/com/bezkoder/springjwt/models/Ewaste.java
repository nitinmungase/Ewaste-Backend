package com.bezkoder.springjwt.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ewaste {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String title;
	private String description;
	private int quantity;
	private String username;
	private int ecopoints;
	private double weight;
	
	public Ewaste() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getEcopoints() {
		return ecopoints;
	}
	public void setEcopoints(int ecopoints) {
		this.ecopoints = ecopoints;
	}
	@Override
	public String toString() {
		return "Ewaste [id=" + id + ", title=" + title + ", description=" + description + ", quantity=" + quantity
				+ ", username=" + username + ", ecopoints=" + ecopoints + ", weight=" + weight + "]";
	}
	public Ewaste(long id, String title, String description, int quantity, String username, int ecopoints,
			double weight) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.quantity = quantity;
		this.username = username;
		this.ecopoints = ecopoints;
		this.weight = weight;
	}
	
	
}
