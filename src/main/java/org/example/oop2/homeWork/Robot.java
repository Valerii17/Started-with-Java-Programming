package org.example.oop2.homeWork;

public class Robot implements Participant {
    private String name;
    private int maxRunDistance;
    private int maxJumpHeight;

    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " Успешно пробежал " + distance + " метров.");
            return true;
        } else {
            System.out.println(name + " не смог пробежать " + distance + " метров.");
            return false;
        }
    }

    public boolean jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " успешно перепрыгнул стену  высотой " + height + " метра.");
            return true;
        } else {
            System.out.println(name + " не смог перепрыгнуть стену высотой " + height + " метра.");
            return false;
        }
    }
}
