////дһ������������й���:
////����һ������score��ʵ�֣�
////���score<60 	   ���  E
////���60 <=score <70 ���  D
////���70 <=score <80 ���  C
////���80 <=score <90 ���  B
////���90 <=score     ���A
////2.	�����ʵ�֣�����һ������3������n���ж����Ƿ�Ϊ������
////3.	���ʵ�֣���1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
////4.	ʹ��ð�ݷ��������20��������С��������
#include <stdio.h>
int main()
{
	int score = 0;
	printf("input one number!\n");
	scanf ("%d",&score);
	if(score < 60)
	{printf("E\n");}
	else if ((score > 60 || score == 60) && score <70)
	{printf ("D\n");}
	else if ((score > 70 || score == 70) && score <80)
	{printf ("C\n");}
	else if ((score > 80 || score == 80) && score <90)
	{printf ("B\n");}
	else if (score > 90 || score == 90)
	{printf ("A\n");}
	return 0;
}
//�����ʵ�֣�����һ������3������n���ж����Ƿ�Ϊ������
#include<stdio.h>
int main()
{
	int i,num = 0;
	printf("input one number!\n");
	scanf("%d",&num);
	for (i = 2; i < num; i++)
	{
		if (num % i == 0)
		{
			printf("%d is not prime!\n",num);
			break;
		}
		else if(i > num) 
		{
			printf("%d is prime!\n",num);
			break;
		}
		else
		{
			printf("%d is not prime!\n",num);
			break;
		}
	}
return 0;
}
���ʵ�֣���1��2��3��4�ĸ����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
#include<stdio.h>
	int main()
{
	int x, y, z;
	int count = 0;
	for (x = 1; x <5 ; x++)
	{
		for (y = 1; y <5 ; y++)
		{
			for (z = 1; z <5 ; z++)
			{
				if (x != y && y != z && x != z)
				{
					printf("%5d%d%d",x,y,z);
					count ++;
				}
			}
		}
	}
	printf("\n");
	printf("toghter is %d\n",count);
	return 0;
}
ʹ��ð�ݷ��������20��������С��������
#include<stdio.h>
int main()
{
	void bubber(int w[],int n);
	int a[5], n;
	printf("input 5 numbers!\n");
	for (n = 0; n< 5; n++)
	{
		scanf("%d",&a[n]);
	}
	bubber(a,5);
	for(n = 0; n < 5; n++)
	{
		printf("%-5d",a[n]);
	}
	printf("\n");
	return 0;
}
void bubber(int w[],int n)
{
		int i,j,temp=0;
	for( i = 0; i < n; i++)
	{
		for( j = 0 ;j < n-1-i; j++)
		{
			if( w[j] > w[j+1] )
			{
				temp = w[j+1];
				w[j+1] = w[j];
				w[j] = temp;
			}
		}
	}
}
//1.���ʵ��POW���������ô˺�������η���ֵ��
////#include<stdio.h>
////int main()
////{
////	int pow(int a, int b);
////	int x,y,num;
////	printf("input 2 numbers!\n");
////	scanf("%d%d",&x,&y);
////	num = pow(x,y);
////	printf("result is %d\n",num);
////	return 0;
////}
////int pow(int a, int b)
////{
////	int num=1;
////	int i;
////	for (i = 0; i < b; i++)
////	{
////		num *=a;
////	}
////	return num;
////}
////2.���ʵ��sqrt������������sqrt����ʵ����������Χ�ڵĿ������㡣
////#include<stdio.h>
////int main()
////{
////	int sqrt(int n);
////	printf("%d\n",sqrt(25));
////return 0;
////}
////int sqrt(int n)
////{
////	int i,num = 0;
////	for (i = 0; i < n; i++)
////	{
////		if(i * i == n)
////		{
////		num = i;
////		break;
////		}
////	}
////return num;
////}
////3.�������༶���ֱ���15����10��ѧ��������һ��average�������ֱ�����������ѧ����ƽ���ɼ���
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
////4.��һ��һά�����ڷ�10��ѧ���ɼ���дһ����������ƽ��ֵ�����ֵ����Сֵ��
////#include<stdio.h>
////int main()
////{
////	double max(double a[],int n);
////	double average(double a[],int n);
////	double mix(double a[],int n);
////	double a[10] = {1,2,3,4,5,6,7,8,9,4};
////	printf("%lf\n",max(a,10));
////	printf("%lf\n",average(a,10));
////	printf("%lf\n",mix(a,10));
////return 0;
////}
////double average(double a[],int n)
////{
////	int i;
////	double sum = 0.0;
////	double aver = 0.0;
////	for(i = 0; i < n; i++)
////	{
////		sum += a[i];
////	}
////	aver = sum/n;
////	return aver;
////}
////double max(double a[],int n)
////{
////	int i,j,temp=0;
////	for( i = 0; i < n; i++)
////	{
////		for( j = 0 ;j < n-1-i; j++)
////		{
////			if( a[j] < a[j+1] )
////			{
////				temp = a[j+1];
////				a[j+1] = a[j];
////				a[j] = temp;
////			}
////		}
////	}
////return a[0];
////}
////double mix(double a[],int n)
////{
////	int i,j,temp = 0;
////	for (i = 0; i < n; i++)
////	{
////	for (j = 0; j < n-1-i; j++)
////	{
////	if( a[j] < a[j+1] )
////			{
////				temp = a[j+1];
////				a[j+1] = a[j];
////				a[j] = temp;
////			}
////	}
////	}
////	return a[n-1];
////}
//1.����ָ��͵��ú������ʵ�֣�������������a,b,c,Ҫ���ɴ�С˳�����������
//#include<stdio.h>
//int main()
//{
//	void sort (int *p1, int *p2, int *p3);
//	int a[3] = {7,5,9};
//	int i;
//	int q1, q2, q3 = 0;
//	q1 = &a[0];
//	q2 = &a[1];
//	q3 = &a[2];
//	sort (q1, q2, q3);
//	for (i = 0; i < 3; i++)
//	{
//		printf("%d\n",a[i]);
//	}
//	return 0;
//}
//void sort (int *p1, int *p2, int *p3)
//{
//	void swap(int *t1, int *t2);
//	if (*p1 < *p2) {swap(p1, p2);}
//	if (*p1 < *p3) {swap(p1, p3);}
//	if (*p2 < *p3) {swap(p2, p3);}
//}
//void swap(int *t1, int *t2)
//{
//	int temp = 0;
//	temp = *t1;
//	*t1 = *t2;
//	*t2 = temp;
//}
//2.�������ѡ�ˣ�30��ѡ��ÿ��ֻ��ͶƱѡһ�ˣ�Ҫ���һ��ͳ��ѡƱ�ĳ����Ⱥ����뱻ѡ�˵����֣����������˵�Ʊ�����
//#include<string.h>
//#include<stdio.h>
//struct person
//{
//	char name[20];
//	int count;
//}leader[5] = {"aa",0,"bb",0, "cc",0, "dd",0, "ee",0};
//int main()
//{
//	int i,j;
//	char vote_name[20];
//	for (i = 0; i < 30; i++)
//	{
//		scanf("%s",vote_name);
//		for(j = 0; j < 5; j++)
//		{
//			if (strcmp(vote_name, leader[j].name) == 0)
//			{
//				leader[j].count ++;
//			}
//		}
//	}
//	printf("\n result is:\n");
//	for(i=0;i<5;i++)
//	{
//		printf("%5s:%d\n",leader[i].name,leader[i].count);
//	}
//	return 0;
//}