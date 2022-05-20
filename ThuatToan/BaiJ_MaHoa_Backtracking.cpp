// Bai J backtracking
#include <bits/stdc++.h>
using namespace std;
int  A,B;
vector<int> a;
int p10[10];
int x[10];
int n;
long long S=0;
long long F[100];
//long long mu(int a, int x){
//	long long kq=1;
//	for(int i=1;i<=x;i++) kq= kq*a;
//	return kq;
//	}
 
void tinh_ket_qua(){
	if(S==B){
		for(int i=n-1; i>=0;i--){
			cout<<x[i]<<" ";
		}
		exit(0);
	}
}
 
void Try(int i){ //thu cac gia tri co the gan cho xk
if(i<0){
	tinh_ket_qua();
}else{
	long long mu=1;
		for(int v=0;v<=30;v++){
			x[i]=v;
			S+=p10[i]*mu;
			long long tmp =0;
			if(i>0) tmp=F[i-1];
			if(S+F[i-1]<=B)
			Try(i-1);
			S-=p10[i]*mu;
			mu*=a[i];
			if(S+mu>B) break;
}
}
}
 
int main(){
	cin>>A>>B;
	while(A>0){
		a.push_back(A%10);
		A/=10;
	}
	n=a.size();
	p10[0]=1;F[0]=1;
	for(int i=1; i<=9;i++){
		p10[i]= p10[i-1]*10;
		F[i]+=F[i-1]+p10[i];
	}
	
	
	Try(n-1);
	return 0;
}

