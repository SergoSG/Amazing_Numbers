package numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> commandList = new ArrayList<>(Arrays.asList("BUZZ", "DUCK", "PALINDROMIC",
            "GAPFUL", "SPY", "EVEN", "ODD", "SQUARE", "SUNNY", "JUMPING", "HAPPY", "SAD"));

    public static ArrayList<String[]> exceptionList = new ArrayList<>(Arrays.asList(
            new String[]{"EVEN", "ODD"},
            new String[]{"SQUARE", "SUNNY"},
            new String[]{"DUCK", "SPY"},
            new String[]{"HAPPY", "SAD"},
            // --------
            new String[]{"-EVEN", "-ODD"},
            new String[]{"-DUCK", "-SPY"},
            new String[]{"-HAPPY", "-SAD"}));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showInfo();

        do {
            System.out.println();
            System.out.print("Enter a request: ");
            String enterString = scanner.nextLine();
            ArrayList<String> enterList = new ArrayList<>(parseEnterString(enterString));
            System.out.println();

            if ("0".equals(enterList.get(0))) {
                break;
            }

            if (checkEnter(enterList)) {
                if (enterList.size() == 1) {
                    printResult(enterList.get(0), true, checkAllProperties(new BigInteger(enterList.get(0))));
                } else if (enterList.size() == 2) {
                    for (long i = 0; i < Long.parseLong(enterList.get(1)); i++)
                        printResult(new BigInteger(enterList.get(0)).add(BigInteger.valueOf(i)).toString(),
                                false,
                                checkAllProperties(new BigInteger(enterList.get(0)).add(BigInteger.valueOf(i))));
                } else {
                    int cnt = 0;
                    for (long i = Long.parseLong(enterList.get(0));
                         cnt < Integer.parseInt(enterList.get(1));
                         i++) {
                        BigInteger tmp = new BigInteger(String.valueOf(i));
                        if (checkRequiredProperties(tmp, new ArrayList<>(enterList.subList(2, enterList.size())))) {
                            printResult(tmp.toString(),
                                    false,
                                    checkAllProperties(tmp));
                            cnt++;
                        }
                    }
                }
            }
        } while (true);
        System.out.println("Goodbye!");
    }

    public static boolean isBuzz(BigInteger num, String numStr) {
        return num.remainder(BigInteger.valueOf(7)).equals(BigInteger.ZERO) ||
               numStr.charAt(numStr.length() - 1) == '7';
    }

    public static boolean isDuck(String numStr) {
        return numStr.indexOf("0") > 0;
    }

    public static boolean isPalindromic(String numStr) {
        return new StringBuilder(numStr).reverse().toString().equals(numStr);
    }

    public static boolean isGapful(BigInteger num, String numStr) {
        return numStr.length() >= 3 &&
                num.remainder(new BigInteger(numStr.substring(0, 1).
                        concat(numStr.substring(numStr.length() - 1)))).equals(BigInteger.ZERO);
    }

    public static boolean isSpy(String numStr) {
        final int charOffset = 48;
        int numSum = 0;
        int numMulti = 1;
        for (int i = 0; i < numStr.length(); i++) {
            numSum += numStr.charAt(i) - charOffset;
            numMulti *= (numStr.charAt(i) - charOffset);
        }
        return numSum == numMulti;
    }

    public static boolean isEven(BigInteger num) {
        return num.remainder(BigInteger.TWO).equals(BigInteger.ZERO);
    }

    public static boolean isOdd(BigInteger num) {
        return !isEven(num);
    }

    public static boolean isSquare(BigInteger num) {
        BigInteger[] tmp = num.sqrtAndRemainder();
        return tmp[1].equals(BigInteger.ZERO);
    }

    public static boolean isSunny(BigInteger num) {
        BigInteger[] tmp = num.add(BigInteger.ONE).sqrtAndRemainder();
        return tmp[1].equals(BigInteger.ZERO);
    }

    public static boolean isJumping(String numStr) {
        for (int i = 1; i < numStr.length(); i++) {
            if (Math.abs(numStr.charAt(i - 1) - numStr.charAt(i)) != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHappy(String numStr) {
        String numTmp = numStr;
        ArrayList<String> arrayTmp = new ArrayList<>();
        do {
            arrayTmp.add(numTmp);
            int sum = 0;
            for (int i = 0; i < numTmp.length(); i++) {
                sum += Math.pow(Integer.parseInt(numTmp.substring(i, i + 1)), 2);
            }
            numTmp = String.valueOf(sum);
        } while (!("1".equals(numTmp) || arrayTmp.contains(numTmp)));
        return "1".equals(numTmp);
    }

    public static boolean isSad(String numStr) {
        return !isHappy(numStr);
    }

    public static boolean[] checkAllProperties(BigInteger num) {
        StringBuilder numStr = new StringBuilder(num.toString());
        return new boolean[]{isBuzz(num, numStr.toString()),     //BUZZ
                             isDuck(numStr.toString()),          //DUCK
                             isPalindromic(numStr.toString()),   //PALINDROMIC
                             isGapful(num, numStr.toString()),   //GAPFUL
                             isSpy(numStr.toString()),           //SPY
                             isEven(num),                        //even
                             isOdd(num),                         //odd
                             isSquare(num),                      //SQUARE
                             isSunny(num),                       //SUNNY
                             isJumping(numStr.toString()),       //JUMPING
                             isHappy(numStr.toString()),         //HAPPY
                             isSad(numStr.toString())            //SAD
        };
    }

    public static boolean checkRequiredProperties(BigInteger num, ArrayList<String> requiredProperties) {
        StringBuilder numStr = new StringBuilder(num.toString());
        boolean result = true;
        for (String property : requiredProperties) {
            switch (property.toUpperCase(Locale.ROOT)) {
                case "BUZZ": result = result && isBuzz(num, numStr.toString()); break;
                case "DUCK": result = result && isDuck(numStr.toString()); break;
                case "PALINDROMIC": result = result && isPalindromic(numStr.toString()); break;
                case "GAPFUL": result = result && isGapful(num, numStr.toString()); break;
                case "SPY": result = result && isSpy(numStr.toString()); break;
                case "EVEN": result = result && isEven(num); break;
                case "ODD": result = result && isOdd(num); break;
                case "SQUARE": result = result && isSquare(num); break;
                case "SUNNY": result = result && isSunny(num); break;
                case "JUMPING": result = result && isJumping(numStr.toString()); break;
                case "HAPPY": result = result && isHappy(numStr.toString()); break;
                case "SAD": result = result && isSad(numStr.toString()); break;
                // ----------
                case "-BUZZ": result = result && !isBuzz(num, numStr.toString()); break;
                case "-DUCK": result = result && !isDuck(numStr.toString()); break;
                case "-PALINDROMIC": result = result && !isPalindromic(numStr.toString()); break;
                case "-GAPFUL": result = result && !isGapful(num, numStr.toString()); break;
                case "-SPY": result = result && !isSpy(numStr.toString()); break;
                case "-EVEN": result = result && !isEven(num); break;
                case "-ODD": result = result && !isOdd(num); break;
                case "-SQUARE": result = result && !isSquare(num); break;
                case "-SUNNY": result = result && !isSunny(num); break;
                case "-JUMPING": result = result && !isJumping(numStr.toString()); break;
                case "-HAPPY": result = result && !isHappy(numStr.toString()); break;
                case "-SAD": result = result && !isSad(numStr.toString()); break;
                default: result = false;
            }
        }
        return result;
    }

    public static void printResult(String num,
                                   boolean isFull,
                                   boolean[] flags) {
        if (isFull) {
            System.out.printf("Properties of %s\n", num);
            for (int i = 0; i < flags.length; i++) {
                System.out.printf("%s: %b\n", commandList.get(i).toLowerCase(Locale.ROOT), flags[i]);
            }
        } else {
            String res = num + " is";
            for (int i = 0; i < flags.length; i++) {
                if (flags[i]) {
                    res = res.concat(" " + commandList.get(i).toLowerCase(Locale.ROOT) + ",");
                }
            }
            res = res.substring(0, res.length() - 1);
            System.out.println(res);
        }
    }

    public static void showInfo() {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter two natural numbers to obtain the properties of the list:");
        System.out.println("  * the first parameter represents a starting number;");
        System.out.println("  * the second parameter shows how many consecutive numbers are to be processed;");
        System.out.println("- two natural numbers and properties to search for;");
        System.out.println("- a property preceded by minus must not be present in numbers;");
        System.out.println("- separate the parameters with one space;");
        System.out.println("- enter 0 to exit.");
    }

    public static ArrayList<String> parseEnterString(String enterString) {
        ArrayList<String> enter = new ArrayList<>(Arrays.asList(enterString.toUpperCase(Locale.ROOT).split(" ")));
        if (enter.get(0).length() > 1) {
            do {
                enter.set(0, enter.get(0).charAt(0) == '0' ? enter.get(0).substring(1) : enter.get(0));
            } while (enter.get(0).charAt(0) == '0');
        }
        return enter;
    }

    public static boolean checkEnter(ArrayList<String> enter) {
        if (enter.size() == 0) {
            return false;
        }

        if (!isDigit(enter.get(0))) {
            System.out.println("The first parameter should be a natural number or zero.");
            return false;
        }

        if (enter.size() > 1 && (!isDigit(enter.get(1)) || Integer.parseInt(enter.get(1)) < 1)) {
            System.out.println("The second parameter should be a natural number.");
            return false;
        }

        int wrongCnt = 0;
        String wrongList = "";
        if (enter.size() > 2) {
            for (int i = 2; i < enter.size(); i++) {
                if (!commandList.contains(enter.get(i).indexOf('-') == 0 ?
                                          enter.get(i).substring(1) :
                                          enter.get(i))) {
                    wrongCnt++;
                    wrongList = wrongCnt == 1 ? wrongList.concat(enter.get(i).toUpperCase(Locale.ROOT)) :
                                                wrongList.concat(", " + enter.get(i).toUpperCase(Locale.ROOT));
                }
            }
        }
        if (wrongCnt > 0) {
            System.out.printf("The %s [%s] %s wrong.\n",
                    wrongCnt > 1 ? "properties" : "property",
                    wrongList,
                    wrongCnt > 1 ? "are" : "is");
            System.out.println("Available properties: " + commandList.toString().toUpperCase(Locale.ROOT));
            return false;
        }

        if (enter.size() > 3) {
            for (int i = 2; i < enter.size(); i++) {
                if (enter.contains("-".concat(enter.get(i)))) {
                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n",
                            enter.get(i).toUpperCase(Locale.ROOT),
                            "-".concat(enter.get(i)).toUpperCase(Locale.ROOT));
                    System.out.println("There are no numbers with these properties.");
                    return false;
                }
            }

            for (int i = 0; i < exceptionList.size(); i++) {
                if (enter.contains(exceptionList.get(i)[0]) && enter.contains(exceptionList.get(i)[1])) {
                    System.out.printf("The request contains mutually exclusive properties: [%s, %s]\n",
                            exceptionList.get(i)[0].toUpperCase(Locale.ROOT),
                            exceptionList.get(i)[1].toUpperCase(Locale.ROOT));
                    System.out.println("There are no numbers with these properties.");
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isDigit(String enter) {
        for (int i = 0; i < enter.length(); i++) {
            if (!Character.isDigit(enter.charAt(i)) && enter.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }
}