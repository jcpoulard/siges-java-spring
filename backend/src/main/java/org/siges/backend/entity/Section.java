package org.siges.backend.entity;


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
@Table(name="sections")
@Data
public class Section {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="section_name")
	private String sectionName; 
	
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
	
	
	
	
	
}
