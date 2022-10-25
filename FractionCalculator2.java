import java.util.ArrayList;
import java.util.Scanner;

public class FractionCalculator2 {
    static ArrayList parsedMain = readEquation();
    static Float argOneQuotient = Float.parseFloat((String) parsedMain.get(0));
    static Float argOneNum =  Float.parseFloat((String) parsedMain.get(1));
    static Float argOneDenom = Float.parseFloat((String) parsedMain.get(2));
    static String operator = (String) parsedMain.get(3);
    static Float argTwoQuotient = Float.parseFloat((String) parsedMain.get(4));
    static Float argTwoNum = Float.parseFloat((String) parsedMain.get(5));
    static Float argTwoDenom = Float.parseFloat((String) parsedMain.get(6));
    public static void main(String[] args) {
        //make an entirely different math system for negative quotients
        //simplify THEN turn it into a mixed number
        //make sure to convert improper fractions into a mixed number
        //MAKE THE IMPROPER FRACTION CONVERTER IN THE MAIN METHOD
        //ALSO SIMPLIFICATION METHOD
        //if numerator > denominator mixed number method
        //mod goes in numerator, regular division goes in quotient
            if (!Float.isNaN(argOneNum) || !Float.isNaN(argOneDenom) || !Float.isNaN(argTwoNum) || !Float.isNaN(argTwoDenom) || !Float.isNaN(argOneQuotient) || !Float.isNaN(argTwoQuotient)) {
                if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                    if (operator.equals("+")) {
                        String[] parsedAddition = addition().split("/"); //0: numerator, 1: denominator
                        Double additionNum = Double.valueOf(parsedAddition[0]);
                        Double additionDenom = Double.valueOf(parsedAddition[1]);
                        Double additionNumFinal = additionNum % additionDenom;
                        Integer additionQuotientFinal = Integer.parseInt(String.valueOf(Math.round(additionNum / additionDenom)));
                        Integer gcf = 1;
                        int i = 1;
                        Integer j = 1;
                        if (additionNumFinal < additionDenom) {
                            Double jint = additionNumFinal;
                        } else {
                            Double jint = additionDenom;
                        }
                        for (i = 1; i <= j; i++) {
                            if (additionNumFinal % i == 0 && additionDenom % i == 0) {
                                gcf = i;
                            }
                        }
                        Integer additionNumFinal2 = Math.toIntExact(Math.round(additionNumFinal / gcf));
                        Integer additionDenom2 = Math.toIntExact(Math.round(additionDenom / gcf));
                        if (additionQuotientFinal > 0 || additionQuotientFinal < 0) {
                            System.out.println(additionQuotientFinal + " " + additionNumFinal2 + "/" + additionDenom2);
                        } else {
                            System.out.println(additionNumFinal2 + "/" + additionDenom2);
                        }
                    } else if (operator.equals("-")) {
                        String[] parsedAddition = subtraction().split("/"); //0: numerator, 1: denominator
                        Double additionNum = Double.valueOf(parsedAddition[0]);
                        Double additionDenom = Double.valueOf(parsedAddition[1]);
                        Double additionNumFinal = additionNum % additionDenom;
                        Integer additionQuotientFinal = Integer.parseInt(String.valueOf(Math.round(additionNum / additionDenom)));
                        Integer gcf = 1;
                        int i = 1;
                        Integer j = 1;
                        if (additionNumFinal < additionDenom) {
                            Double jint = additionNumFinal;
                        } else {
                            Double jint = additionDenom;
                        }
                        for (i = 1; i <= j; i++) {
                            if (additionNumFinal % i == 0 && additionDenom % i == 0) {
                                gcf = i;
                            }
                        }
                        Integer additionNumFinal2 = Math.toIntExact(Math.round(additionNumFinal / gcf));
                        Integer additionDenom2 = Math.toIntExact(Math.round(additionDenom / gcf));
                        if (additionDenom2 == 0 || additionNumFinal2 == 0) {
                            System.out.println("0");
                        }
                        if (additionQuotientFinal > 0 || additionQuotientFinal < 0) {
                            System.out.println(additionQuotientFinal + " " + additionNumFinal2 + "/" + additionDenom2 + "if");
                        }
                    } else if (operator.equals("*")) {
                        String[] parsedAddition = multiplication().split("/"); //0: numerator, 1: denominator
                        Double additionNum = Double.valueOf(parsedAddition[0]);
                        Double additionDenom = Double.valueOf(parsedAddition[1]);
                        Double additionNumFinal = additionNum % additionDenom;
                        Integer additionQuotientFinal = Integer.parseInt(String.valueOf(Math.round(additionNum / additionDenom)));
                        Integer gcf = 1;
                        int i = 1;
                        Integer j = 1;
                        if (additionNumFinal < additionDenom) {
                            Double jint = additionNumFinal;
                        } else {
                            Double jint = additionDenom;
                        }
                        for (i = 1; i <= j; i++) {
                            if (additionNumFinal % i == 0 && additionDenom % i == 0) {
                                gcf = i;
                            }
                        }
                        Integer additionNumFinal2 = Math.toIntExact(Math.round(additionNumFinal / gcf));
                        Integer additionDenom2 = Math.toIntExact(Math.round(additionDenom / gcf));
                        if (additionDenom2 == 0 || additionNumFinal2 == 0) {
                            System.out.println("0");
                        }
                        if (additionQuotientFinal > 0 || additionQuotientFinal < 0) {
                            System.out.println(additionQuotientFinal + " " + additionNumFinal2 + "/" + additionDenom2);
                        }
                    } else if (operator.equals("/")) {
                        String[] parsedDivision = division().split("/"); //0: numerator, 1: denominator
                        Integer divisionNum = Integer.parseInt(parsedDivision[0]);
                        Integer divisionDenom = Integer.parseInt(parsedDivision[1]);
                        Integer divisionNumFinal = divisionNum % divisionDenom;
                        Integer divisionQuotientFinal = Integer.parseInt(String.valueOf(Math.round(divisionNum / divisionDenom)));
                        if (divisionQuotientFinal > 0 || divisionQuotientFinal < 0) {
                            System.out.println(divisionQuotientFinal + " " + divisionNumFinal + "/" + divisionDenom);
                        } else {
                            System.out.println(divisionNumFinal + "/" + divisionDenom);
                        }
                        Integer gcf = 1;
                        int i = 1;
                        Integer j = 1;
                        if (divisionNumFinal < divisionDenom) {
                            j = divisionNumFinal;
                        } else {
                            j = divisionDenom;
                        }
                        for (i = 1; i <= j; i++) {
                            if (divisionNumFinal % i == 0 && divisionDenom % i == 0) {
                                gcf = i;
                            }
                        }
                        divisionNum = divisionNumFinal / gcf;
                        divisionDenom = divisionDenom / gcf;
                        if (divisionQuotientFinal > 0 || divisionQuotientFinal < 0) {
                            System.out.println(divisionQuotientFinal + " " + divisionNum + "/" + divisionDenom);
                        } else {
                            System.out.println(divisionNum + "/" + divisionDenom);
                        }
                    }
                } else {
                    System.out.println("Error: invalid operator");
                }
            } else {
                System.out.println("Error: invalid number(s)");
            }
        }
    public static ArrayList readEquation() {
        //maybe use if statements in all methods to check if the inputs are mixed numbers (if argOneQuotient == 0, etc.). (if equation3[0] || equation4[0] == 0, etc)
        System.out.println("Input two mixed fractions with an underscore separating the quotient and fraction (Example: 3_1/2 * 3_1/2)");
        Scanner operatorReader = new Scanner(System.in);
        String equation = operatorReader.nextLine();
        String[] equation2 = equation.split(" "); // 0: mixed number 1 1: operator 2: mixed number 2
        String[] equation3 = equation2[0].split("_"); // 0:quotient of mixed number 1: fractional part
        String[] equation4 = equation2[2].split("_"); // 0:quotient of mixed number 1: fractional part
        String[] equation5 = equation3[1].split("/"); //0: numerator 1: denominator
        String[] equation6 = equation4[1].split("/"); //0: numerator 1: denominator
        ArrayList equation7 = new ArrayList();
        //0:quotient of mixed number 1, 1:numerator of fraction 1, 2:denominator of fraction 1, 3:operator, 4:quotient of mixed number 2, 5:numerator of fraction 2, 6:denominator of fraction 2
        equation7.add(equation3[0]);
        equation7.add(equation5[0]);
        equation7.add(equation5[1]);
        equation7.add(equation2[1]);
        equation7.add(equation4[0]);
        equation7.add(equation6[0]);
        equation7.add(equation6[1]);
        return equation7;
    }
    public static String addition() {
        Float argOneMultNum = argOneNum * argTwoDenom;
        Float argOneMultDenom = argOneDenom * argTwoDenom;
        Float argTwoMultNum = argTwoNum * argOneDenom;
        String improperNumAddendStringed = String.valueOf((int) (argOneMultNum + argTwoMultNum));
        String improperDenomAddendStringed = String.valueOf((int) (argOneMultDenom + 0));
        return (improperNumAddendStringed + "/" + improperDenomAddendStringed);
    }
    public static String subtraction() {
        Float argOneMultNum = argOneNum * argTwoDenom;
        Float argOneMultDenom = argOneDenom * argTwoDenom;
        Float argTwoMultNum = argTwoNum * argOneDenom;
        //these are the correct fractions
        String numDiffStringed = String.valueOf((int) (argOneMultNum - argTwoMultNum));
        String denomStringed = String.valueOf((int) (argOneMultDenom + 0));
            return (numDiffStringed + "/" + denomStringed);
    }
    public static String multiplication() {
        //convert to improper fraction then multiply those then convert to mixed number
        Float multNum = null;
        Float multDenom = null;
        Float improperArgOneNum = null;
        Float improperArgTwoNum = null;
        Float multArgOneNum = null;
        Float multArgOneDenom = null;
        Float multArgTwoNum = null;
        Float multArgTwoDenom = null;
        if (argOneQuotient > 0 || argTwoQuotient > 0 || argOneQuotient < 0 || argTwoQuotient < 0) {
            multArgOneNum = argOneNum * argTwoDenom;
            multArgOneDenom = argOneDenom * argTwoDenom;
            multArgTwoNum = argTwoNum * argOneDenom;
            multArgTwoDenom = argTwoDenom * argOneDenom;
            improperArgOneNum = multArgOneNum + multArgOneDenom * argOneQuotient;
            improperArgTwoNum = multArgTwoNum + multArgTwoDenom * argTwoQuotient;
            multNum = improperArgOneNum * improperArgTwoNum;
            multDenom = multArgOneDenom * multArgTwoDenom;
        } else {
            multNum = argOneNum * argTwoNum;
            multDenom = argOneDenom * argTwoDenom;
        }
        String multNumStringed = String.valueOf((int) (multNum + 0));
        String multDenomStringed = String.valueOf((int) (multDenom + 0));
        return (multNumStringed + "/" + multDenomStringed);
    }
    public static String division() {
        Float improperMultArgOneDenom = null;
        Float divNum = null;
        Float divDenom = null;
        Float improperMultArgOneNum = null;
        Float improperMultArgTwoNum = null;
        Float recipImproperMultArgOneNum = null;
        Float recipImproperMultArgOneDenom = null;
        Float multArgOneNum = null;
        Float multArgOneDenom = null;
        Float multArgTwoNum = null;
        Float multArgTwoDenom = null;
        //improperMultArgOneDenom = multArgOneDenom
        //improperMultArgTwoDenom = multArgTwoDenom
        if (argOneQuotient > 0 || argTwoQuotient > 0 || argOneQuotient < 0 || argTwoQuotient < 0) {
            multArgOneNum = argOneNum * argTwoDenom;
            multArgOneDenom = argOneDenom * argTwoDenom;
            multArgTwoNum = argTwoNum * argOneDenom;
            multArgTwoDenom = argTwoDenom * argOneDenom;
            improperMultArgOneNum = multArgOneDenom * argOneQuotient + multArgOneNum;
            improperMultArgOneDenom = multArgOneDenom;
            improperMultArgTwoNum = multArgTwoDenom * argTwoQuotient + multArgTwoNum;
            recipImproperMultArgOneNum = improperMultArgOneDenom;
            recipImproperMultArgOneDenom = improperMultArgOneNum;
            //yes i know these two variables are switched i just REALLY didn't want to find the problem in the variable mess i created
            divDenom =  recipImproperMultArgOneNum * improperMultArgTwoNum;
            divNum = recipImproperMultArgOneDenom * multArgTwoDenom;
        } else {
            divNum = argOneDenom * argTwoNum;
            divDenom = argOneNum * argTwoDenom;
        }
        String multNumStringed = String.valueOf((int) (divNum + 0));
        String multDenomStringed = String.valueOf((int) (divDenom + 0));
        return (multNumStringed + "/" + multDenomStringed);
    }
}