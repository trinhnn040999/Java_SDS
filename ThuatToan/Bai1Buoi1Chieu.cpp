//Liet ke cac xau nhi phan co do dai = n
#include <bits/stdc++.h>
using namespace std;
int n;
int x[100];
void solution(){
	for(int i=1;i<=n;i++) cout <<x[i];
	cout<< endl;
}
int check(int v, int k){
	return 1;
}
void Try(int k){
	for(int v=0;v<=1;v++){
		if(check(v,k)){
			x[k]=v;
			if(k==n) solution();
			else Try(k+1);
		}
	}
}

int main(){
	cin>>n;
	Try(1);
	return 0;
}
