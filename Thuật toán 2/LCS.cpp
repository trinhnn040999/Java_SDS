
#include <bits/stdc++.h>
using namespace std;
int n, a[1002], m, b[1002];
int save[1002][1002];
bool mark[1002][1002];

int dp(int sa, int sb)
{
    if(mark[sa][sb]) return save[sa][sb];
    if (sa > n || sb > m){
        save[sa][sb]=0;
        mark[sa][sb]=true;
        return 0;
    }
       
    int ans = 0;
    if (a[sa] == b[sb])
        ans = 1 + dp(sa + 1, sb + 1);
    ans = max(ans, dp(sa + 1, sb));//khong lay a[sa]
    ans = max(ans, dp(sa, sb + 1));//khong lay b[sb]
    save[sa][sb]=ans;
    mark[sa][sb]=true;
    return ans;
}

int main()
{
    cin >> n;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    cin >> m;
    for (int i = 1; i <= m; i++)
        cin >> b[i];
    cout << dp(1, 1);
    return 0;
}