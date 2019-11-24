//输入三角形的三边长，算出三角形的面积。
#include <math.h>
void main()
{
	double a,b,c,s,p,area;
	printf("请输入三角形的三边长为:");
	scanf("%lf %lf %lf",&a,&b,&c);
	s=(a+b+c)/2.0;
	p=s*(s-a)*(s-b)*(s-c);
	area=sqrt(p);
	printf("该三角形的面积为：%lf\n",area);
}