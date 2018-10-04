package org.kitsoft.designpatterns.observer.jobsearch.observer;

import org.kitsoft.designpatterns.observer.jobsearch.JobSearch;

public class Member1 implements MemberObserver, DisplayElementImp {
	private String company;
	private int salary;
	private int career;
	@SuppressWarnings("unused")
	private String employmentType;

	@SuppressWarnings("unused")
	private JobSearch jobSearch;
	
	public Member1(JobSearch jobSearch) {
		this.jobSearch = jobSearch;
		jobSearch.addObserver(this);
	}
	
	public void update(String company, String employmentType, int salary, int career) {
		this.company = company;
		this.employmentType = employmentType;
		this.salary = salary;
		this.career = career;
	}
	
	public void display() {
		System.out.println("company : " + company + ", salary : " + salary + ", career : " + career);
	}
}
