
#include <bits/stdc++.h>
using namespace std;
const long long N= 1000001;
long long n;
long long F[N], a[N],b[N];



int main()
{
    cin >>n;
    for(int i=1;i<=n;i++){
    cin>>a[i]>>b[i];	
	}
	F[n]=a[n];
	F[n-1]= min(a[n]+a[n-1],b[n]);
    for(int i=n;i>=1;i--){
    	F[i]=min(F[i+1]+a[i], F[i+2]+b[i]);
	}
    
    cout<<F[1];
    return 0;
}