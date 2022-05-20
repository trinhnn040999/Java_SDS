
#include <bits/stdc++.h>
using namespace std;
const int N = 8;
int n;
int start_row, start_col;
bool visited[N][N];
int ans = 0;
int dr[8] = {-2, -2, -1, -1, 1, 1, 2, 2};
int dc[8] = {-1, 1, -2, 2, -2, 2, -1, 1};
struct Node
{
    int row;
    int col;
    Node()
    {
    }
    Node(int _row, int _col)
    {
        row = _row;
        col = _col;
    }
};
Node x[N * N];

void input()
{
    cin >> n >> start_row >> start_col;
}
void solution()
{
    ans = 1;
}

bool check(int new_row, int new_col)
{
    if (visited[new_row][new_col] == true)
        return false;
    if (new_row > n || new_row <= 0)
        return false;
    if (new_col > n || new_col <= 0)
        return false;
    return true;
}

void DFS(int k)
{
    if (ans == 1)
        return;
    for (int i = 0; i <= 7; i++)
    {
        int new_row = x[k - 1].row + dr[i];
        int new_col = x[k - 1].col + dc[i];
        if (check(new_row, new_col))
        {
            x[k] = Node(new_row, new_col);
            visited[new_row][new_col] = true;
            if (k == n * n)
                solution();
            else
                DFS(k + 1);
            visited[new_row][new_col] = false;
        }
    }
}
int main()
{
    for (int r = 1; r <= n; r++)
        for (int c = 1; c <= n; c++)
            visited[r][c] = false;

    input();
    x[1] = Node(start_row, start_col);
    visited[start_row][start_col] = true;
    DFS(2);
    cout << ans;
    return 0;
}