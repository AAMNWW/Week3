public class Bankaccount{
private double balance;
private long accountno;
public void setBalance(double balance1){
balance=balance1;

}
public void setAccountno(long accountno1){
accountno=accountno1;

}
public double getBalance(){
return balance;
}
public long getAccountno(){
return accountno;
}
public void deposit(double money){
balance+=money;
}
public void withdraw(double money){
balance-=money;
}
public void display(){
System.out.println("Balance: " + balance);
System.out.println("Accountno: " + accountno);
}
}