#include <bits/stdc++.h>
using namespace std;
const int N = 45;
int n,M, x[N];
int binary[N];
int dem=0;
 int S=0;
 
void tinh_ket_qua(){
	if(S<=M) dem++;
}
void TRY(int i){
	if(i>n){
		tinh_ket_qua();
	}else{
		for(int v=0;v<=2;v++){
			binary[i]=v;
			S+=v*x[i];
			if(S<=M) TRY(i+1);
			S-=v*x[i];
		}
	}
}
main(){
	cin>>n>>M;
	for(int i=1;i<=n;i++){
		cin>>x[i];
	}
	TRY(1);
	cout<<dem;
	return 0;
}
