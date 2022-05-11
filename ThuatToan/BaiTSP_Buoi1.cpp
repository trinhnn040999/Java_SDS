//Bai toan nguoi di du lich
#include <bits/stdc++.h>
using namespace std;
#define N 20
int n;
int c[N][N];
bool mark[N];
int x[N];
int f; //khoang cach tich luy dc cua dg di dang xay dung
int f_min;//khoang cach ngan nhat
int Cm; //min-distance ò the matrix

void input(){
	cin>>n;
	for(int i=0;i<=n;i++){
		for(int j=0;j<=n;j++){
			cin>>c[i][j];
		if(i!=j && Cm > c[i][j]) Cm= c[i][j];
	}
		}
		
}
void solution(){//cap nhat ki luc
//for(int i=0;i<=n;i++) cout <<x[i]<<" "; cout<<"distance= "<< f+ c[x[n]][x[0]]<<endl;
	if(f+c[x[n]][x[0]]<f_min){
		f_min = f+ c[x[n]][x[0]];
	//	cout<<"update best"<<f_min<<endl;
	}
}
bool check(int v, int k){
	return mark[v] == false;
}
void Try(int k){ //thuwr cac gia tri co the gan cho xk
	for(int v=1;v<=n;v++){
		if(check(v,k)){
			x[k]=v;
			mark[v] =true; f= f+ c[x[k-1]][x[k]];
			if(k==n) solution();
			else {
				if(f+Cm*(n+1-k)<f_min)
				Try(k+1);
				
			}
			mark[v] =false; f= f- c[x[k-1]][x[k]];
		} 
	}
}
void solve(){
	for(int v=1;v<=n;v++) mark[v]=false;
	f=0;f_min=1e9;
	x[0]=0;
	Try(1);
	cout<<f_min;
}

int main(){
	input();
	solve();
	return 0;
}
