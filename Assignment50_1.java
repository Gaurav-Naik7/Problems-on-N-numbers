// Program which accepts N numbers from user and accept one another number as NO, check whether NO is present or not

import java.io.*;
import java.util.*;

class Assignment50_1
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int ino=sobj.nextInt();
		System.out.println("Enter number to be checked : ");
		int ino2=sobj.nextInt();
		
		int i=0;
		boolean bRet=false;
		
		int[] Arr;
		Arr=new int[ino];
		
		for(i=0;i<ino;i++)
		{
			System.out.println("Enter an element : ");
			Arr[i]=sobj.nextInt();
		}
		
		ArrayDemo obj=new ArrayDemo();
		bRet=obj.NoPresent(Arr,ino2);
		if(bRet==true)
		{
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}	
	}
}

class ArrayDemo
{
	public boolean NoPresent(int Arr[],int iNo)
	{
		int i=0;
		boolean flag=false;
		
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNo)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}
}
