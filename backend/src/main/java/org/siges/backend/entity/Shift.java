package org.siges.backend.entity;

import java.time.LocalTime;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="shifts")
@Data
public class Shift {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="shift_name")
	private String shiftName; 
	
	@Column(name="time_start")
	private LocalTime timeStart; 
	
	@Column(name="time_end")
	private LocalTime timeEnd; 
	
	@Column(name="date_created")
	@CreationTimestamp
	private Date dateCreated; 
	
	@Column(name="date_updated")
	@CreationTimestamp
	private Date dateUpdated; 
	
	@Column(name="create_by")
	private String createBy; 
	
	@Column(name="update_by")
	private String updateBy; 
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="shift")
	private Set<Room> rooms; 
	
	
	
	
	
	
}
