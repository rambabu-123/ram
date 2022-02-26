package ram;

public class Tv {
	int Channel=1;
	int Volume=1;
	boolean on=false;
	public Tv() {
		
	}
	public void turnOn() {
		on=true;
	}
	public void turnOff() {
		on=false;
	}
	public void setChannel(int newChannel) {
		if(on&&newChannel>=1&&newChannel<=120)
			Channel=newChannel;
	}
	public void setVolume(int newVolume) {
		if(on&&newVolume>=1&&newVolume<=7)
			Volume=newVolume;
		
	}
	public void ChannelUp() {
		if(on&&Channel<120)
			Channel++;
	}
	public void ChannelDown() {
		if(on&&Channel>1)
			Channel--;
	}
public void VolumeUp() {
	if(on&& Volume<7)
		Volume++;
		
}
public void VolumeDown() {
	if(on&& Volume>1)
		Volume--;	
}
}
