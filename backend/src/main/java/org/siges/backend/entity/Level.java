package org.siges.backend.entity;

import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="levels")
@Data
public class Level {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="level_name")
	private String levelName; 
	
	@Column(name="short_level_name")
	private String shortLevelName; 
	
	@Column(name="previous_level")
	private BigInteger previousLevel; 
	
	@ManyToOne
	@JoinColumn(name="section", nullable=false)
	private Section section; 
	
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
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="level")
	private Set<Room> rooms; 
	
	
	
	
	
	
	

}
