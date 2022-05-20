
#include <bits/stdc++.h>
using namespace std;
const int N= 101;
int m,n;
int F[N][N], a[N][N];



int main()
{
    cin >>m>>n;
    for(int i=1;i<=m;i++)
    for(int j=1;j<=n;j++)
    cin>>a[i][j];
	for(int t=1; t<=m;t++){
		F[t][n]=a[t][n];
	}
	for(int t=n-1;t>=1;t--){
		for(int i=1;i<=m;i++)
		F[t][i]= a[t][i]+max(F[t][i+1], max( F[t-1][i+1], F[t-1][i+1]));
	}
	int max=0;
	for(int i=1; i<=m;i++){
		cout<< F[i][m];
	}
    return 0;
}
