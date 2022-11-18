// Program which accepts N numbers from user and return difference between summation of even elements and summation of odd elements

import java.io.*;
import java.util.*;

class Assignment49_1
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
		iRet=obj.Difference(Arr);
		System.out.println(iRet);
		
	}
}

class ArrayDemo
{
	public int Difference(int Arr[])
	{
		int i=0,iSumE=0,iSumO=0;
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]%2)==0)
			{
				iSumE=iSumE+Arr[i];
			}
			else
			{
				iSumO=iSumO+Arr[i];
			}
		}
		return (iSumE-iSumO);
	}
}
