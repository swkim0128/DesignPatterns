package org.kitsoft.designpatterns.observer.weather.pull.subject;

import org.kitsoft.designpatterns.observer.weather.pull.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
