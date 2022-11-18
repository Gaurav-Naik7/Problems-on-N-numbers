// Program which accepts N numbers from user and return product of all odd elements

import java.io.*;
import java.util.*;

class Assignment50_5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int ino=sobj.nextInt();
		
		int i=0;
		int iRet=0;
		
		int[] Arr;
		Arr=new int[ino];
		
		for(i=0;i<ino;i++)
		{
			System.out.println("Enter an element : ");
			Arr[i]=sobj.nextInt();
		}
		
		ArrayDemo obj=new ArrayDemo();
		iRet=obj.Produt(Arr);
		System.out.println(iRet);
	}
}

class ArrayDemo
{
	public int Produt(int Arr[])
	{
		int i=0,iMult=1;
		
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]%2)!=0)
			{
				iMult=iMult*Arr[i];
			}
		}
		return iMult;
	}
}
