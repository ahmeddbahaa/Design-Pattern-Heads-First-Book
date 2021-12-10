public class Light {
String place;
    Light(){}
    public Light(String name)
    {
        this.place = name;

    }
    public void on()
    {
        System.out.println("The "+place+" light is on");
    }
    public void off()
    {
        System.out.println("The "+place+" light is off");
    }
}
