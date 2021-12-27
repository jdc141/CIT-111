


public class TV {
   
  int channel = 1; // Default channel is 1
  int volumeLevel = 1; // Default volume level is 1
  boolean on = false; // By default TV is off
  
  
  // Default constructor (Everythign will be set to null if this is called)
  public TV() {
  }
  
  // Sets boolean value to true (TV turns on)
  public void turnOn() {
    on = true;
  }
  
  // Sets boolean value to false (TV turns off)
  public void turnOff() {
    on = false;
  }
  
  // IF the channel selected is between 1 and 120 then set new channel
  public void setChannel(int newChannel) {
    if (on && newChannel >= 1 && newChannel <= 120)
      channel = newChannel;
  }
  
  // IF the volume selected is between 1 and 7 then set the new volume
  public void setVolume(int newVolumeLevel) {
    if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
      volumeLevel = newVolumeLevel;
  }
  
  // Makes ure the TV is on and on a channel above the min (1) 
  // Then increment the channel (go up one)
  public void channelUp() {
    if (on && channel < 120)
      channel++;
  }
  
  // Makes ure the TV is on and on a channel below the max (120)
  // Then decrement the channel (go down one)
  public void channelDown() {
    if (on && channel > 1)
      channel--;
  }
  
  // Same as channel but for volume
  public void volumeUp() {
    if (on && volumeLevel < 7)
      volumeLevel++;
  }
  
  public void volumeDown() {
    if (on && volumeLevel > 1)
      volumeLevel--;
  }
}
