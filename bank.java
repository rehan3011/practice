class bank {
    private String name;
    private long accnum;
    private double balance;
    private int pin;

    bank(String n,long an,double bal,int p){
        this.name=n;
        this.accnum=an;
        this.balance=bal;
        this.pin=p;
    }
    void deposit(int enteredPin, double amount){
        if(enteredPin==this.pin){
            balance=balance+amount;
            System.out.println("Amount of "+amount+" has been successfully deposited into your account!!");
        }
        else
            System.out.println("You have entered incorrect password!!!");

    }

    void withDraw(int enteredPin, double amount){
        if(enteredPin==this.pin){
            balance=balance-amount;
            System.out.println("Amount of "+amount+" has been successfully withdrawed from your account!!");
        }
        else
            System.out.println("You have entered incorrect password!!!");

    }

    void showBalance(int enteredPin){
        if(enteredPin==this.pin)
        System.out.println("balance in your account: "+balance);
        else
            System.out.println("password is incorrect!!");


}}