//#include<stdio.h>
//int main()
//{
//	//int a = 3;
//	//int b,c,d,e = 0;
//	////b = a +=a *= a+1;
//	//d = a *= a+1;
//	////c = a +=12;
//	////d = a+1;
//	////printf("%d  %d  %d",b,c,d);
//	//printf("%d",d);
//	////printf("%d",c);
//	//struct node{
//	//	int num;
//	//	char name[10];
//	//	float score[3];
//	//}a;
//	//int b = 0;
//	//b = sizeof(a);
//	//printf("%d",b);
//	//int a = 10;
//	//printf("%d",++a);
//	//printf("%d",++a);
//	//printf("%d %d",++a,++a);
//	int a = 3, b = 4, c = 4;
//	//printf("%d",c>=b>=a?1:0);
//	printf("%d",c>=b>=a?1:0);
//return 0;
//}
//#include<stdio.h>
//int main()
//{
//	double average(double a[],int n);
//	double a[15];
//	int i = 0;
//	printf("input 15 numbers!\n");
//	for (i = 0; i < 15; i++)
//	{
//		scanf("%lf",&a[i]);
//	}
//	printf("%lf\n",average(a,15));
//	printf("input 10 numbers!\n");
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%lf",&a[i]);
//	}
//	printf("%lf\n",average(a,10));
//	return 0;
//}
//double average(double a[],int n)
//{
//	int i;
//	double sum = 0.0;
//	double aver = 0.0;
//	for(i = 0; i < n; i++)
//	{
//		sum += a[i];
//	}
//	aver = sum/n;
//	return aver;
//}
#include<stdio.h>
int main()
{
	int a,b,c,m,t;
	printf("input 2 numbers");
	scanf("%d %d",&a,&b);
	if (a<b)
	{
		t = a;
		a = b;
		b = t;
	}
	m = a*b;
	c = a%b;
	while(c != 0)
	{
		a = b;
		b = c;
		c = a%b;
	}
	printf("最大公约数%d\n",b);
	printf("最大公约数%d\n",m/b);
return 0;
}