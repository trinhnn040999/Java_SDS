//Bai G cach khac
#include <bits/stdc++.h>
using namespace std;
int n,h;
int x[100];
void solution(){
	int dem = 0;
	for (int i = 1; i <= n; ++i) dem += x[i];
	if (dem != h) return;
	
	for(int i=1;i<=n;i++) {
		
		if(x[i]==1) cout<<i<<' ';
	}
	cout<< endl;
}
int check(int v, int k){
	return 1;
}
void Try(int k){
	for(int v=1;v>=0;v--){
		if(check(v,k)){
			x[k]=v;
			if(k==n) solution();
			else Try(k+1);
		}
	}
}

int main(){
	cin>>n>>h;
	Try(1);
	return 0;
}
