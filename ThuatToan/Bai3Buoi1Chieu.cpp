//Bai toan liet ke hoan vi
#include <bits/stdc++.h>
using namespace std;
#define N 100
int n;
int x[N];
bool mark[N];
void solution(){
	for(int i=1;i<=n;i++) cout <<x[i];
	cout<< endl;
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
	cin>>n;
	Try(1);
	return 0;
}
