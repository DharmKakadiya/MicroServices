package com.example.user_service;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="userinfo")
public class User {
	
	@Id
	private int uid;
	private String name;
	private String email;
	private int mobileNo;
	@Transient
	private List<Contact> contact;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<Contact> getContact() {
		return contact;
	}
	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contact, email, mobileNo, name, uid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(contact, other.contact) && Objects.equals(email, other.email)
				&& mobileNo == other.mobileNo && Objects.equals(name, other.name) && uid == other.uid;
	}
	@Override
	public String toString() {
		return "UserEntity [uid=" + uid + ", name=" + name + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", contact=" + contact + "]";
	}

		

}
