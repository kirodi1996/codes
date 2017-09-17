#include <bits/stdc++.h>
using namespace std;
#define PII pair <int,int>
#define PB push_back
#define MP make_pair
vector <PII> v[1000005];
map <int,int> my;
int max_act_sel(vector <PII> acts){
	int sz=acts.size();
	//cout<<"sz="<<sz<<endl;
	if(sz==0){
		return 0;
	}
	sort(acts.begin(),acts.end());
	int ans=1;
	int lst=acts[0].first;
	 for(int i=1;i<sz;i++)
    {
	 if(acts[i].second>=lst)
	 {
	     ans++;
	     lst = acts[i].first;
	 }
    }
 
    return ans;
}
int main(){
	int t;
	scanf("%d",&t);
	while(t--){
		my.clear();
		int pos=0;
		int n,k;
		scanf("%d%d",&n,&k);
		if(n==0){
			printf("0\n");
			continue;
		}
		for(int i=0;i<n;i++){
			v[i].clear();
		}
		int s,f,p;
		for (int i = 0; i < n; ++i)
		{
			 scanf("%d%d%d",&s,&f,&p);
			//p--;
			//cout<<my.count(p)<<endl;
			//cout<<p;
			// cout<<"my.count="<<my.count(p)<<endl;
			if(my.count(p)==0){
				my[p]=pos++;
				//cout<<"my[p]="<<my[p]<<endl;
			}
			//cout<<"my.count="<<my.count(p)<<endl;
			//cout<<"my[p]="<<my[p]<<endl;
			//cout<<"pos="<<pos<<endl;
			v[my[p]].PB(MP(f,s));
		}
		/*for (int i = 1; i <= n; ++i)
		{
			v[i];
			
		}*/
		int ans = 0;
		//cout<<pos<<endl;
		for(int i=0;i<pos;i++)
		{
	    	ans += max_act_sel(v[i]);
		}
		printf("%d\n",ans);
	}
}