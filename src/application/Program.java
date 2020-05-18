package application;

import Entities.Contract;
import Entities.Installment;
import Service.ContractService;
import Service.PaypalPaymentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int idContract = sc.nextInt();
        System.out.print("Date(dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        Double value = sc.nextDouble();

        Contract contract = new Contract(idContract,date,value);

        System.out.print("How many installments? " );
        Integer nInstallments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalPaymentService());

        contractService.processContract(contract,nInstallments);

        System.out.println("Installments:");
        for (Installment x : contract.getInstallments()){
            System.out.println(x);
        }
        sc.close();
    }
}
