// Program which accepts N numbers from user and accept one another number as NO, return index of last occurrence

import java.io.*;
import java.util.*;

class Assignment50_3
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int ino=sobj.nextInt();
		System.out.println("Enter number to be checked : ");
		int ino2=sobj.nextInt();
		
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
		iRet=obj.LastIndex(Arr,ino2);
		System.out.println(iRet);
	}
}

class ArrayDemo
{
	public int LastIndex(int Arr[],int iNo)
	{
		int i=0,temp=-1;
		
		for(i=Arr.length-1;i>=0;i--)
		{
			if(Arr[i]==iNo)
			{
				temp=i;
				break;
			}
		}
		return temp;
	}
}
