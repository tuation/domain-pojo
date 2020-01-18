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
@Table(name = "qualificationd_details")
public class QualificationDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "qualification_id")
	private int qualificationId;

	@Column(name = "qualification_name")
	private String qualificationName;

	@Column(name = "qualification_description")
	private String qualificationDescription;

	@Column(name = "qualification_created_date")
	private Date qualificationCreatedDate;

	@Column(name = "qualification_created_by")
	private String qualificationCreatedBy;

	@Column(name = "qualification_last_modified_date")
	private Date qualificationLastModifiedDate;

	@Column(name = "qualification_last_modified_by")
	private String qualificationLastModifiedBy;

	/**
	 * @return the qualificationId
	 */
	public int getQualificationId() {
		return qualificationId;
	}

	/**
	 * @param qualificationId the qualificationId to set
	 */
	public void setQualificationId(int qualificationId) {
		this.qualificationId = qualificationId;
	}

	/**
	 * @return the qualificationName
	 */
	public String getQualificationName() {
		return qualificationName;
	}

	/**
	 * @param qualificationName the qualificationName to set
	 */
	public void setQualificationName(String qualificationName) {
		this.qualificationName = qualificationName;
	}

	/**
	 * @return the qualificationDescription
	 */
	public String getQualificationDescription() {
		return qualificationDescription;
	}

	/**
	 * @param qualificationDescription the qualificationDescription to set
	 */
	public void setQualificationDescription(String qualificationDescription) {
		this.qualificationDescription = qualificationDescription;
	}

	/**
	 * @return the qualificationCreatedDate
	 */
	public Date getQualificationCreatedDate() {
		return qualificationCreatedDate;
	}

	/**
	 * @param qualificationCreatedDate the qualificationCreatedDate to set
	 */
	public void setQualificationCreatedDate(Date qualificationCreatedDate) {
		this.qualificationCreatedDate = qualificationCreatedDate;
	}

	/**
	 * @return the qualificationCreatedBy
	 */
	public String getQualificationCreatedBy() {
		return qualificationCreatedBy;
	}

	/**
	 * @param qualificationCreatedBy the qualificationCreatedBy to set
	 */
	public void setQualificationCreatedBy(String qualificationCreatedBy) {
		this.qualificationCreatedBy = qualificationCreatedBy;
	}

	/**
	 * @return the qualificationLastModifiedDate
	 */
	public Date getQualificationLastModifiedDate() {
		return qualificationLastModifiedDate;
	}

	/**
	 * @param qualificationLastModifiedDate the qualificationLastModifiedDate to set
	 */
	public void setQualificationLastModifiedDate(Date qualificationLastModifiedDate) {
		this.qualificationLastModifiedDate = qualificationLastModifiedDate;
	}

	/**
	 * @return the qualificationLastModifiedBy
	 */
	public String getQualificationLastModifiedBy() {
		return qualificationLastModifiedBy;
	}

	/**
	 * @param qualificationLastModifiedBy the qualificationLastModifiedBy to set
	 */
	public void setQualificationLastModifiedBy(String qualificationLastModifiedBy) {
		this.qualificationLastModifiedBy = qualificationLastModifiedBy;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QualificationDetails [qualificationId=" + qualificationId + ", qualificationName=" + qualificationName
				+ ", qualificationDescription=" + qualificationDescription + ", qualificationCreatedDate="
				+ qualificationCreatedDate + ", qualificationCreatedBy=" + qualificationCreatedBy
				+ ", qualificationLastModifiedDate=" + qualificationLastModifiedDate + ", qualificationLastModifiedBy="
				+ qualificationLastModifiedBy + "]";
	}

}
