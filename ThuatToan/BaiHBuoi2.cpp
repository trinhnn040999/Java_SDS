
#include <bits/stdc++.h>
using namespace std;
int n,M, x[100];
int binary[25];
int dem=0;
int SA=0, SB=0;
 
void tinh_ket_qua(){
	if(SA+M==SB) dem++;
}
int tongconlai(int i){
	int tong=0;
	for(int j=i+1;j<=n;j++){
		tong+=x[j];
	}
	return tong;
}
void TRY(int i){
	if(i>n){
		tinh_ket_qua();
	}else{
		for(int v=0;v<=2;v++){
			binary[i]=v;
			if(v==1) SA+=x[i];
			if(v==2) SB+=x[i];
			int chenh= abs(SA+M-SB);
			if(chenh<=tongconlai(i)) TRY(i+1);
		if(v==1) SA-=x[i];
			if(v==2) SB-=x[i];
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
