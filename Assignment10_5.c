// Program which accepts N numbers from user and return the product of all odd elements

#include<stdio.h>
#include<stdlib.h>

int Product(int Arr[],int iLength)
{
	int iCnt=0;
	int iMult=1;

	for(iCnt=0;iCnt<iLength;iCnt++)
	{
		if((Arr[iCnt]%2)!=0)
		{
			iMult=iMult*Arr[iCnt];
		}
	}
	return iMult;
}

int main()
{
	int iSize=0,iCnt=0,iRet=0,iValue=0;
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
	
	iRet=Product(p,iSize);
	printf("%d",iRet);
	free(p);
	
	return 0;
}