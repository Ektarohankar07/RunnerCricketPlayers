package com.nit.model;

public enum RoleInfo 
{
	BATSMAN("Lefty"),BOWLER("Spinner"),ALLROUNDER("All"),WICKETKEEPER("WK");
	
	public String role;
	private RoleInfo(String role)
	{
		this.role=role;
	}

}
