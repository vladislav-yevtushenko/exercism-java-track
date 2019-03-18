class IsogramChecker {

    boolean isIsogram(String phrase) {
        char[] chars = phrase.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character ch = Character.toLowerCase(phrase.charAt(i));
            if (!Character.isSpaceChar(ch) && !ch.equals('-')) {
                for (int j = i + 1; j < chars.length; j++) {
                    Character ch2 = Character.toLowerCase(phrase.charAt(j));
                    if (ch.equals(ch2)) return false;
                }
            }
        }
        return true;
    }
}


