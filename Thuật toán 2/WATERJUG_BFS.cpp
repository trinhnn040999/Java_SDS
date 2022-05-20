#include <bits/stdc++.h>
using namespace std;
const int M = 1000;
int a, b, c;
bool visited[M][M];
struct Node
{
    int x, y;
    int step;
    Node()
    {
    }
    Node(int _x, int _y, int steps)
    {
        x = _x;
        y = _y;
        step = steps;
    }
};
bool check(int x, int y)
{
    return !visited[x][y];
}
bool checkFinal(int x, int y)
{
    return x == c || y == c;
}
void solve()
{
    queue<Node> Q;
    Q.push(Node(0, 0, 0));
    visited[0][0] = true;
    while (!Q.empty())
    {
        Node n = Q.front();
        Q.pop();
        int new_x = 0;
        int new_y = n.y;
        if (checkFinal(new_x, new_y))
            return n.step + 1;
        if (check(new_x, new_y))
        {
            Q.push(Node(new_x, new_y, n.step + 1));
            visited[new_x][new_y] = true;
        }

        // do nuoc tu coc 2 ra ngoai
        int new_x = n.x;
        int new_y = 0;
        if (checkFinal(new_x, new_y))
            return n.step + 1;
        if (check(new_x, new_y))
        {
            Q.push(Node(new_x, new_y, n.step + 1));
            visited[new_x][new_y] = true;
        }
        // do nuoc tu coc 1 sang coc 2
        if (n.x + n.y > b)
        {
            new_x = n.x + n.y - b;
            new_y = b;
        }
        else
        {
            new_x = 0;
            new_y = n.x + n.y;
        }
        if (checkFinal(new_x, new_y))
            return n.step + 1;
        if (check(new_x, new_y))
        {
            Q.push(Node(new_x, new_y, n.step + 1));
            visited[new_x][new_y] = true;
        }
        // do nuoc tu coc 2 sang coc 1
        if (n.x + n.y > a)
        {
            new_x = a;
            new_y = n.x + n.y - a;
        }
        else
        {
            new_x = n.x + n.y;
            new_y = 0;
        }
        if (checkFinal(new_x, new_y))
            return n.step + 1;
        if (check(new_x, new_y))
        {
            Q.push(Node(new_x, new_y, n.step + 1));
            visited[new_x][new_y] = true;
        }
        // do nuoc vao day coc 1
        new_x = a;
        new_y = n.y;
        if (checkFinal(new_x, new_y))
            return n.step + 1;
        if (check(new_x, new_y))
        {
            Q.push(Node(new_x, new_y, n.step + 1));
            visited[new_x][new_y] = true;
        }
        // do nuoc vao day coc 2
        new_x = n.x;
        new_y = b;
        if (checkFinal(new_x, new_y))
            return n.step + 1;
        if (check(new_x, new_y))
        {
            Q.push(Node(new_x, new_y, n.step + 1));
            visited[new_x][new_y] = true;
        }
    }
    return -1; // not found
}

int main()
{
    cin >> a >> b >> c;
    int ans = solve();
    cout << ans;

    return 0;
}