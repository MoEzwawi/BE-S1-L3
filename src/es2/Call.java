package es2;

public class Call {
    private String phoneNumber;
    private double duration;
    public Call(String number, double duration){
        this.phoneNumber = number;
        this.duration = duration;
    }

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

    @Override
    public String toString() {
        return "Call{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", duration=" + duration +
                '}';
    }
}
