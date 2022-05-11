#include <bits/stdc++.h>
using namespace std;
	const int N= 100005;
	int n;
	int A[N];
	int B[N];
	
int  main(){
	cin >>n;
	for(int i=1;i<=n;i++){
		cin>>A[i];
	}
	for(int i=1;i<=n;i++){
		cin>>B[i];
	}
	queue<int> Q;
	for(int i=1;i<=n;i++){
		Q.push(A[i]);
	}
	int dem=0;
	for(int i=1;i<=n;i++){
		while(Q.front()!=B[i]){
			int x= Q.front();
			Q.pop();  //Pop trong queue xoa phan tu dau tien
			Q.push(x);
			dem++;
		}
		dem++;
		Q.pop();
	}
	cout<<dem;
}
