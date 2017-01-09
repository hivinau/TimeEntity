package dnr2i.models;

import java.util.*;
import dnr2i.models.entity.*;
import dnr2i.models.state.*;

public final class Time {

	private final List<TimeEntity> entities;
	
	private final StateTime defaultState;
	private final StateTime synchronizedState;
	private final StateTime currentState;
	
	public Time() {
		
		entities = new ArrayList<>();
		
		defaultState = new DefaultStateTime(this);
		synchronizedState = new SynchronizedStateTime(this);
		
		currentState = defaultState;
	}
	
	public void switchState(boolean sync) {
		
		currentState = sync ? synchronizedState : defaultState;
	}
	
	public void add(TimeEntity entity) {
		
		entities.add(entity);
		defaultState.add(entity);
		synchronizedState.add(entity);
	}
	
	public void remove(TimeEntity entity) {
		
		entities.remove(entity);
		defaultState.remove(entity);
		synchronizedState.remove(entity);
	}
	
	public long getStart() {
		
		return currentState.getStart();
	}
}

