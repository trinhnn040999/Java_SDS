#include <bits/stdc++.h>
#define SIZE 1005
using namespace std;
struct Cell
{
    int i, j;
};
vector<Cell> adj[SIZE][SIZE];
int n, m;
string s[SIZE];
bool visited[SIZE][SIZE];
vector<Cell> L;

void build_graph()
{
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (s[i][j] != '.')
            {
                int k = j;
                while (k < m - 1 && s[i][k + 1] != '.')
                    k++;
                for (int x = j, y = k; x < y; x++, y--)
                {
                    adj[i][x].push_back({i, y});
                    adj[i][y].push_back({i, x});
                }
                j = k;
            }
        }
    }
    for (int j = 0; j < m; j++)
    {
        for (int i = 0; i < n; i++)
        {
            if (s[i][j] != '.')
            {
                int k = i;
                while (k < n - 1 && s[k + 1][j] != '.')
                    k++;
                for (int x = j, y = k; x < y; x++, y--)
                {
                    adj[x][j].push_back({y, j});
                    adj[y][j].push_back({x, j});
                }
                i = k;
            }
        }
    }
}
void DFS(int i, int j)
{
    L.push_back({i, j});
    visited[i][j] = true;
    for (int t = 0; t < adj[i][j].size(); t++)
    {
        if (visited[adj[i][j][t].i][adj[i][j][t].j] == false)
        {
            DFS(adj[i][j][t].i, adj[i][j][t].j);
        }
    }
}
int main()
{
    cin >> n >> m;
    for (int i = 0; i < n; i++)
    {
        cin >> s[i];
    }
    build_graph();
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < m; j++)
        {
            if (visited[i][j] == false && s[i][j] != '.')
            {
                L.clear();
                DFS(i, j);
                char best_c;
                int best_code = 1000000000;
                for (char c = '0'; c <= '9'; c++)
                {
                    int cost = 0;
                    for (int t = 0; t < L.size(); t++)
                    {
                        cost += abs(s[L[t].i][L[t].j] - c);
                    }
                    if (cost < best_code)
                    {
                        best_code = cost;
                        best_c = c;
                    }
                }
                for (int t = 0; t < L.size(); t++)
                {
                    s[L[t].i][L[t].j] = best_c;
                }
            }
        }
    }
    for (int i = 0; i < n; i++)
    {
        cout << s[i] << endl;
    }
    return 0;
}