package c03.q14;

import javax.swing.JOptionPane;

public class Date{

	private int mes;
	private int dia;
	private int ano;

	public DateQ314(int mes, int dia, int ano){

		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	public void setMes(int mes){
		this.mes = mes;
	}

	public int getMes(){
		return mes;
	}

	public void setDia(int dia){
		this.dia = dia;
	}

	public int getDia(){
		return dia;
	}

	public void setAno(int ano){
		this.ano = ano;
	}

	public int getAno(){
		return ano;
	}

	public void displayDate(){
		String data = String.format("%d/%d/%d", mes, dia, ano);
		JOptionPane.showMessageDialog(null, data);
	}
}