package com.sangwoon.kim.oodp.command.ex1;

public class CommandMain {

    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOnCommand = new LightOnCommand(livingRoomLight);
        Command lightOffCommand = new LightOffCommand(livingRoomLight);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.pressButton();

        remoteControl.setCommand(lightOffCommand);
        remoteControl.pressButton();

    }

}
