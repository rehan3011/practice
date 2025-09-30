class Main{
    public static void main(String[] args){
        bank acc1=new bank("rehan",63000,10000,3011);
        bank acc2=new bank("sohan",9985,5000,1947);
        acc1.deposit(3011, 500);
        acc1.showBalance(3011);
        acc1.withDraw(3011,1000);
        acc1.showBalance(3011);
        acc2.deposit(1947,600);
        acc2.showBalance(1947);
        acc1.showBalance(3022);

    }
}