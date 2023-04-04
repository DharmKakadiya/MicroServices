package com.example.contact_service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Objects;


@Entity
@Table(name="Contact_service")
@Data
public class Contact {
	
	@Id
	private int cid;
	private String unit;
	private long st;
	private long uid;

}
