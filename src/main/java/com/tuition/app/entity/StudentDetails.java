/**
 * 
 */
package com.tuition.app.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author debas
 *
 */
@Entity
@Table(name = "student_details")
public class StudentDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private int sudent_id;

	@Column(name = "student_fname")
	private String student_fname;

	@Column(name = "student_lname")
	private String student_lname;

	@Column(name = "student_email")
	private String student_email;

	@Column(name = "student_mobile")
	private String student_mobile;

	@Column(name = "student_address1")
	private String student_address1;

	@Column(name = "student_address2")
	private String student_address2;

	@Column(name = "student_address3")
	private String student_address3;

	@Column(name = "student_address4")
	private String student_address4;

	@Column(name = "student_city")
	private String student_city;

	@Column(name = "student_country")
	private String student_country;

	@Column(name = "student_pin")
	private int student_pin;

	@Column(name = "student_created_date")
	private Date student_created_date;

	@Column(name = "student_created_by")
	private String student_created_by;

	@Column(name = "student_last_modified_date")
	private Date student_last_modified_date;

	@Column(name = "student_last_modified_by")
	private String student_last_modified_by;

	/**
	 * @return the sudent_id
	 */
	public int getSudent_id() {
		return sudent_id;
	}

	/**
	 * @param sudent_id the sudent_id to set
	 */
	public void setSudent_id(int sudent_id) {
		this.sudent_id = sudent_id;
	}

	/**
	 * @return the student_fname
	 */
	public String getStudent_fname() {
		return student_fname;
	}

	/**
	 * @param student_fname the student_fname to set
	 */
	public void setStudent_fname(String student_fname) {
		this.student_fname = student_fname;
	}

	/**
	 * @return the student_lname
	 */
	public String getStudent_lname() {
		return student_lname;
	}

	/**
	 * @param student_lname the student_lname to set
	 */
	public void setStudent_lname(String student_lname) {
		this.student_lname = student_lname;
	}

	/**
	 * @return the student_email
	 */
	public String getStudent_email() {
		return student_email;
	}

	/**
	 * @param student_email the student_email to set
	 */
	public void setStudent_email(String student_email) {
		this.student_email = student_email;
	}

	/**
	 * @return the student_mobile
	 */
	public String getStudent_mobile() {
		return student_mobile;
	}

	/**
	 * @param student_mobile the student_mobile to set
	 */
	public void setStudent_mobile(String student_mobile) {
		this.student_mobile = student_mobile;
	}

	/**
	 * @return the student_address1
	 */
	public String getStudent_address1() {
		return student_address1;
	}

	/**
	 * @param student_address1 the student_address1 to set
	 */
	public void setStudent_address1(String student_address1) {
		this.student_address1 = student_address1;
	}

	/**
	 * @return the student_address2
	 */
	public String getStudent_address2() {
		return student_address2;
	}

	/**
	 * @param student_address2 the student_address2 to set
	 */
	public void setStudent_address2(String student_address2) {
		this.student_address2 = student_address2;
	}

	/**
	 * @return the student_address3
	 */
	public String getStudent_address3() {
		return student_address3;
	}

	/**
	 * @param student_address3 the student_address3 to set
	 */
	public void setStudent_address3(String student_address3) {
		this.student_address3 = student_address3;
	}

	/**
	 * @return the student_address4
	 */
	public String getStudent_address4() {
		return student_address4;
	}

	/**
	 * @param student_address4 the student_address4 to set
	 */
	public void setStudent_address4(String student_address4) {
		this.student_address4 = student_address4;
	}

	/**
	 * @return the student_city
	 */
	public String getStudent_city() {
		return student_city;
	}

	/**
	 * @param student_city the student_city to set
	 */
	public void setStudent_city(String student_city) {
		this.student_city = student_city;
	}

	/**
	 * @return the student_country
	 */
	public String getStudent_country() {
		return student_country;
	}

	/**
	 * @param student_country the student_country to set
	 */
	public void setStudent_country(String student_country) {
		this.student_country = student_country;
	}

	/**
	 * @return the student_pin
	 */
	public int getStudent_pin() {
		return student_pin;
	}

	/**
	 * @param student_pin the student_pin to set
	 */
	public void setStudent_pin(int student_pin) {
		this.student_pin = student_pin;
	}

	/**
	 * @return the student_created_date
	 */
	public Date getStudent_created_date() {
		return student_created_date;
	}

	/**
	 * @param student_created_date the student_created_date to set
	 */
	public void setStudent_created_date(Date student_created_date) {
		this.student_created_date = student_created_date;
	}

	/**
	 * @return the student_created_by
	 */
	public String getStudent_created_by() {
		return student_created_by;
	}

	/**
	 * @param student_created_by the student_created_by to set
	 */
	public void setStudent_created_by(String student_created_by) {
		this.student_created_by = student_created_by;
	}

	/**
	 * @return the student_last_modified_date
	 */
	public Date getStudent_last_modified_date() {
		return student_last_modified_date;
	}

	/**
	 * @param student_last_modified_date the student_last_modified_date to set
	 */
	public void setStudent_last_modified_date(Date student_last_modified_date) {
		this.student_last_modified_date = student_last_modified_date;
	}

	/**
	 * @return the student_last_modified_by
	 */
	public String getStudent_last_modified_by() {
		return student_last_modified_by;
	}

	/**
	 * @param student_last_modified_by the student_last_modified_by to set
	 */
	public void setStudent_last_modified_by(String student_last_modified_by) {
		this.student_last_modified_by = student_last_modified_by;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentDetails [sudent_id=" + sudent_id + ", student_fname=" + student_fname + ", student_lname="
				+ student_lname + ", student_email=" + student_email + ", student_mobile=" + student_mobile
				+ ", student_address1=" + student_address1 + ", student_address2=" + student_address2
				+ ", student_address3=" + student_address3 + ", student_address4=" + student_address4
				+ ", student_city=" + student_city + ", student_country=" + student_country + ", student_pin="
				+ student_pin + ", student_created_date=" + student_created_date + ", student_created_by="
				+ student_created_by + ", student_last_modified_date=" + student_last_modified_date
				+ ", student_last_modified_by=" + student_last_modified_by + "]";
	}

}
