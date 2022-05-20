
#include <bits/stdc++.h>
using namespace std;
int n, a[1002];
int save[1002];
bool mark[1002];
int start(int i)
{ // day con tang a[i]...
    if (mark[i])
        return save[i];
    if (i > n)
    {
        save[i] = 0;
        mark[i] = true;
        return 0;
    }
    int ans = 1;
    for (int j = i + 1; j <= n; j++)
        if (a[j] > a[i])
            ans = max(ans, 1 + start(j));
    save[i] = ans;
    mark[i] = true;
    return ans;
}

int main()
{
    cin >> n;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    int ans = 0;
    for (int i = 1; i <= n; i++)
        ans = max(ans, start(i));
    cout << ans;
    return 0;
}