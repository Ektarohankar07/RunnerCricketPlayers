package com.nit.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Cricket_Player")
public class CricketPlayer 
{
	@Id
	private Long playerId;
	private String name;
	private Long age;
	private String team;
	private List<String> role;
	private Long matchesPlayed;
	private Long runsScored;
	private Long wicketsTaken;

}
