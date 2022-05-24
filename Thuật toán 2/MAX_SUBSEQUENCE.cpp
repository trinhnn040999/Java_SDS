
#include <bits/stdc++.h>
using namespace std;
const long long N = 1000005;
long long n;
long long a[N];
long long S[N];

void input()
{
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cin >> a[i];
    }
}

void solve()
{
    S[1] = a[1];
    for (int i = 2; i <= n; i++)
        S[i] = max(S[i - 1] + a[i], a[i]);
    long long ans = -1e9;
    for (int i = 1; i <= n; i++)
    {
        ans = max(ans, S[i]);
    }
    cout << ans;
}

int main()
{
    input();
    solve();

    return 0;
}