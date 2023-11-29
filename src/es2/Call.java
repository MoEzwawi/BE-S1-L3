package es2;

public class Call {
    private String phoneNumber;
    private double duration;

    public double getDuration() {
        return duration;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\d{10}")) this.phoneNumber=phoneNumber;
        else throw new IllegalArgumentException("Insert a valid number");
    }
    public void showCallData(){
        System.out.println("Number: "+ phoneNumber);
        System.out.println("Duration: "+ duration);
    }
}
