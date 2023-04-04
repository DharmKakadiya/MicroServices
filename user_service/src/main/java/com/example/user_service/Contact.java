package com.example.user_service;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



public class Contact {
	
	private int cid;
	private String UnitId;
	private int St_no;
	private int uid;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getUnitId() {
		return UnitId;
	}
	public void setUnitId(String unitId) {
		UnitId = unitId;
	}
	public int getSt_no() {
		return St_no;
	}
	public void setSt_no(int st_no) {
		St_no = st_no;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public int hashCode() {
		return Objects.hash(St_no, UnitId, cid, uid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return St_no == other.St_no && Objects.equals(UnitId, other.UnitId) && cid == other.cid && uid == other.uid;
	}
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", UnitId=" + UnitId + ", St_no=" + St_no + ", uid=" + uid + "]";
	}

	
	
}
