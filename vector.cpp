#include <bits/stdc++.h>
using namespace std;
int main()
{
	vector <int> v1={1,2,3};
	vector <int> v2={1,3,5};
	vector <int> v3;
	//v1.push_back(4);
	vector <int> :: iterator it1=v1.begin();
	vector <int> :: iterator it2=v2.begin();
	for (auto i = v1.begin(); i < v1.end(); ++i)
	{
		
		v3.push_back(*it2+*it1);
		it1++;
		it2++;
	}
	for (int i =0; i < 3; ++i)
	{
		
		cout<<v3[i]<<" ";
	}
	cout<<endl;
	cout<<v1.capacity()<<endl;
	cout<<v1.front()<<endl;
	cout<<v1.back()<<endl;
}
