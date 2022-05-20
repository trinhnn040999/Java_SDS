#include <bits/stdc++.h>
using namespace std;
int n,M;
int x[100];
int T, dem=0;

bool check(int v, int k){
	if(k==n) return T+v==M;
	else return true; 
}
void Try(int k){ //thu cac gia tri co the gan cho xk
	for(int v=0;v<=M-T-(n-k);v++){
		if(check(v,k)){
			x[k]=v;
			T=T+x[k];//cap nhat T tang dan
			if(k==n) {
			dem++;
			}
			else Try(k+1);
			T=T-x[k];
		}
	}
}

int main(){
	cin>>M>>n;
	T=0;
	Try(1);
	cout<<dem;
	return 0;
}
