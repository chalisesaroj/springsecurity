
package com.example.demo;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class calculator {
	public static double emi(double p,double n,double nm,double r) {

		double rate=r/1200;
		double time;
		time=(12*n)+nm;
		double emival= (p*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
		//String format = "0";
	  //  NumberFormat formatter = new DecimalFormat(format);  
	  //  String emivall = formatter.format(emival);
		return emival;
	}
	public static String[][] detailcalculation(double p,double n,double nm,double r) {
		double time=(12*n)+nm;
		double balance=p;
		double [][]arr=new double[(int) (time)][5];
		for(int i=0;i<time;i++) {
			arr[i][0]=i+1;
		double interestthismonth=(r/1200)*balance;
		arr[i][1]=interestthismonth;
		double principlededucted=emi(p,n,nm,r)-interestthismonth;
		arr[i][2]=principlededucted;
		arr[i][3]=emi(p,n,nm,r);
			balance=balance-principlededucted;
			arr[i][4]=balance;
		//	System.out.println(""+interestthismonth+"   "+" "+emi(p,n,r,"years")+" "+principlededucted+"   "+balance);	
		}
		String [][]arrst=new String[(int) (time)][5];
		for (int i = 0; i < time; i++) {
		    for (int j = 0; j < 5; j++) {
		    	
		    	arrst[i][j] = String.format("%.0f", arr[i][j]);
		    }
		    }
		return arrst;
	}
	public int[] counting(double n) {
		int[]countarray=new int[(int) (12*n)];
		int i=(int) (12*n);
		for(int j=1;j<=i;j++)
			countarray[j-1]=j;
		return countarray;
		
	}

	}



