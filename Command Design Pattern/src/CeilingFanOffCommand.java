public class CeilingFanOffCommand implements Command {
    CeilingFan fan;
    CeilingFanOffCommand( CeilingFan fan)
    {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.off();
    }
}
