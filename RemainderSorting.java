//I explained steps of this sorting in the program
import java.util.Scanner;
class RemainderSorting
{
public static void main(String args[])
{
int a[]={121,101,110,199,400,197,166,119};
int b[]=remSort(a);

for(int i=0;i<b.length;i++)
{
System.out.println(b[i]);
}
}

static int[] remSort(int a[])
{
int max,count,r,k,i,j,div=1;
int b[]=new int[a.length];
max=count=r=k=0;

//This loop is used for finding the largest number in array because number of rounds is equals to the total number of digits in a largest number
for(i=0;i<a.length;i++)
{
if(max<a[i])
	max=a[i];
}

//This loop is used for counting number of digits(i.e. rounds)
while(max!=0)
{
	count++;
	max=max/10;
}


for(i=0;i<count;i++)
{
//maximum possible number on every digit place is 9 
while(r<10)
{
	for(j=0;j<a.length;j++)
	{
		if((a[j]/div)%10==r)
			b[k++]=a[j];
	}
	
	if(r<10)
		r++;
}
k=r=0;
div=div*10;
//copying elements into original   
for(j=0;j<a.length;j++)
a[j]=b[j];	

}
return a;
}
}