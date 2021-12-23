
class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        StringBuilder str = new StringBuilder();
        for (char i = 'A'; i <= 'Z'; i++) {
            str.append(i).append(" ");
        }
        str.deleteCharAt(str.lastIndexOf(" "));
        return str;
    }
}