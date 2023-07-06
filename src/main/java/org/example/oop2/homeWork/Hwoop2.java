package org.example.oop2.homeWork;

public class Hwoop2 {
    public static void main(String[] args) {

        /**
         * @apiNote
         * 1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса.
         * Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
         * 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
         * должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
         * печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
         * (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
         * 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
         * этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
         * списку он препятствий не идет.
         */
        Human human = new Human("John", 100, 2);
        Cat cat = new Cat("Tom", 50, 1);
        Robot robot = new Robot("Robo", 200, 3);

        Track track = new Track(100);
        Wall wall = new Wall(2);

        Obstacle[] obstacles = {track, wall};
        Participant[] participants = {human, cat, robot};

        for (Participant participant : participants) {
            boolean success = true;
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    success = participant.run(((Track) obstacle).getLength());
                } else if (obstacle instanceof Wall) {
                    success = participant.jump(((Wall) obstacle).getHeight());
                }
                if (!success) {
                    break;
                }
            }
        }
    }
}
