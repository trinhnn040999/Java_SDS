
#include <bits/stdc++.h>
using namespace std;
const int  N= 101;
int m,n;
int F[N+1][N+1], a[N][N];



int main()
{
    cin >>m>>n;
    for(int i=1;i<=m;i++)
    for(int j=1;j<=n;j++)
    cin>>a[i][j];
    //Tinh cot thu n cua mang f
	for(int i=1; i<=m;i++){
		F[i][n]=a[i][n];
	}
	//dat bien cua f
	for(int j=1;j<=n;j++) F[0][j]=F[m+1][j]=-1e9;
	
	for(int j=n-1;j>=1;j--){
		for(int i=1;i<=m;i++)
		F[i][j]= a[i][j]+max(F[i][j+1], max(F[i-1][j+1], F[i+1][j+1]));
	}
	
	int ans=-1e9;
	for(int i=1; i<=m;i++){
		ans=max(ans, F[i][1]);
	}
	cout<<ans;
    return 0;
}
