package org.siges.backend.entity;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="cycles")
@Data
public class Cycle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="cycle_description")
	private String cycleDescription; 
	
	@Column(name="average_base")
	private BigInteger averageBase; 
	
	@ManyToOne
	@JoinColumn(name="academic_year", nullable=false)
	private AcademicPeriod academicPeriod; 
	
	

}
