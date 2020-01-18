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
@Table(name = "parent_details")
public class ParentDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "parent_id")
	private int parentId;

	@Column(name = "parent_name")
	private String parentName;

	@Column(name = "parent_email")
	private String parentEmail;

	@Column(name = "parent_mobile")
	private String parentMobile;

	@Column(name = "parent_address1")
	private String parentAddress1;

	@Column(name = "parent_address2")
	private String parentAddress2;

	@Column(name = "parent_address3")
	private String parentAddress3;

	@Column(name = "parent_occupation")
	private String parentOccupation;

	@Column(name = "parent_city")
	private String parentCity;

	@Column(name = "parent_country")
	private String parentCountry;

	@Column(name = "parent_pin")
	private String parentPin;

	@Column(name = "parent_relaion")
	private String parentRelaion;

	@Column(name = "parent_created_date")
	private Date parentCreatedDate;

	@Column(name = "parent_created_by")
	private String parentCreatedBy;

	@Column(name = "parent_last_modified_date")
	private Date parentLastModifiedDate;

	@Column(name = "parent_last_modified_by")
	private String parentLastModifiedBy;

	/**
	 * @return the parentId
	 */
	public int getParentId() {
		return parentId;
	}

	/**
	 * @param parentId the parentId to set
	 */
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	/**
	 * @return the parentName
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * @param parentName the parentName to set
	 */
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	/**
	 * @return the parentEmail
	 */
	public String getParentEmail() {
		return parentEmail;
	}

	/**
	 * @param parentEmail the parentEmail to set
	 */
	public void setParentEmail(String parentEmail) {
		this.parentEmail = parentEmail;
	}

	/**
	 * @return the parentMobile
	 */
	public String getParentMobile() {
		return parentMobile;
	}

	/**
	 * @param parentMobile the parentMobile to set
	 */
	public void setParentMobile(String parentMobile) {
		this.parentMobile = parentMobile;
	}

	/**
	 * @return the parentAddress1
	 */
	public String getParentAddress1() {
		return parentAddress1;
	}

	/**
	 * @param parentAddress1 the parentAddress1 to set
	 */
	public void setParentAddress1(String parentAddress1) {
		this.parentAddress1 = parentAddress1;
	}

	/**
	 * @return the parentAddress2
	 */
	public String getParentAddress2() {
		return parentAddress2;
	}

	/**
	 * @param parentAddress2 the parentAddress2 to set
	 */
	public void setParentAddress2(String parentAddress2) {
		this.parentAddress2 = parentAddress2;
	}

	/**
	 * @return the parentAddress3
	 */
	public String getParentAddress3() {
		return parentAddress3;
	}

	/**
	 * @param parentAddress3 the parentAddress3 to set
	 */
	public void setParentAddress3(String parentAddress3) {
		this.parentAddress3 = parentAddress3;
	}

	/**
	 * @return the parentOccupation
	 */
	public String getParentOccupation() {
		return parentOccupation;
	}

	/**
	 * @param parentOccupation the parentOccupation to set
	 */
	public void setParentOccupation(String parentOccupation) {
		this.parentOccupation = parentOccupation;
	}

	/**
	 * @return the parentCity
	 */
	public String getParentCity() {
		return parentCity;
	}

	/**
	 * @param parentCity the parentCity to set
	 */
	public void setParentCity(String parentCity) {
		this.parentCity = parentCity;
	}

	/**
	 * @return the parentCountry
	 */
	public String getParentCountry() {
		return parentCountry;
	}

	/**
	 * @param parentCountry the parentCountry to set
	 */
	public void setParentCountry(String parentCountry) {
		this.parentCountry = parentCountry;
	}

	/**
	 * @return the parentPin
	 */
	public String getParentPin() {
		return parentPin;
	}

	/**
	 * @param parentPin the parentPin to set
	 */
	public void setParentPin(String parentPin) {
		this.parentPin = parentPin;
	}

	/**
	 * @return the parentRelaion
	 */
	public String getParentRelaion() {
		return parentRelaion;
	}

	/**
	 * @param parentRelaion the parentRelaion to set
	 */
	public void setParentRelaion(String parentRelaion) {
		this.parentRelaion = parentRelaion;
	}

	/**
	 * @return the parentCreatedDate
	 */
	public Date getParentCreatedDate() {
		return parentCreatedDate;
	}

	/**
	 * @param parentCreatedDate the parentCreatedDate to set
	 */
	public void setParentCreatedDate(Date parentCreatedDate) {
		this.parentCreatedDate = parentCreatedDate;
	}

	/**
	 * @return the parentCreatedBy
	 */
	public String getParentCreatedBy() {
		return parentCreatedBy;
	}

	/**
	 * @param parentCreatedBy the parentCreatedBy to set
	 */
	public void setParentCreatedBy(String parentCreatedBy) {
		this.parentCreatedBy = parentCreatedBy;
	}

	/**
	 * @return the parentLastModifiedDate
	 */
	public Date getParentLastModifiedDate() {
		return parentLastModifiedDate;
	}

	/**
	 * @param parentLastModifiedDate the parentLastModifiedDate to set
	 */
	public void setParentLastModifiedDate(Date parentLastModifiedDate) {
		this.parentLastModifiedDate = parentLastModifiedDate;
	}

	/**
	 * @return the parentLastModifiedBy
	 */
	public String getParentLastModifiedBy() {
		return parentLastModifiedBy;
	}

	/**
	 * @param parentLastModifiedBy the parentLastModifiedBy to set
	 */
	public void setParentLastModifiedBy(String parentLastModifiedBy) {
		this.parentLastModifiedBy = parentLastModifiedBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParentDetails [parentId=" + parentId + ", parentName=" + parentName + ", parentEmail=" + parentEmail
				+ ", parentMobile=" + parentMobile + ", parentAddress1=" + parentAddress1 + ", parentAddress2="
				+ parentAddress2 + ", parentAddress3=" + parentAddress3 + ", parentOccupation=" + parentOccupation
				+ ", parentCity=" + parentCity + ", parentCountry=" + parentCountry + ", parentPin=" + parentPin
				+ ", parentRelaion=" + parentRelaion + ", parentCreatedDate=" + parentCreatedDate + ", parentCreatedBy="
				+ parentCreatedBy + ", parentLastModifiedDate=" + parentLastModifiedDate + ", parentLastModifiedBy="
				+ parentLastModifiedBy + "]";
	}

}
