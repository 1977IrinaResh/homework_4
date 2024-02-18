// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then
// press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Введите возраст: ");
        int personAge=console.nextInt();
        if (personAge>=18){
            System.out.println("Если возраст больше или равен 18 годам, то человек достиг совершеннолетия");
        } else {
            System.out.println("Если возраст меньше 18 лет, то человек не достиг совершеннолетия");
        }

        System.out.println("Введите температуру воздуха на улице");
        int airTemperature=console.nextInt();
        if(airTemperature<=5){
            System.out.println("На улице холодно. Нужно одеть шапку");
        }
        else {
            System.out.println("На улице тепло. Можно идти без шапки");
        }

        System.out.println("Введите скорость автомобиля ");
        float speed=console.nextFloat();
        if (speed<60){
            System.out.println("Если скорость "+speed+", то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + ", то скорость превышена. Придется выплатить штраф");
        }

        System.out.println("Снова введите возраст: ");
        personAge=console.nextInt();
        if (personAge>=2 && personAge<=6){
            System.out.println("Если возраст человека равен "+personAge+" то ему нужно ходить в детский сад");
        } else if (personAge<=17 && personAge>=7){
            System.out.println("Если возраст человека равен "+personAge+" то ему нужно ходить в школу");
        } else if (personAge<=24 && personAge>=18){
            System.out.println("Если возраст человека равен "+personAge+" то ему нужно ходить в университет");
        } else if (personAge>24){
            System.out.println("Если возраст человека равен "+personAge+" то ему нужно ходить на работу");
        }
        System.out.println("Снова введите возраст: ");
        personAge=console.nextInt();
        if (personAge<5){
            System.out.println("Если возраст ребенка равен "+personAge+" то ему нельзя кататься на аттракционе");
        } else if (personAge>=5 && personAge<14){
            System.out.println("Если возраст ребенка равен "+personAge+" то он может кататься в сопровождении взрослого");
        } else if (personAge>=14){
            System.out.println("Если возраст человека равен "+personAge+" то он может кататься один");
        }

        int wagonCapacity=102;
        int wagonSits=60;
        System.out.println("Введите количество человек, вошедших в вагон");
        int personCount=console.nextInt();
        if(personCount>wagonCapacity){
            System.out.println("Вагон полностью заполнен");
        } else if (personCount<60) {
            System.out.println("Осталось "+(wagonSits-personCount)+" сидячих мест и "+(wagonCapacity-wagonSits)+" стоячих мест");
        } else if (personCount>60 && personCount<=wagonCapacity){
            System.out.println("Сидячих мест не осталось, осталось только "+(wagonCapacity-wagonSits)+" стоячих мест");

        }
        System.out.println("Введите первое число");
        int firstNumber=console.nextInt();
        System.out.println("Введите второе число");
        int secondNumber=console.nextInt();
        System.out.println("Введите третье число");
        int thirdNumber=console.nextInt();
        if (firstNumber>secondNumber && firstNumber>thirdNumber){
            System.out.println("Максимальное число "+firstNumber);
        } else if (secondNumber>firstNumber && secondNumber>thirdNumber) {
            System.out.println("Максимальное число "+secondNumber);
        } else if (thirdNumber>firstNumber && thirdNumber>secondNumber) {
            System.out.println("Максимальное число "+thirdNumber);

        }


    }




}

