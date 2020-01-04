#include<stdio.h>
int main()
{
	int pow(int a, int b);
	int x,y,num;
	printf("input 2 numbers!\n");
	scanf("%d%d",&x,&y);
	num = pow(x,y);
	printf("result is %d\n",num);
	return 0;
}
int pow(int a, int b)
{
	int num=1;
	int i;
	for (i = 0; i < b; i++)
	{
		num *=a;
	}
	return num;
}
#include<stdio.h>
int main()
{
	int sqrt(int n);
	printf("%d\n",sqrt(25));
return 0;
}
int sqrt(int n)
{
	int i,num = 0;
	for (i = 0; i < n; i++)
	{
		if(i * i == n)
		{
		num = i;
		break;
		}
	}
return num;
}
#include<stdio.h>
int main()
{
	double average(double a[],int n);
	double a[15];
	int i = 0;
	printf("input 15 numbers!\n");
	for (i = 0; i < 15; i++)
	{
		scanf("%lf",&a[i]);
	}
	printf("%lf\n",average(a,15));
	printf("input 10 numbers!\n");
	for (i = 0; i < 10; i++)
	{
		scanf("%lf",&a[i]);
	}
	printf("%lf\n",average(a,10));
	return 0;
}
double average(double a[],int n)
{
	int i;
	double sum = 0.0;
	double aver = 0.0;
	for(i = 0; i < n; i++)
	{
		sum += a[i];
	}
	aver = sum/n;
	return aver;
}
