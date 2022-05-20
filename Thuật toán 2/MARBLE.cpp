
#include <bits/stdc++.h>
using namespace std;
int W, H;
int dungduoc[606][606];

int dientichthua(int n, int m)
{
    if (dungduoc[n][m])
        return 0;
    int ans = 1e9;
    for (int x = 1; x < n; x++)
        ans = min(ans, dientichthua(x, m) + dientichthua(n - x, m));
    for (int y = 1; y < m; ++y)
        ans = min(ans, dientichthua(n, y) + dientichthua(n, m - y));
    return ans;
}

int main()
{
    cin >> W >> H;
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        int x, y;
        cin >> x >> y;
        dungduoc[x][y] = true;
    }
    cout << dientichthua(W, H);
    return 0;
}