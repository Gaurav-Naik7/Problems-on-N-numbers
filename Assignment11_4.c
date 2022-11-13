// Program to accept N numbers from user and display all such numbers which contains 3 digits in it

#include<stdio.h>
#include<stdlib.h>

int NoDigits(int iNo)
{
	int iNoDigits=0;
	
	while(iNo!=0)
	{
		iNoDigits++;
		iNo=iNo/10;
	}
	return iNoDigits;
}

void Digits(int Arr[],int iLength)
{
	int iCnt=0,iAns=0;
	
	for(iCnt=0;iCnt<iLength;iCnt++)
	{
		if(NoDigits(Arr[iCnt])==3)
		{
			printf("%d\t",Arr[iCnt]);
		}
	}
}

int main()
{
	int iSize=0,iCnt=0;
	int *p=NULL;
	
	printf("Enter number of elements : ");
	scanf("%d",&iSize);
	
	p=(int*)malloc(iSize*sizeof(int));
	
	if(p==NULL)
	{
		printf("Unable to allocate memory");
		return -1;
	}
	
	for(iCnt=0;iCnt<iSize;iCnt++)
	{
		printf("Enter elemant %d ",iCnt+1);
		scanf("%d",&p[iCnt]);
	}
	
	Digits(p,iSize);
	
	free(p);
	
	return 0;
}