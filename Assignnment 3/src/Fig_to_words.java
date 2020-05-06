//java class which has static method fig_to_words  which takes amount a long and converts figure to words and return a string.
public class Fig_to_words {

	public static String numberToWords(long number) {

	String Words = "";

	String unitsArray[] = { " Zero", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten",
			" Eleven", " Twelve",

			" Thirteen", " Fourteen", " Fifteen", " Sixteen", " Seventeen",

			" Eighteen", " Nineteen" };

	String tensArray[] = { " Zero", " Ten", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", " Seventy", " Eighty",
			" Ninety" };

String val[]={" Crores"," Lakhs"," Thousands"," Hundreds"," Only"};
long  inVal[]={10000000,100000,1000,100,1};
for(int i = 0;i<inVal.length;i++)
{
	long b1=number/inVal[i];
	number%=inVal[i];
	if(b1>0)
	{
		if(b1>19){
		Words+=tensArray[(int)b1/10]+ unitsArray[(int)b1%10]+val[i];
	}
else
{
Words+= unitsArray[(int)b1]+val[i];
}
}
}
return Words;
}
}
