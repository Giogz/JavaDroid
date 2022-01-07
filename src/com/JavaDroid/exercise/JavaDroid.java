package com.JavaDroid.exercise;

public class JavaDroid {

    int batteryLevel;
    String name;

    public JavaDroid(String droidName) {
        batteryLevel = 100;
        name = droidName;
    }
    public String toString(){
        return "Hello, Me name is: " +name;

    }

    public void performTask(String task){
        System.out.println(name + " is performing a task: " + task);
        batteryLevel = batteryLevel - 10;
        System.out.println("His battery drop to " + batteryLevel + " from 100");
    }



    public static void main(String[] args){
        JavaDroid Codey = new JavaDroid("Codey");

        System.out.println(Codey);
        Codey.performTask("Jumping");
        System.out.println(Codey.name + " will Rest for 10 min");
        Codey.performTask("Cleaning the house");
        System.out.println(Codey.name + " will Rest for 10 min");
        Codey.performTask("Washing Laundry");
        System.out.println(Codey.name + " will Rest for 10 min");
    }
}
