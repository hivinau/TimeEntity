package dnr2i.models.state;

import dnr2i.models.*;
import dnr2i.models.entity.*;

public abstract class StateTime {

	protected long start = -1;
	protected long current = -1;
	protected long end = -1;
	protected final Time time;
	
	public StateTime(Time time) {
		
		this.time = time;
	}
	
	public void setCurrentTime(long t) {
		
		current = t;
		
		for(TimeEntity entity: time.getEntities()) {
			
			modifyCurrentTime(entity, current);
		}
	}
	
	public abstract void modifyCurrentTime(TimeEntity entity, long time);
	public abstract void add(TimeEntity entity);
	public abstract void remove(TimeEntity entity);
	
	public long getStart() {
		
		return start;
	}
	
	public long getEnd() {
		
		return end;
	}
}
