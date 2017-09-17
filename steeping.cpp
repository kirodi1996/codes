#include <bits/stdc++.h>
using namespace std;
bool isstep(int n){
	int cur,prev;
	prev=-1;
	while(n){
		cur=n%10;
		if(prev==-1){
			prev=cur;
		}
		if(abs(prev-cur)!=1){
			return false;
		}
		n/=10;

	}
	return true;
}

int step(int n,int m){
	for (int i = n; i <= m; ++i)
	{
		if(isstep(i)){
			return i;
		}
	}
}
int main(){
	int n,m;
	cin>>n>>m;
	cout<<step(n,m)<<" ";
}