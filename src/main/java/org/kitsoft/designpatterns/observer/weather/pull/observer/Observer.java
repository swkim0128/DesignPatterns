package org.kitsoft.designpatterns.observer.weather.pull.observer;

import org.kitsoft.designpatterns.observer.weather.pull.subject.Subject;

public interface Observer {
	public void update(Subject w);
}
