package com.example.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="School")
public class EntityDetails {
	
	@Id
	@Column(name="STD_ID")
	private int sid;
	@Column(name="NAME")
	private String name;
	@Column(name="S_RANK")
	private int rank;
	@Column(name="TEAM")
	private String team;

}
