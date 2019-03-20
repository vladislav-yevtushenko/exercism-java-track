class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        char[] buf = Integer.toString(numberToCheck).toCharArray();

        double expectedInt = 0;

        for (char ch : buf) {
            expectedInt = expectedInt + Math.pow(Double.parseDouble(Character.toString(ch)), buf.length);
        }

        return expectedInt == numberToCheck;
    }


}
