package com.http.tp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String nom_complet;
@Min(18)
@NotNull
private int age;
@Column(nullable = true)
private String adresse;
@Column(length = 20)
private String tel;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNom_complet() {
	return nom_complet;
}
public void setNom_complet(String nom_complet) {
	this.nom_complet = nom_complet;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}



}
