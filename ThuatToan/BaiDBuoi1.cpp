#include <bits/stdc++.h>
using namespace std;
int n;
const int N = 100005;
int dem=0;
int A[N];
int main(){
	cin>>n;
	for(int i=1;i<=n;i++){
		cin>> A[i];
	}
//	for(int i=0;i<N;i++){
//		if(i==0) cout<<0;
//		else{
//			for(int j=1;j<i;j++){
//				if(A[j]==A[i]) dem++;
//			}
//		if(dem==0) cout 0;
//		}
//		for(int j=2;j<i;j++)
//		if(A[j]==A[i]) dem++;
//	}
set<int> S;
for(int i=1;i<=n;i++){
		int x= A[i];
		if(S.count(x)){  //tim trong set co so x khong
			cout<<1<<"\n";
		}else{
			cout<<0<<"\n";
			S.insert(x);
		}
	}
}
