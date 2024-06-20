package com.nit.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

import com.nit.model.CricketPlayer;
import com.nit.model.RoleInfo;
import com.nit.service.ServiceCricketPlayer;
@Controller
public class ControllerCricketPlayer  implements CommandLineRunner 
{
	@Autowired
	private ServiceCricketPlayer service;
	@Override
	public void run(String... args) throws Exception 
	{
		CricketPlayer cp=new CricketPlayer();
		List<String> l=new ArrayList<>();
		
		cp.setPlayerId(102l);
		cp.setName("SKY");
		cp.setAge(35l);
		cp.setTeam("India");
		l.add(RoleInfo.BATSMAN.role);
		cp.setRole(l);
		cp.setMatchesPlayed(30l);
		cp.setRunsScored(600l);
		cp.setWicketsTaken(5l);
		
		service.save(cp);
		service.get().forEach(System.out::println);
		
	}

}
