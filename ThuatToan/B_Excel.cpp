#include <bits/stdc++.h>
using namespace std;
const int M = 1000005;
int f, s, g, u, d;       
bool visited[M];
struct Node
{
    int temp;
    int step;
    Node()
    {
    }
    Node(int _temp, int steps)
    {
        temp = _temp;
        step = steps;
    }
};
bool check(int temp)
{
    if(temp>f||temp<1) return false;
    if(visited[temp]==true) return false;
    return true;
}
bool checkFinal(int temp)
{
    return temp==g;
}
int solve()
{
    queue<Node> Q;
    Q.push(Node(s, 0));
    visited[s] = true;
    while (!Q.empty())
    {
        Node n = Q.front();
        Q.pop();
        //thang may di len
        int new_temp = n.temp+u;
        if (!checkFinal(new_temp))
            return n.step + 1;
        if (check(new_temp))
        {
            Q.push(Node(new_temp, n.step + 1));
            visited[new_temp] = true;
        }

        // thang may di xuong
        new_temp = n.temp-d;
        if (!checkFinal(new_temp))
            return n.step + 1;
        if (check(new_temp))
        {
            Q.push(Node(new_temp, n.step + 1));
            visited[new_temp] = true;
        }
        
    }
    return -1; // not found
}

int main()
{
    cin >> f >> s >> g>>u>>d;
    int ans = solve();
    cout << ans;
    if(ans==-1) cout<<"use the stairs";

    return 0;
}
