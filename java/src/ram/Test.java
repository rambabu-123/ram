package ram;
public class Test {
	public static void main(String[] args)
	{
		Tv tv1=new Tv();
		tv1.turnOn();
		tv1.setChannel(5);
		tv1.setVolume(4);
		Tv tv2=new Tv();
		tv2.turnOn();
		tv2.ChannelUp();
		tv2.ChannelUp();
		tv2.VolumeUp();
		System.out.println("tv1's channel is"+tv1.Channel+"and volume level is "+tv1.Volume);
		System.out.println("tv2's channel is"+tv2.Channel+"and volume level is"+tv2.Volume);
	}

}
