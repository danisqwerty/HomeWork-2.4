package com.example.homework24;

public class Algorithm {


    public Algorithm() {
    }


    public boolean isHappyTicket(String input) {
        int inputInt = Integer.parseInt(input);
        int evenSum = 0;
        int oddSum = 0;


        while (inputInt > 0) {
            int digit = inputInt % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            inputInt /= 10;
        }


        if (evenSum == oddSum) {
            return true;
        } else {
            return false;
        }

    }

    public int nextHappyTicketV1(String input) {
        int inputInt = Integer.parseInt(input);
        if (!isHappyTicket(Integer.toString(inputInt))) {
            while (!isHappyTicket(Integer.toString(inputInt))) {
                int code = 0;
                int sumEven = 0;
                int sumOdd = 0;
                inputInt = inputInt + 1;
                char[] chars = String.valueOf(inputInt).toCharArray();

                for (char c : chars) {
                    if (Character.isDigit(c)) {
                        int digit = Integer.parseInt(String.valueOf(c));
                        if (digit % 2 == 0) {
                            sumEven += digit;
                        } else {
                            sumOdd += digit;
                        }
                    }
                }

                if (sumEven == sumOdd){
                    break;
                }


                code++;
            }

        }

        return inputInt;}}
