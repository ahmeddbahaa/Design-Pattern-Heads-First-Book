public class CeilingFanOnCommand implements Command {
    CeilingFan fan;
    CeilingFanOnCommand(CeilingFan fan)
    {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.on();
    }
}
