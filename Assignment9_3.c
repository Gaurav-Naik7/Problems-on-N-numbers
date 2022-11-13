// Program which accepts N numbers from user and check whether that numbers contaion 11 in it or not

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool Check(int Arr[],int iLength)
{
	int iCnt=0;
	bool bFlag=false;
	
	for(iCnt=0;iCnt<iLength;iCnt++)
	{
		if(Arr[iCnt]==11)
		{
			bFlag=true;
			break;
		}
		
	}
	return bFlag;
}

int main()
{
	int iSize=0,iCnt=0,iRet=0;
	int *p=NULL;
	
	printf("Enter the number of elements : ");
	scanf("%d",&iSize);
	
	p=(int*)malloc(iSize*sizeof(int));
	
	if(p==NULL)
	{
		printf("Unable to allocate memory");
		return -1;
	}
	
	for(iCnt=0;iCnt<iSize;iCnt++)
	{
		printf("Enter element %d :",iCnt+1);
		scanf("%d",&p[iCnt]);
	}
	
	iRet=Check(p,iSize);
	
	if(iRet==true)
	{
		printf("11 is present");
	}
	else
	{
		printf("11 is absent");
	}
	
	free(p);
	
	return 0;
}