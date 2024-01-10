package pkgfinal;

class Worker extends Person{
    private int grossIncome;
    private boolean mailing;
    public Worker(){
    }
    public Worker(int n, boolean m){
        grossIncome = n;
        mailing = m;
    }
    public void setGrossIncome(int n){
        grossIncome = n;
    }
    public void setMailing(boolean m){
        mailing = m;
    }
    public String getMailing(){
        String str;
        if(mailing==true)
            str = "yes";
        else
            str = "no";
        return str;
    }
    public String toString(){
        String str;
        str = "Name: "+getName()
                + "\nAddress: "+getAddress()
                + "\nPhone: "+getPhone()
                + "\nGross Income: "+grossIncome
                + "\nMailing list: "+getMailing();
        return str;
    }

    void setGrossIncome(Double Income) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}