import java.util.Scanner;
public class ReadTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int number = scanner.nextInt();
        String[] readNumber = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (number >= 0 && number < 10) {
            switch (number) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    for (int i = 0; i < readNumber.length; i++) {
                        if (number == i) {
                            System.out.println(readNumber[i]);
                            break;
                        }
                    }
                    break;
            }
        } else
            if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println("Ten");
                    break;
                case 11:
                    System.out.println("Eleven");
                    break;
                case 12:
                    System.out.println("Twelve");
                    break;
                case 13:
                    System.out.println("Thirteen");
                    break;
                case 14:
                    System.out.println(readNumber[4] + "teen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    for (int i = 0; i < readNumber.length; i++) {
                        if (number % 10 == i) {
                            String ones = readNumber[i];
                            System.out.println(ones + "teen");
                            break;
                        }
                    }
                    break;
            }
        }else
            if (number>=20&&number<100) {
                String tens = null, ones=null;
                for (int i = 1; i < readNumber.length; i++) {
                    if (number / 10 == i) {
                        tens = readNumber[i];
                        break;
                    }
                }
                for (int i = 1; i < readNumber.length; i++) {
                    if (number % 10 == i) {
                        ones = readNumber[i];
                        break;
                    }
                }
                System.out.println(tens + "ty " + ones);
            }else
                if (number<1000&&number>=100){
                    String hundreds=null, tens = null, ones=null;
                    for (int i = 1; i < readNumber.length; i++) {
                        if (number / 100 == i) {
                            hundreds = readNumber[i];
                            break;
                        }
                    }
                    for (int i = 1; i < readNumber.length; i++) {
                        if ((number % 100)/10 == i) {
                            tens = readNumber[i];
                            break;
                        }
                    }
                    for (int i = 1; i < readNumber.length; i++) {
                        if (number % 10 == i) {
                            ones = readNumber[i];
                            break;
                        }
                    }
                    System.out.println(hundreds + " hundred and " + tens +"ty "+ones);
                }else {
                    System.out.println("Out of ability");
                }
    }
}
