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
		
		int index = 0;
		for(TimeEntity e : entities) {
			
			if(e.equals(entity)) {
				
				break;
			}
			
			index++;
		}
		
		entities.removeAt(index);
	}
}

