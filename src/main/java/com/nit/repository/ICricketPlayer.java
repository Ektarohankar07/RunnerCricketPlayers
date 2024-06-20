package com.nit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nit.model.CricketPlayer;

@Repository
public interface ICricketPlayer extends CrudRepository<CricketPlayer, Long>
{

	

}
