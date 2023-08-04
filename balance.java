package newBankApp;

 class balance {
    int Balance;
    boolean withdrawMoney(int m){
        boolean r=true;
        if(m>this.Balance){
             r=false;
        }
        else{
            this.Balance-=m;
        }
        return r;
    }
    void depositMoney(int k){
        this.Balance+=k;
    }
}
