package org.kitsoft.designpatterns.observer.jobsearch;

import java.util.ArrayList;

import org.kitsoft.designpatterns.observer.jobsearch.observer.MemberObserver;

public class JobSearchData implements JobSearch {
	private ArrayList<MemberObserver> observers;
	private String company;
	private int salary;
	private int career;
	private String employmentType;
	
	public JobSearchData() {
		observers = new ArrayList<MemberObserver>();
	}
	
	public void addObserver(MemberObserver o) {
		observers.add(o);
	}
	
	public void deleteObserver(MemberObserver o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for(MemberObserver o : observers) {
			o.update(company, employmentType, salary, career);
		}
	}
	
	public void setMeasurements(String company, String e, int s, int career) {
		this.company = company;
		employmentType = e;
		salary = s;
		this.career = career;
		
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
}
