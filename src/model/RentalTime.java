package model;

// Generated 2015/1/6 �W�� 11:59:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * RentalTime generated by hbm2java
 */
public class RentalTime implements java.io.Serializable {

	private int storeId;
	private StoreInformation storeInformation;
	private Date monStart;
	private Date monEnd;
	private Date tueStart;
	private Date tueEnd;
	private Date wedStart;
	private Date wedEnd;
	private Date thuStart;
	private Date thuEnd;
	private Date friStart;
	private Date friEnd;
	private Date satStart;
	private Date satEnd;
	private Date sunStart;
	private Date sunEnd;

	public RentalTime() {
	}

	public RentalTime(StoreInformation storeInformation) {
		this.storeInformation = storeInformation;
	}

	public RentalTime(StoreInformation storeInformation, Date monStart,
			Date monEnd, Date tueStart, Date tueEnd, Date wedStart,
			Date wedEnd, Date thuStart, Date thuEnd, Date friStart,
			Date friEnd, Date satStart, Date satEnd, Date sunStart, Date sunEnd) {
		this.storeInformation = storeInformation;
		this.monStart = monStart;
		this.monEnd = monEnd;
		this.tueStart = tueStart;
		this.tueEnd = tueEnd;
		this.wedStart = wedStart;
		this.wedEnd = wedEnd;
		this.thuStart = thuStart;
		this.thuEnd = thuEnd;
		this.friStart = friStart;
		this.friEnd = friEnd;
		this.satStart = satStart;
		this.satEnd = satEnd;
		this.sunStart = sunStart;
		this.sunEnd = sunEnd;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public StoreInformation getStoreInformation() {
		return this.storeInformation;
	}

	public void setStoreInformation(StoreInformation storeInformation) {
		this.storeInformation = storeInformation;
	}

	public Date getMonStart() {
		return this.monStart;
	}

	public void setMonStart(Date monStart) {
		this.monStart = monStart;
	}

	public Date getMonEnd() {
		return this.monEnd;
	}

	public void setMonEnd(Date monEnd) {
		this.monEnd = monEnd;
	}

	public Date getTueStart() {
		return this.tueStart;
	}

	public void setTueStart(Date tueStart) {
		this.tueStart = tueStart;
	}

	public Date getTueEnd() {
		return this.tueEnd;
	}

	public void setTueEnd(Date tueEnd) {
		this.tueEnd = tueEnd;
	}

	public Date getWedStart() {
		return this.wedStart;
	}

	public void setWedStart(Date wedStart) {
		this.wedStart = wedStart;
	}

	public Date getWedEnd() {
		return this.wedEnd;
	}

	public void setWedEnd(Date wedEnd) {
		this.wedEnd = wedEnd;
	}

	public Date getThuStart() {
		return this.thuStart;
	}

	public void setThuStart(Date thuStart) {
		this.thuStart = thuStart;
	}

	public Date getThuEnd() {
		return this.thuEnd;
	}

	public void setThuEnd(Date thuEnd) {
		this.thuEnd = thuEnd;
	}

	public Date getFriStart() {
		return this.friStart;
	}

	public void setFriStart(Date friStart) {
		this.friStart = friStart;
	}

	public Date getFriEnd() {
		return this.friEnd;
	}

	public void setFriEnd(Date friEnd) {
		this.friEnd = friEnd;
	}

	public Date getSatStart() {
		return this.satStart;
	}

	public void setSatStart(Date satStart) {
		this.satStart = satStart;
	}

	public Date getSatEnd() {
		return this.satEnd;
	}

	public void setSatEnd(Date satEnd) {
		this.satEnd = satEnd;
	}

	public Date getSunStart() {
		return this.sunStart;
	}

	public void setSunStart(Date sunStart) {
		this.sunStart = sunStart;
	}

	public Date getSunEnd() {
		return this.sunEnd;
	}

	public void setSunEnd(Date sunEnd) {
		this.sunEnd = sunEnd;
	}

}
