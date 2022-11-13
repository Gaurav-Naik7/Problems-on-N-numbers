// Program to accept N numbers from user and display summation digits of each number

#include<stdio.h>
#include<stdlib.h>

int Sum(int iNo)
{
	int iSum=0;
	int iDigit=0;
	
	while(iNo!=0)
	{
		iDigit=iNo%10;
		iSum=iSum+iDigit;
		iNo=iNo/10;
	}
	return iSum;
}

void DigitsSum(int Arr[],int iLength)
{
	int iCnt=0,iSum=0;
	
	for(iCnt=0;iCnt<iLength;iCnt++)
	{
		printf("%d\t",Sum(Arr[iCnt]));
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
	
	DigitsSum(p,iSize);
	
	free(p);
	
	return 0;
}