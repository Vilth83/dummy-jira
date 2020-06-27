package com.vilth.dummyjira.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vilth.dummyjira.entities.Ticket;

public interface JiraRepo extends JpaRepository<Ticket, Long> {

	Ticket findByKey(String key);

}
