#include <bits/stdc++.h>
using namespace std;
int n;
const int N = 100005;
int A[N];
int dem[N];
map<int,int> dem;

int main(){
	cin>>n;
	cout<<A[0];
	for(int i=1;i<=n;i++){
		cin>> A[i];
	}
	for(int i=1;i<=n;i++){
		cout<<dem[A[i]]<<"\n";
		dem[A[i]]++;
		
	}
}
