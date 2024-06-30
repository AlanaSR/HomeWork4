public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");

        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать.");
        }

        System.out.println("Задача 2");
         int airTemperature = 15;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, сегодня холодно, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, cегодня тепло, можно идти без шапки");
        }

        System.out.println("Задача 3");
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        System.out.println("Задача 4");
        int agePerson = 15;
        if (agePerson >= 2 && agePerson <= 6) {
            System.out.println("Если возраст человека равен" + agePerson + ", то ему нужно ходить в детский сад.");
        } else if (agePerson >= 7 && agePerson <= 17) {
            System.out.println("Если возраст человека равен" + agePerson + ", то ему нужно ходить в школу.");
        } else if (agePerson >= 18 && agePerson <= 24) {
            System.out.println("Если возраст человека равен" + agePerson + ", то его место в университете.");
        } else if (agePerson > 24) {
            System.out.println("Если возраст человека равен" + agePerson + ", то ему пора ходить на работу.");
        }

        System.out.println("Задача 5");
        int ageChild = 12;
        if (ageChild < 5) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он не может кататться на аттракционе.");
        } else if (ageChild < 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else if (ageChild >= 14) {
            System.out.println("Если возраст ребенка равен " + ageChild + ", то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задача 6");
        int totalPlace = 102;
        int seatsPlaces = 60;
        int standingPlaces = totalPlace - seatsPlaces;
        int passenger = 75;
        if (passenger <= seatsPlaces) {
            System.out.println("Если в вагон зашло " + passenger + " человек, то осталолсь " + (seatsPlaces-passenger) + " сидячих мест и " + standingPlaces + " стоячих мест.");
        } else if (passenger > seatsPlaces && passenger < totalPlace) {
            System.out.println("Если в вагон зашло " + passenger + " человек, то осталолсь " + (totalPlace - passenger) + " стоячих мест.");
        } else if (passenger == totalPlace) {
            System.out.println("Если в вагон зашло " + passenger + " человек, то свободных мест в вагоне нет.");
        } else {
            System.out.println("Свободных мест нет.");
        }
        System.out.println("Задача 7");
        int one = 1;
        int two = 5;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Число " + one + " наибольшее.");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " наибольшее.");
        } else if (three>two && three>one) {
            System.out.println("Число " + three + " наибольшее.");
        } else if (one == two && two == three) {
            System.out.println("Числа равны.");
        }

        System.out.println("Задача 7 (2й способ с разбора дз)");
        if (one == two && two == three) {
            System.out.println("Числа равны.");
        } else {
            int max = one;
            if (two > max) {
                max = two;
            }
            if (three > max) {
                max = three;
            }
                System.out.println("Число " + max + " наибольшее.");
            }
        }

    }

