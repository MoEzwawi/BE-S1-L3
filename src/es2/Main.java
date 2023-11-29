package es2;

public class Main {
    public static void main(String[] args){
        SIM a = new SIM("1234567890");
        a.showSIMData();
        SIM b = new SIM("3487690063");
        b.setSomeFakeCalls();
        b.showSIMData();
    }
}
