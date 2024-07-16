class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();
        boolean nextUpper = false;
        for(Character identChar : identifier.toCharArray()) {
            if(identChar == '-') nextUpper = true;
            else {
                if(identChar == '0') identChar = 'o';
                else if(identChar == '1') identChar = 'l';
                else if(identChar == '3') identChar = 'e';
                else if(identChar == '4') identChar = 'a';
                else if(identChar == '7') identChar = 't';
                else if(identChar == ' ') identChar = '_';

                if(Character.isLetter(identChar) || identChar == '_') {
                    result.append(nextUpper ? Character.toUpperCase(identChar) : identChar);
                }
                nextUpper = false;
            }
        }
        return result.toString();
    }
}