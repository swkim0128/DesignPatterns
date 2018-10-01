package org.kitsoft.designpatterns.observer.weather.push.subject;

import org.kitsoft.designpatterns.observer.weather.push.observer.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
