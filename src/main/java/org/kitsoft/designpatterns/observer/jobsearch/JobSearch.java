package org.kitsoft.designpatterns.observer.jobsearch;

import org.kitsoft.designpatterns.observer.jobsearch.observer.MemberObserver;

public interface JobSearch {
	public void addObserver(MemberObserver o);
	public void deleteObserver(MemberObserver o);
	public void notifyObservers();
}
