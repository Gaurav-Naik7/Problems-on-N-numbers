// Program which accepts N numbers from user and display all such elements which are divisible by 3 and 5

import java.io.*;
import java.util.*;

class Assignment49_4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int ino=sobj.nextInt();
		
		int i=0,iRet=0;
		int[] Arr;
		Arr=new int[ino];
		
		for(i=0;i<ino;i++)
		{
			System.out.println("Enter a elements : ");
			Arr[i]=sobj.nextInt();
		}
		
		ArrayDemo obj=new ArrayDemo();
		obj.Display(Arr);	
	}
}

class ArrayDemo
{
	public void Display(int Arr[])
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]%5)==0 && (Arr[i]%3==0))
			{
				System.out.print(Arr[i]+" ");
			}
		}
	}
}
