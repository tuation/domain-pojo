package com.tuition.app.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacher_details")
public class TeacherDetails implements Serializable {

	/**
	 * @author sunil.kb
	 */
	private static final long serialVersionUID = -3026802032376184985L;

	@Id
	@Column(name="teacher_id")
	private String teacherId;
	@Column(name="teacher_quote")
	private String quoteId;
	@Column(name="teacher_fname")
	private String teacherFirstName;
	@Column(name="teacher_lname")
	private String teacherLastName;
	@Column(name="teacher_email")
	private String teacherEmail;
	@Column(name="teacher_mobile")
	private BigDecimal teacherMobile;
	@Column(name="teacher_address1")
	private String teacherAddress1;
	@Column(name="teacher_address2")
	private String teacherAddress2;
	@Column(name="teacher_address3")
	private String teacherAddress3;
	@Column(name="teacher_address4")
	private String teacherAddress4;
	@Column(name="teacher_city")
	private String teacherCity;
	@Column(name="teacher_state")
	private String tecaherState;
	@Column(name="teacher_country")
	private String teacherCountry;
	@Column(name="teacher_pin")
	private String teacherPin;
	@Column(name="teacher_created_date")
	private Date createdDate;
	@Column(name="teacher_created_by")
	private String createdBy;
	@Column(name="teacher_last_modified_by")
	private String lastModifiedBy;
	@Column(name="teacher_last_modified_date")
	private Date lastModifiedDate;
	
	
	
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getTeacherFirstName() {
		return teacherFirstName;
	}
	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}
	public String getTeacherEmail() {
		return teacherEmail;
	}
	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}
	public BigDecimal getTeacherMobile() {
		return teacherMobile;
	}
	public void setTeacherMobile(BigDecimal teacherMobile) {
		this.teacherMobile = teacherMobile;
	}
	public String getTeacherAddress1() {
		return teacherAddress1;
	}
	public void setTeacherAddress1(String teacherAddress1) {
		this.teacherAddress1 = teacherAddress1;
	}
	public String getTeacherAddress2() {
		return teacherAddress2;
	}
	public void setTeacherAddress2(String teacherAddress2) {
		this.teacherAddress2 = teacherAddress2;
	}
	public String getTeacherAddress3() {
		return teacherAddress3;
	}
	public void setTeacherAddress3(String teacherAddress3) {
		this.teacherAddress3 = teacherAddress3;
	}
	public String getTeacherAddress4() {
		return teacherAddress4;
	}
	public void setTeacherAddress4(String teacherAddress4) {
		this.teacherAddress4 = teacherAddress4;
	}
	public String getTeacherCity() {
		return teacherCity;
	}
	public void setTeacherCity(String teacherCity) {
		this.teacherCity = teacherCity;
	}
	public String getTecaherState() {
		return tecaherState;
	}
	public void setTecaherState(String tecaherState) {
		this.tecaherState = tecaherState;
	}
	public String getTeacherCountry() {
		return teacherCountry;
	}
	public void setTeacherCountry(String teacherCountry) {
		this.teacherCountry = teacherCountry;
	}
	public String getTeacherPin() {
		return teacherPin;
	}
	public void setTeacherPin(String teacherPin) {
		this.teacherPin = teacherPin;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	
}
