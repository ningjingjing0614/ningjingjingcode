//���������ε����߳�����������ε������
#include <math.h>
void main()
{
	double a,b,c,s,p,area;
	printf("�����������ε����߳�Ϊ:");
	scanf("%lf %lf %lf",&a,&b,&c);
	s=(a+b+c)/2.0;
	p=s*(s-a)*(s-b)*(s-c);
	area=sqrt(p);
	printf("�������ε����Ϊ��%lf\n",area);
}