package dnr2i.models.state;

import dnr2i.models.*;
import dnr2i.models.entity.*;

public final class SynchronizedStateTime extends StateTime {

	public SynchronizedStateTime(Time time) {
		super(time);
	}

	@Override
	public void modifyCurrentTime(TimeEntity entity, long time) {
		
		entity.setCurrentTime(entity.getStartTime() + time);
	}

	@Override
	public void add(TimeEntity entity) {
		
		start = 0;
		
		if(end < entity.duration()) {
			
			end = entity.duration();
		}
	}

	@Override
	public void remove(TimeEntity entity) {
		
		if(end == entity.duration()) {
			
			end = 0;
			
			for(TimeEntity e: time.getEntities()) {
				
				if(end < e.duration()) {
					
					end = e.duration();
				}
			}
		}
	}
}
