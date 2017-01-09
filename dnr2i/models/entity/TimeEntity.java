/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dnr2i.models.entity;

/**
 *
 * @author user
 */
public abstract class TimeEntity {

  public TimeEntity(){}

  /**Méthodes Abstrai sin implementación*/
    public long setCurrentTime(long currentTime)
    {
      this.currentTime = currentTime;
    }
    public long getStartTime()
    {
      return this.startTIme
    }
    public long getEndTime()
    {
    return this.endTime
    }
    public void createEvent(){}


}
