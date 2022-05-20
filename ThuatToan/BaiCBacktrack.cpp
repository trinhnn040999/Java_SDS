//Bai toan liet ke hoan vi
#include <bits/stdc++.h>
using namespace std;
#define N 10
int n, m;
int dem=0;
int x[N], p[N];
int a[10], b[10];
bool mark[N];
void solution(){
	for (int i = 1; i <= n; ++i) p[x[i]] = i;
	for (int i = 1; i <= m; ++i){
		if (p[a[i]] > p[b[i]]) return;
	}
	for(int i=1;i<=n;i++) cout <<x[i]<<" ";
	cout<< "\n";
	++dem;
}
bool check(int v, int k){
	return mark[v] == false;
}
void Try(int k){ //thu cac gia tri co the gan cho xk
	for(int v=1;v<=n;v++){
		if(check(v,k)){
			x[k]=v;
			mark[v] =true;
			if(k==n) solution();
			else Try(k+1);
			mark[v] =false;
		}
	}
}

int main(){
	cin>>n>>m;
	for(int i=1;i<=m;i++){
		cin>>a[i]>>b[i];
	}
	Try(1);
	cout<<dem;
	return 0;
}
