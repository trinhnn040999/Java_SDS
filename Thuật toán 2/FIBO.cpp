
#include <bits/stdc++.h>
using namespace std;
int n;
 int F[1000001];



int main()
{
    cin >>n;
    F[0]=1;F[1]=1;
    for(int i=2;i<=n;i++)
    F[i]=(F[i-1]+F[i-2])%1000000007;
    cout<<F[n];
    return 0;
}