package head.first.remote.control;

public class Light {
    String place;
    public Light(String place){
        this.place = place;
    }
    public void on(){
        System.out.println(place+ "'s light is ON");
    }
    public void off(){
        System.out.println(place+"'s light is OFF");
    }
}
