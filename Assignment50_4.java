// Program which accepts N numbers from user and accept Range, display all elements from that range

import java.io.*;
import java.util.*;

class Assignment50_4
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int ino=sobj.nextInt();
		
		System.out.println("Start : ");
		int ino2=sobj.nextInt();
		System.out.println("End : ");
		int ino3=sobj.nextInt();
		
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
		obj.Display(Arr,ino2,ino3);
	}
}

class ArrayDemo
{
	public void Display(int Arr[],int iStart,int iEnd)
	{
		int i=0,temp=-1;
		
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]>iStart && Arr[i]<iEnd)
			{
				System.out.print(Arr[i]+"  ");
			}
		}
	}
}
