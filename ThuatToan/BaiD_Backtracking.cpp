// Bai D backtracking
#include <bits/stdc++.h>
using namespace std;
int n,M;
int x[100];
int a[20];
int T=0;
int dem=0;

void input(){
	cin>>n>>M;
	for(int i=1;i<=n;i++){
		cin>> a[i];
	}	
	
}
bool check(int v, int k){
	if(k==n) return T+a[n]*v==M;
	else return true; 
}
void Try(int k){ //thu cac gia tri co the gan cho xk
	for(int v=1;v<=M-T;v++){
		if(check(v,k)){
			x[k]=v;
			T=T+a[k]*x[k];//cap nhat T tang dan
			if(k==n) dem++;
			else Try(k+1);
			T=T-a[k]*x[k];
		}
	}
}

int main(){
	input();
	Try(1);
	cout<<dem;
	return 0;
}
