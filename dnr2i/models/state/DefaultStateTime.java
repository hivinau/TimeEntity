package dnr2i.models.state;

import dnr2i.models.*;
import dnr2i.models.entity.*;

public final class DefaultStateTime extends StateTime {

	public DefaultStateTime(Time time) {
		super(time);
	}

	@Override
	public void modifyCurrentTime(TimeEntity entity, long time) {
		
		entity.setCurrentTime(time);
	}

	@Override
	public void add(TimeEntity entity) {
		
		if(start > entity.getStartTime()) {
			
			start = entity.getStartTime();
		}
		
		if(end < entity.getEndTime()) {
			
			end = entity.getEndTime();
		}
	}

	@Override
	public void remove(TimeEntity entity) {
		
		if(start == entity.getStartTime()) {
			
			end = 0;
			
			for(TimeEntity e: time.getEntities()) {
				
				if(end > e.getStartTime()) {
					
					end = e.getStartTime();
				}
			}
		}
		
		if(end == entity.getEndTime()) {
			
			end = 0;
			
			for(TimeEntity e: time.getEntities()) {
				
				if(end < e.getEndTime()) {
					
					end = e.getEndTime();
				}
			}
		}
	}
}
