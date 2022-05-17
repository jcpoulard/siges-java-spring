package org.siges.backend.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="academicperiods")
@Data
public class AcademicPeriod {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="name_period")
	private String namePeriod; 
	
	@Column(name="weight")
	private BigDecimal weight; 
	
	@Column(name="date_start")
	private Date dateStart; 
	
	@Column(name="date_end")
	private Date dateEnd; 
	
	@Column(name="is_year")
	private int isYear; 
	
	@Column(name="previous_academic_year")
	private int previousAcademicYear; 
	
	@Column(name="year")
	private int year; 
	
	@Column(name="date_created")
	@CreationTimestamp
	private Date dateCreated; 
	
	@Column(name="date_updated")
	@CreationTimestamp
	private Date dateUpdated; 
	
	@Column(name="create_by")
	private String createBy; 
	
	@Column(name="update_by")
	private String updatedBy; 
	
	
	
	
	
	
	
	
	
	

}
