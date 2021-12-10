public class RemoteControlTest {

    public static void main(String[]args)
    {
        Light lightKitchen = new Light("Kitchen");
        Light lightLiving = new Light("Living");
        CeilingFan fan = new CeilingFan();

        LightOnCommand lightKitchenOn = new LightOnCommand(lightKitchen);
        LightOffCommand lightKitchenOff = new LightOffCommand(lightKitchen);
        LightOnCommand lightLivingOn = new LightOnCommand(lightLiving);
        LightOffCommand lightLivingOff = new LightOffCommand(lightLiving);
        CeilingFanOnCommand fanOn = new CeilingFanOnCommand(fan);
        CeilingFanOffCommand fanOff = new CeilingFanOffCommand(fan);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, lightKitchenOn, lightKitchenOff);
        remote.setCommand(1, lightLivingOn, lightLivingOff);
        remote.setCommand(2, fanOn, fanOff);
        for(int i = 0 ; i < 3; i++ )
        {
            remote.onButtonWasPressed(i);
            remote.offButtonWasPressed(i);
        }

    }
}
