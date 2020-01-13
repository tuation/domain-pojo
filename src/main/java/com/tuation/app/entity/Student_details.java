/**
 * 
 */
package com.tuation.app.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author debas
 *
 */
@Entity
@Table(name = "student_details")
public class Student_details {
	
	private int sudent_id;
	private String student_fname;
	private String student_lname;
	private String student_email;
	private String student_mobile;
	private String student_address1;
	private String student_address2;
	private String student_address4;
	private String student_city;
	private String student_country;
	private int student_pin;
	private String student_created_date;
	private String student_created_by;
	private Date student_last_modified_date;
	private String student_last_modified_by;
	
}
