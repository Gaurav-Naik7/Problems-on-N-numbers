// Program which accepts N numbers from user and accept one another number as NO, return index of last occurrence of that NO

#include<stdio.h>
#include<stdlib.h>

int LastOcc(int Arr[],int iLength,int iNo)
{
	int iCnt=0;

	for(iCnt=iLength;iCnt>=0;iCnt--)
	{
		if(Arr[iCnt]==iNo)
		{
			break;
		}
	}
	if(iCnt==-1)
	{
		return -1;
	}
	else
	{
		return iCnt;
	}
}

int main()
{
	int iSize=0,iCnt=0,iRet=0,iValue=0;
	int *p=NULL;
	
	printf("Enter the number of elements : ");
	scanf("%d",&iSize);
	
	printf("Enter the number : ");
	scanf("%d",&iValue);
	
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
	
	iRet=LastOcc(p,iSize,iValue);
	printf("%d",iRet);
	free(p);
	
	return 0;
}