import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        System.out.println("input:");
        try {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            System.out.println(calc(input));
        } catch (IndexOutOfBoundsException e) {
            System.err.println("throws Exception //т.к. строка не является математической операцией");;
        }
    }
    public static String calc(String input) {

        var list = new ArrayList();
        Collections.addAll(list, input.split(" "));
        String getListNumber1 = null;
        String getListNumber0;
        String getListNumber2;
        String znak =String.valueOf(list.get(1));
        int a = Integer.parseInt(String.valueOf(list.get(0)));
        int b = Integer.parseInt(String.valueOf(list.get(2)));
        String returned = "";
        if(list.size() > 3 && list.size() < 5) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("throws Exception");
                return returned;
            }
        }else if(list.size()< 3) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("throws Exception //т.к. строка не является математической операцией");
                return returned;
            }
        }else if( a < 1 || a > 10 ) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("не соответсвует условиям");
                return returned;
            }
        }else if( b < 1 || b > 10 ) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("не соответсвует условиям");
                return returned;
            }


        }else if(list.size() == 5 || list.size()>5) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.err.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                return returned;
            }
        }

        double anc=0;
        switch(znak) {
            case "+":
                anc = a + b;
                break;
            case "-":
                anc= a-b;
                break;
            case"/":
                anc=a/b;
                break;
            case"*":
                anc=a*b;

        }
        System.out.println("output:");
        System.out.println((int)anc);

        return returned;
    }



}


