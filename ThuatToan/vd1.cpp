
#include <bits/stdc++.h>
using namespace std;
const int N = 1001;
const int INF = 1e9;
int c[N][N];
int n, m;
int s, t;
int d[N];
vector<int> A[N];
set<int> NonFixed;

void input()
{
    scanf("%d%d", &n, &m);
    for (int u = 1; u <= n; u++)
    {
        for (int v = 1; v <= n; v++)
            c[u][v] = INF;
    }
    for (int k = 1; k <= m; k++)
    {
        int u, v, w;
        scanf("%d%d%d", &u, &v, &w);
        c[u][v] = w;
        A[u].push_back(v);
    }
    scanf("%d%d", &s, &t);
}
int selectMIn()
{
    int minD = 1e9;
    int selectV = -1;
    for (set<int>::iterator it = NonFixed.begin(); it != NonFixed.end(); it++)
    {
        int v = *it;
        if (d[v] < minD)
        {
            minD = d[v];
            selectV = v;
        }
        return selectV;
    }
}
void solve()
{
    d[s] = 0;
    for (int v = 1; v <= n; v++)
        if (v != s)
            NonFixed.insert(v);
    for (int v = 1; v <= n; v++)
    {
        d[v] = c[s][v];
    }
    while (NonFixed.size() > 0)
    {
        int u = selectMIn();
        if (u == t)
            break;
        NonFixed.erase(u);
        for (set<int>::iterator it = NonFixed.begin(); it != NonFixed.end(); it++)
        {
            int v = *it;
            if (d[v] > d[u] + c[u][v])
            {
                d[v] = d[u] + c[u][v];
            }
        }
        cout << d[t] << endl;
    }
}

int main()
{
    input();
    solve();
}
