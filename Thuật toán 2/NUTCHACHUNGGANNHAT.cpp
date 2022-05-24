// K. Nut cha chung gan nhat
#include <bits/stdc++.h>
using namespace std;
const int N = 10005;
int n, root, x, y;
vector<int> E[N];
bool visited[N];
int d[N];
int cha[N];
void input()
{
    cin >> n >> root;
    for (int i = 1; i <= n - 1; i++)
    {
        int u, v;
        cin >> u >> v;
        E[u].push_back(v);
        E[v].push_back(u);
    }
    cin >> x >> y;
}
void BFS()
{
    queue<int> Q;
    Q.push(root);
    visited[root] = true;
    d[root] = 0;
    while (!Q.empty())
    {
        int u = Q.front();
        Q.pop();
        for (int v : E[u])
        {
            if (visited[v] == false)
            {
                visited[v] = true;
                Q.push(v);
                d[v] = d[u] + 1;
                cha[v] = u;
            }
        }
    }
}
void solve()
{
    if (d[x] > d[y])
    {
        swap(x, y);
    }
    while (d[y] > d[x])
        y = cha[y];
    while (x !y)
    {
        x = cha[x];
        y = cha[y];
    }
    cout << x;
}

int main()
{
    input();
    BFS();
    solve();
    return 0;
}
