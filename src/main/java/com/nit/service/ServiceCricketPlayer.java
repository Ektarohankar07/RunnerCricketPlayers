package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.CricketPlayer;
import com.nit.repository.ICricketPlayer;

@Service
public class ServiceCricketPlayer 
{
	@Autowired
	private ICricketPlayer repository;
	 
	public CricketPlayer save(CricketPlayer player)
	{
		return repository.save(player);
	}
	
	public Iterable<CricketPlayer> get()
	{
		return repository.findAll();
	}
	
	public CricketPlayer update(CricketPlayer player)
	{
		return repository.save(player);
	}
	
	public void delete(CricketPlayer player)
	{
		repository.delete(player);
	}
	
	

}
