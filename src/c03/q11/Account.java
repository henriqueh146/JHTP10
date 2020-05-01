package c03.q11;

//name, balance construtor, deposit, getbalancce, setname, getname
public class Account{

	private String name;
	private double balance;

	public AccountQ311(String name, double balance){

		this.name = name;

		if(balance >= 0.0)
			this.balance = balance;
	}

	public void deposit(double depositAmount){

		if(depositAmount > 0.0){
			balance = balance + depositAmount;
		}else {
			System.out.printf("Quantidade inválida. Depósito não efetuado.\n");
		}
	}

	public void withdraw(double debt){
		if(debt > balance){
			System.out.printf("Debt amount exceeds the balance. \n");
		}else if(debt > 0.0){
			balance -= debt;
		}else{
			System.out.print("Invalid value.\n");
		}
	}

	public double getBalance(){
		return balance;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}