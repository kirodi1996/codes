#include<iostream>
using namespace std;
int main()
{
	int n;
	int s=0;
	int m=0;
	string a;
	cin>>a;
	n= a.size();
	//int j=0;dcv
for(int i=0;i<n;)	
	{
	if(a[i]=='s'&&a[i+1]=='m')
		{
			a[i]='.';
			i++;
		}

	else if(a[i]=='m'&&a[i+1]=='m')	
		{	
			m++;
			i++;
		}

	else if(a[i]=='m'&&a[i+1]=='s')
		{
			m++;
			a[i+1]='.';
			i++;
		}

	else if(a[i]='s'&&a[i+1]=='s')	
		{
			s++;
			i++;

		}

	else if(a[i]=='.')
		{
			i++;

		}
	}
cout<<s<<m;




}