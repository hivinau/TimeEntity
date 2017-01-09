package dnr2i.models.state;

import dnr2i.models.*;
import dnr2i.models.entity.*;

public abstract class StateTime {

	protected long start = -1;
	protected long current = -1;
	protected long end = -1;
	
	private final Time time;
	
	public StateTime(Time time) {
		
		this.time = time;
	}
	
	public void add(TimeEntity entity) {
		
	}
	
	public void remove(TimeEntity entity) {
		
	}
	
	public long getStart() {
		
		return start;
	}
}
