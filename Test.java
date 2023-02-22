import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test implements ActionListener {
    /*
    public Test() {
    }
     */
    //TODO make ce remove the last DIGIT (like this: [10, +, 66] -> [10, +, 6]
    //TODO pressing 0 adds 01 for some reason
    //TODO add a cursor?
    //TODO try catch for when you try to ce with an empty arraylist
    //TODO when = is pressed, call the pemdas calculator file? in the calc file ArrayList<String> all = Test.all;? and the string 'arg' is displayed?
    static String arg = "";
    static ArrayList<String> all = new ArrayList();
    static JButton one = configButton("1", 0, 100);
    static JButton two = configButton("2", 100, 100);
    static JButton three = configButton("3", 200, 100);
    static JButton four = configButton("4", 0, 150);
    static JButton five = configButton("5", 100, 150);
    static JButton six = configButton("6", 200, 150);
    static JButton seven = configButton("7", 0, 200);
    static JButton eight = configButton("8", 100, 200);
    static JButton nine = configButton("9", 200, 200);
    static JButton add = configButton("+", 300, 100);
    static JButton sub = configButton("-", 300, 150);
    static JButton mult = configButton("*", 300, 200);
    static JButton div = configButton("/", 300, 300);
    static JButton c = configButton("C", 0, 300);
    static JButton ce = configButton("CE", 100, 300);
    static JButton enter = configButton("Enter", 0, 0);
    static JButton parOne = configButton("(", 0, 250);
    static JButton parTwo = configButton(")", 100, 250);
    static JButton expo = configButton("^", 300, 250);
    static JButton mod = configButton("%", 200, 300);
    static JButton zero = configButton("0", 200, 250);
    public static void main(String[] args) {
        JFrame frame = setUp();
        JTextField text = new JTextField();
        enter.setText("Enter");
        enter.setBounds(0, 350, 400, 50);
        frame.setVisible(true);
        text.setBounds(0, 0, 414, 100);
        boolean loop = true;
        //TODO change font size and height of calculator
        while (loop) {
            text.setText(arg);
            frame.add(text);
        }
    }
    //theres def a better way to set up
    public static JFrame setUp() {
        JFrame frame = new JFrame();
        ImageIcon icon = new ImageIcon("C:\\Users\\tahom\\Downloads\\R.png");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(414, 437);
        frame.setName("Calculator");
        frame.setIconImage(icon.getImage());
        frame.add(zero);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(add);
        frame.add(sub);
        frame.add(mult);
        frame.add(parOne);
        frame.add(parTwo);
        frame.add(expo);
        frame.add(mod);
        frame.add(div);
        frame.add(c);
        frame.add(ce);
        frame.add(enter);
        zero.addActionListener(new Test());
        one.addActionListener(new Test());
        two.addActionListener(new Test());
        three.addActionListener(new Test());
        four.addActionListener(new Test());
        five.addActionListener(new Test());
        six.addActionListener(new Test());
        seven.addActionListener(new Test());
        eight.addActionListener(new Test());
        nine.addActionListener(new Test());
        add.addActionListener(new Test());
        sub.addActionListener(new Test());
        mult.addActionListener(new Test());
        div.addActionListener(new Test());
        parOne.addActionListener(new Test());
        parTwo.addActionListener(new Test());
        expo.addActionListener(new Test());
        mod.addActionListener(new Test());
        c.addActionListener(new Test());
        ce.addActionListener(new Test());
        enter.addActionListener(new Test());
        zero.setName("zero");
        one.setName("one");
        two.setName("two");
        three.setName("three");
        four.setName("four");
        five.setName("five");
        six.setName("six");
        seven.setName("seven");
        eight.setName("eight");
        nine.setName("nine");
        add.setName("add");
        sub.setName("sub");
        mult.setName("mult");
        div.setName("div");
        parOne.setName("parOne");
        parTwo.setName("parTwo");
        expo.setName("expo");
        mod.setName("mod");
        c.setName("c");
        ce.setName("ce");
        enter.setName("enter");
        return frame;
    }
    public static JButton configButton(String text, int x, int y) {
        JButton button = new JButton();
        button.setBounds(x, y, 100, 50);
        button.setText(text);
        return button;
    }
    public void actionPerformed(ActionEvent e) {
        JButton o = (JButton) e.getSource();
        String name = o.getName();
        switch (name) {
            case "zero":
                all.add("0");
                all = allFormatter(all);
                arg = arg + "0";
            case "one":
                all.add("1");
                all = allFormatter(all);
                arg = arg + "1";
                break;
            case "two":
                all.add("2");
                all = allFormatter(all);
                arg = arg + "2";
                break;
            case "three":
                all.add("3");
                all = allFormatter(all);
                arg = arg + "3";
                break;
            case "four":
                all.add("4");
                all = allFormatter(all);
                arg = arg + "4";
                break;
            case "five":
                all.add("5");
                all = allFormatter(all);
                arg = arg + "5";
                break;
            case "six":
                all.add("6");
                all = allFormatter(all);
                arg = arg + "6";
                break;
            case "seven":
                all.add("7");
                all = allFormatter(all);
                arg = arg + "7";
                break;
            case "eight":
                all.add("8");
                all = allFormatter(all);
                arg = arg + "8";
                break;
            case "nine":
                all.add("9");
                all = allFormatter(all);
                arg = arg + "9";
                break;
            case "add":
                all.add("+");
                arg = arg + "+";
                break;
            case "sub":
                all.add("-");
                arg = arg + "-";
                break;
            case "mult":
                all.add("*");
                arg = arg + "*";
                break;
            case "div":
                all.add("/");
                arg = arg + "/";
                break;
            case "parOne":
                all.add("(");
                arg = arg + "(";
                break;
            case "parTwo":
                all.add(")");
                arg = arg + ")";
                break;
            case "expo":
                all.add("^");
                arg = arg + "^";
                break;
            case "mod":
                all.add("%");
                arg = arg + "%";
                break;
            case "c" :
                all.clear();
                arg = "";
                break;
            case "ce":
                System.out.println("array: " + all.get(all.size()-1).chars().map(Character::getNumericValue).boxed().collect(Collectors.toList()));
                //this splits corrcetly
                all.remove(all.size()-1);
                if (arg.length() != 1) {
                    if (arg.charAt(arg.length() - 2) == '-') {
                        arg = removeLastChar(arg);
                        arg = removeLastChar(arg);
                    } else {
                        arg = removeLastChar(arg);
                    }
                } else {
                    arg = "";
                    all.clear();
                }
                break;
            case "enter":
                break;
            default:
                arg = "How did this even happen";
        }
        System.out.println(all);
        System.out.println(arg);
    }
    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0)
                ? null
                : (s.substring(0, s.length() - 1));
    }
    public static ArrayList<String> allFormatter(ArrayList<String> all) {
        for (int i=1;i<=all.size()-1;i++) {
            if(all.size() != 1) {
                System.out.println("i: " + i);
                System.out.println("all before: " + all);
                if ((!all.get(i - 1).equals("-") && !all.get(i - 1).equals("*") && !all.get(i - 1).equals("/") && !all.get(i - 1).equals("+") && !all.get(i - 1).equals("^") && !all.get(i - 1).equals("%")) && (!all.get(i).equals("-") && !all.get(i).equals("*") && !all.get(i).equals("/") && !all.get(i).equals("+") && !all.get(i).equals("^") && !all.get(i).equals("%"))) {
                    all.add(all.get(i-1) + all.get(i));
                    all.remove(all.get(i));
                    all.remove(i - 1);
                }
                System.out.println("all after: " + all);
            }
        }
        return all;
    }
}