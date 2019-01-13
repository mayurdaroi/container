import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat ;
public class Operation
{
	public static void main(String[] args)
	{
	   //	System.out.println("Hello World");
	   final double chf=5;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter opening amount");
	   double open_amt=sc.nextDouble();
	    System.out.println("enter number of installments");
	    int instal_no=sc.nextInt();
	    
	    double plus_fee=chf*instal_no;
	    System.out.println("plus fee applicable is: "+plus_fee);
	    
	    Amount a=new Amount();
	    a.setTotal_amount(open_amt+plus_fee);
	    
	     System.out.println("total amount is: "+a.getTotal_amount());
	     
	     double total=a.getTotal_amount();
	     
	     double net_installment_amt=total/instal_no;
	     
	     System.out.println("net installment: "+net_installment_amt);
	     
	     
	     DecimalFormat df = new DecimalFormat("#.#");
         df.setRoundingMode(RoundingMode.HALF_UP);
         String str1 = df.format(net_installment_amt);
         double d=Double.parseDouble(str1);
         System.out.println("rounded up: "+d);
         
         double residue=net_installment_amt-d;
         
         System.out.println("residue remain is: "+residue);
	     for(int i=0;i<instal_no;i++)
	     {
	         System.out.println();
	         
	         /*DecimalFormat df = new DecimalFormat("#.#");
             df.setRoundingMode(RoundingMode.HALF_UP);
             String str1 = df.format(net_installment_amt);
             System.out.println(str1);*/
	     }
	}
}