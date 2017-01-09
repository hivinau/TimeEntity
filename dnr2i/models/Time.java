package dnr2i.models;

import java.util.*;
import dnr2i.models.entity.*;

public final class Time {

	private final List<TimeEntity> entities;
	
	public Time() {
		
		entities = new ArrayList<>();
	}
	
	public boolean add(TimeEntity entity) {
		
		boolean entityAdded = false;
		if(!entities.contains(entity)) {
			
			entities.add(entity);
			entityAdded = true;
		}
		
		return entityAdded;
	}
	
	public void remove(TimeEntity entity) {
		
		entities.remove(entity);
	}
}

