public class Calculator {
        public int num1;
        public int num2;
        public void getAddingOfNums(int number1,int number2){
             num1 = number1;
             num2 = number2;
             double addingOfNums = num1 + num2;
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(addingOfNums);
        }

        public void getSubstractingOfNumbers(int number1,int number2){
             num1 = number1;
             num2 = number2;
            double substractingOfNums = num1 - num2;
            System.out.println(substractingOfNums);

        }

        public void getMultiplyOfNumbers(int number1,int number2){
             num1 = number1;
             num2 = number2;
            double multiplyOfNums = num1 * num2;
            System.out.println(multiplyOfNums);
        }
        public void getDivideOfNumbers(int number1,int number2){
             num1 = number1;
             num2 = number2;
            double devideOfNums = num1/num2;
            System.out.println(devideOfNums);
        }

    }


