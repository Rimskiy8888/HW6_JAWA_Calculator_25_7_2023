import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random randomizer = new Random();
        int number1 = randomizer.nextInt(0,900) + 1;
        int number2 = randomizer.nextInt(0,100) + 1;
        Calculator calculator = new Calculator();
        calculator.getAddingOfNums(number1, number2);
        calculator.getSubstractingOfNumbers(number1,number2);
        calculator.getMultiplyOfNumbers(number1,number2);
        calculator.getDivideOfNumbers(number1,number2);


    }
}
