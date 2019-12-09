////调用一个average函数，分别求5个数和10个数的平均数
////#include <stdio.h>
////int main()
////{
////	int n = 5;
////	double a[5] = {45,47,5,98,5};
////    double average(int n,double a[]);
////	printf("%d",average(5,a));
////	return 0;
////}
////double average(int n, double a[]){
////	double sum = 0;
////	int i = 0;
////	for (i = 0; i < n; i++){
////		sum +=a[i];
////	}
////	return sum;
////}
//#include<stdio.h>
//int main()
//{
//	float average(float array[], int n);
//	float score1[5] = {45,23,5,6,89};
//	float score2[10] = {45,23,5,6,89,85,6,78,2,6};
//	printf("%f\n",average(score1,5));
//	printf("%f\n",average(score2,10));
//return 0;
//}
//float average(float array[],int n){
//	int i;
//	float aver,sum = array[0];
//	for(i = 0; i<n; i++){
//	sum +=array[i];}
//	aver = sum/n;
//	return(aver);
//}
#include<stdio.h>
int main()
{
	void exchange(int *q1, int *q2, int *q3);
	int a,b,c,*p1,*p2,*p3;
	printf("enter 3 numbers:");
	scanf("%d,%d,%d",&a,&b,&c);
	p1 = &a;p2 = &b;p3 = &c;
	exchange(p1,p2,p3);
	printf("the order is:%d,%d,%d\n",a,b,c);
return 0;
}
void exchage(int *q1, int *q2, int *q3)
{
	void swap(int *pt1, int *pt2);
	if(* q1 < * q2) swap(q1, q2);
	if(* q1 < * q3) swap(q1, q3);
	if(* q2 < * q3) swap(q2, q3);
}
void swap(int *pt1, int*pt2)
{
	int temp;
	temp = * pt1;
	* pt1 = *pt2;
	* pt2 = temp;
}