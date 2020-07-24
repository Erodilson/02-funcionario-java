package salário_mês;

import java.util.Locale;
import java.util.Scanner;

import contabilidade.Employee;

public class RH {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in);

Employee cont = new Employee () ;

System.out.print("qual o nome do funcionário:");

cont.nome = sc.nextLine();

System.out.print("Digite aqui o salário bruto :");

cont.GrossSalary = sc.nextDouble();

System.out.print("Digite aqui os descontos :");

cont.Tax = sc.nextDouble();

System.out.print(" salario liquido :");

System.out.println(cont.NetSalary());

System.out.println("tem alguma porcentagem a ser adicionada ?");

cont.adicional = sc.nextDouble();


if (cont.increaseSlary() >=0 )  

{System.out.println(" Valor bruto + bonificação " + ( cont.increaseSlary()+ cont.GrossSalary )
		+" Valor a ser recebido " + ( cont.increaseSlary()+ cont.GrossSalary - cont.Tax));
   
} else {
    System.out.println("o valor liquido para o funcionário é " + cont.NetSalary());
}    

 

sc.close();
	}

}
