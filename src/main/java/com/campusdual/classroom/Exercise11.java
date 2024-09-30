package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");
        redRemote.turnOn();
        System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
        redRemote.channelUp();
        redRemote.channelDown();
        redRemote.volumeUp();
        redRemote.volumeDown();
    }

}