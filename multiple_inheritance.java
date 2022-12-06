class Main {
    public static void main(String[] args) {
    Bank b=new Bank();
    b.setAccName("John"); // Set the value of the name variable to "John"
    System.out.println(b.getAccName());
    }
}
class Bank{
    private String AccNo="1";
    private  String AccName="unknown";
    private String amount="unknown";

    public String getAccName() {
    return AccName;
    }

    public String getAccNo() {
    return AccNo;
    }
    public void disp(){
        System.out.println("I love my bank");
    }

    public void setAccNo(String setAccNo) {
    this.AccNo = setAccNo;
    }
    public void setAccName(String setAccName) {
    this.AccName = setAccName;
    }
};

class NABIL extends Bank{
    String BankName;

};
class NCC extends Bank{
    String BankName;
};
