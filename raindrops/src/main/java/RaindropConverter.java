class RaindropConverter {

    String convert(int number) {

        String str = "";

        if (number % 3 == 0) {
            str = str.concat("Pling");
        } else {
            str = String.valueOf(number);
        }
        if (number % 5 == 0) {
            str = str.concat("Plang");
        }
        if (number % 7 == 0) {
            str = str.concat("Plong");
        }
        return str;
    }
}
