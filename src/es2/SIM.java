package es2;

import java.util.Random;

public class SIM {
    private final String myNumber;
    private double credit = 0;
    private Call[] lastFiveCalls = new Call[5];
    private static String operatore = "EpiCalls";

    public SIM(String number){
        if (number.matches("\\d{10}")) this.myNumber=number;
        else throw new IllegalArgumentException("Insert a valid number");
    }

    public void setSomeFakeCalls(){
        for(int i=0;i<5;i++) {
            String fakeNumber = "";
            for (int j=0;j<10;j++){
                Random n = new Random();
                fakeNumber += n.nextInt(10);
            }
            Random rnd = new Random();
            lastFiveCalls[i] = new Call(fakeNumber,rnd.nextDouble(30));
        }
    }
    public void showSIMData(){
        System.out.println("Your number: "+myNumber);
        System.out.println("Your credit: "+credit+"$");
        if (lastFiveCalls[0]==null) System.out.println("Your call log is empty");
        else{
            System.out.println("Call log:");
            for (int i = 0; i < lastFiveCalls.length;i++){
                System.out.println(lastFiveCalls[i]);
            }
        }
    }

    public static String getOperatore() {
        return operatore;
    }
}
