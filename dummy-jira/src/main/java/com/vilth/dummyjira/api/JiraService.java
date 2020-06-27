package com.vilth.dummyjira.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vilth.dummyjira.entities.Ticket;

@Service
public class JiraService {
	@Autowired
	private JiraRepo jiraRepo;

	public void save(Ticket ticket) {
		jiraRepo.save(ticket);

	}

	public Ticket findByKey(String key) {
		return jiraRepo.findByKey(key);
	}
}
