//#include<stdio.h>
//int main()
//{
	/*char arr1[] = "asdfg";
	printf("%s\n",arr1);*/
	/*int arr[10] = {0};
	int sz = sizeof(arr)/sizeof(arr[0]);
	int i = 0;
	for (i = 0; i < 10; i++)
	{
	arr[i] = i;
	}
	for (i = 0; i < 10; i++)
	{
		printf("%d\n",arr[i]);
	}*/
	/*int arr[10] = {0};
	int s = sizeof(arr);*/
	/*char arr1[] = "abc";
	char arr2[3] = {'a','b','c'};*/
	//int i =0;
	//for (i = 0; i < 3; i++)
	
	//printf ("%s\n",arr1);
	//printf ("%s\n",arr2);
	//printf ("%d\n",arr2);
	/*int arr[] = {1,2,3,4};
	int i = 0;
	for (i = 0; i < 4; i++)
	{
	printf ("%d",arr[i]);
	}
	printf ("%d\n",arr);
	//printf ("\a\a\a\a\a\a\a\a");*/
	//int arr[10] = {0};
	//int i = 0;
	//for (i = 0; i < sizeof(arr)/sizeof(arr[0]); i++)
	//{
	//printf ("%p\n",&arr[i]);
	//}
	//int arr[3][4] = {1,2,3,4};
	//int i,j;
	//for (i = 0; i < 3; i++)
	//{
	//	for (j = 0; j < 4; j++)
	//	{
	//		arr[i][j] = i*6 + j;
	//	}
	//}
	//for (i = 0; i < 3; i++)
	//{
	//	for (j = 0; j < 4; j++)
	//	{
	//		printf ("%d  ",arr[i][j]);
	//	}
	//	printf ("\n");
	//}
	//int arr[3][4] = {1,2,3,4};
	//int i,j;
	//for (i = 0; i < 3; i++)
	//{
	//	for (j = 0; j < 4; j++)
	//	{
	//		printf ("&arr[%d][%d] = %p\n",i,j,&arr[i][j]);
	//	}
	//	printf ("\n");
	//}
//	return 0;
//}

#include<stdio.h>
void bubble_sort(int arr[])
{
	int sz = sizeof (arr)/sizeof(arr[0]);
	int i = 0;
	for (i = 0; i < sz - 1; i++)
	{
		int j = 0;
		for (j = 0; j<sz-i-1; j++)
		{
			if (arr[j] > arr[j+1])
			{
				int tmp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = tmp;
			}
		}
	}
}
int main()
{
	int arr[] = {4,7,8,9,65,5,2,3};
	int i = 0;
	bubble_sort(arr);
	for (i=0; i<sizeof(arr)/sizeof(arr[0]); i++)
	{
	printf ("%d   ",arr[i]);
	}
	return 0;
}