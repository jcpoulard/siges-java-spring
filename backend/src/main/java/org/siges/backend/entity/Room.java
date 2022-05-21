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

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name="rooms")
@Data
public class Room {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id; 
	
	@Column(name="room_name")
	private String roomName; 
	
	@Column(name="short_room_name")
	private String shortRoomName; 
	
	@ManyToOne
	@JoinColumn(name="level", nullable=false)
	private Level level; 
	
	@ManyToOne
	@JoinColumn(name="shift", nullable=false)
	private Shift shift; 
	
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
