//A. CONNECTED COMPONENTS Tim so thanh phan lien thong cua do thi
#include <bits/stdc++.h>
using namespace std;
const int N = 1000;
int n;
int a[N][N];
int canh=0;
void input(){
cin>>n;
for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++)
            cin>>a[i][j];
}


int solve(){
    for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(a[i][j]==a[j][i]==1)
			{
				canh+=1;
			}
		}
	}
	return canh;
}
int main(){
    input();
    solve();
    int as=canh;
    cout<<canh;
    return 0;
    }

