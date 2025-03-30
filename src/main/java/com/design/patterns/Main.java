package head.first;

import head.first.remote.control.GarageDoorCloseCommand;
import head.first.remote.control.GarageDoorOpenCommand;
import head.first.remote.control.GarageDoor;
import head.first.remote.control.Light;
import head.first.remote.control.LightOffCommand;
import head.first.remote.control.LightOnCommand;
import head.first.remote.control.SimpleRemoteControl;
import head.first.remote.control.Stereo;
import head.first.remote.control.StereoOffCommand;
import head.first.remote.control.StereoOnCommand;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LightOnCommand kitchenLightOn = new LightOnCommand(new Light("kitchen"));
        LightOffCommand kitchenLightOff = new LightOffCommand(new Light("kitchen"));
        GarageDoorOpenCommand doorOpenCommand = new GarageDoorOpenCommand(new GarageDoor());
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(new GarageDoor());
        LightOffCommand garageLightOffCommand = new LightOffCommand(new Light("garage"));
        LightOnCommand garageLightOnCommand = new LightOnCommand(new Light("garage"));
        StereoOffCommand stereoOffCommand = new StereoOffCommand(new Stereo());
        StereoOnCommand stereoOnCommand = new StereoOnCommand(new Stereo());



        SimpleRemoteControl remote = new SimpleRemoteControl();
        remote.setCommand(0, kitchenLightOn, kitchenLightOff);
        remote.setCommand(1,  doorOpenCommand, doorCloseCommand);
        remote.setCommand(2,  garageLightOnCommand, garageLightOffCommand);
        remote.setCommand(3,  stereoOnCommand, stereoOffCommand);
//        lambda fucntion can remove concrete class instantialtion
//        remote.setCommand(3,() -> new Stereo().on(), () -> new Stereo().off());

        while (true) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            System.out.println("select on / off");
            int c = scan.nextInt();
            if(c==0){
                remote.offButtonPushed(n-1);
            } else if(c==1) {
                remote.onButtonPushed(n-1);
            } else {
                remote.undo();
            }
        }

    }
}


