package contabilidade;

public class Employee {

	
	public String nome;
	
	public double GrossSalary;
	public double adicional;
	public double Tax;
	
	public double NetSalary() {
		return (GrossSalary - Tax);
	}
	
	public  double increaseSlary(){
		
		return (GrossSalary * adicional)/100;
		
		
	}
}