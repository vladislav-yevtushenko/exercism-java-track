class ReverseString {

    String reverse(String inputString) {
        StringBuilder result = new StringBuilder();
        for (char chr : inputString.toCharArray()) {
            result.insert(0, chr);
        }
        return result.toString();
    }
}