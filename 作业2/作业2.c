//�����¹��ɽ����ı�����룺����ĸA�����ĸE��a���e����������ĵ�4����ĸ��W���A��X���B��Y���C��Z���D
//���ܵĳ���
#include<stdio.h>
			void main()
		{
			int i,n;
			char s[80];
			gets(s);
			n=strlen(s);
			for(i=0;i<n;i++)
				if(s[i]>='A'&&s[i]<='Z')
					s[i]=(s[i]-'A'+22)%26+'A';
				else if(s[i]>='a'&&s[i]<='z')
					s[i]=(s[i]-'a'+22)%26+'a';
				puts(s);
		}
