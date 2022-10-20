import java.util.Scanner;
public class OctEighteenExercise {
    public static void main(String[] args) {
        playerOne();
    }
    public static void playerOne() {
        Scanner yOrNScanner = new Scanner(System.in);
        boolean pointChecker = true;
        System.out.println("Begin game (type y or n)?");
        String yOrN = yOrNScanner.nextLine();
        int points = 0;
        if (points < 100) {
            if (yOrN.equals("y")) {
                boolean gameWhileLoop = true;
                while (gameWhileLoop) {
                        System.out.println("Rolling dice...");
                        double dice1double = Math.random() * (6 - 1) + 1;
                        double dice2double = Math.random() * (6 - 1) + 1;
                        Integer dice1 = (int) Math.round(dice1double); //idk why this works
                        Integer dice2 = (int) Math.round(dice2double);
                        System.out.println("Die 1: " + dice1 + " Die 2: " + dice2 + " initial turn");
                        //check if the dice are the same value
                        if (dice1 != dice2) {
                            Scanner endOrRollScanner = new Scanner(System.in);
                            points = dice1 + dice2;
                            System.out.println(points);
                            System.out.println("Roll again or end turn? (Type in 'end' or 'roll')");
                            String endOrRoll = endOrRollScanner.nextLine();
                                if (endOrRoll.equalsIgnoreCase("end") || endOrRoll.equalsIgnoreCase("roll")) {
                                    if (endOrRoll.equalsIgnoreCase("end")) {
                                        System.out.println("Ending turn, switching to Player 2");
                                    } else if (endOrRoll.equalsIgnoreCase("roll")) {
                                        System.out.println("Rolling dice...");
                                        dice1double = Math.random() * 6;
                                        dice2double = Math.random() * 6;
                                        dice1 = (int) Math.round(dice1double);
                                        dice2 = (int) Math.round(dice2double);
                                        System.out.println("Die 1: " + dice1 + " Die 2: " + dice2 + " following turns");
                                        if (dice1 != dice2) {
                                            points = points + dice1 + dice2;
                                            System.out.println(points);
                                            System.out.println("Roll again or end turn? (Type in 'end' or 'roll') following turn");
                                        } else {
                                            System.out.println("Your dice were the same number. Lose your turn and this turn's points.");
                                            points = points;
                                            break;
                                        }
                                    } else if (endOrRoll.equalsIgnoreCase("end")) {
                                        System.out.println("Ending turn, switching to other player's turn.");
                                        break;
                                    }
                                } else {
                                    System.out.println("You didn't type in end or roll, switching turns.");
                                    break;
                                }
                                if (yOrN.equalsIgnoreCase("n")) {
                                    System.out.println("Exiting game.");
                                }
                            }
                        }
                    }
                }
            }
        }
/*
stop game when 100 points are reached
make it two players fr
stop TURN not the GAME on a double
 */