package com.vilth.dummyjira.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vilth.dummyjira.entities.Ticket;

@RestController
@RequestMapping("/jira")
public class DummyJiraController {

	@Autowired
	private JiraService jiraService;

	@PostMapping
	public void save(@RequestBody Ticket ticket) {
		jiraService.save(ticket);
	}

	@GetMapping("ticket/{key}")
	public Ticket findByKey(@PathVariable String key) {
		return jiraService.findByKey(key);
	}

}
