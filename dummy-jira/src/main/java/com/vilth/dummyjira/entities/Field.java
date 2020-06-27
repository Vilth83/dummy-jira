package com.vilth.dummyjira.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Field {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = CascadeType.ALL)
	private TeamMember reporter;
	@ManyToOne(cascade = CascadeType.ALL)
	private TeamMember assignee;
	@ManyToOne(cascade = CascadeType.ALL)
	private TeamMember requestor;

	@ManyToOne(cascade = CascadeType.ALL)
	private Category issueType;
	@ManyToOne(cascade = CascadeType.ALL)
	private Category priority;
	@ManyToOne(cascade = CascadeType.ALL)
	private Category status;
	@ManyToOne(cascade = CascadeType.ALL)
	private Parent parent;
	private String summary;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<FixVersion> fixVersions;
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Attachment> attachment;

}
