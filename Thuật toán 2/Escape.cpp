#include <bits/stdc++.h>
using namespace std;
const int SIZE = 1005;
int m, N;
int A[SIZE][SIZE];
bool visited[SIZE][SIZE];

struct Node
{
    int x, y;
    Node(){
    	
	}
    Node(int _x, int _y)
    {
        x = _x;
        y = _y;
    };
};


vector<Node> Cells[SIZE*SIZE];

void input()
{
    cin >> m >> N;
    for (int i = 1; i <= m; i++)
        for (int j = 1; j <= N; j++){
        	 cin >> A[i][j];
            Cells[A[i][j]].push_back(Node(i,j));
		}
           
}
    int solve()
    {
        queue<Node> Q;
        Q.push(Node(m, N));
        visited[m][N] = true;
        while (!Q.empty())
        {
            Node n = Q.front();
            Q.pop();

            if (n.x == 1 && n.y == 1)
                return 1;
            for(int t=0; t<Cells[n.x*n.y].size();t++){
            	Node v = Cells[n.x*n.y][t];
            	int a= v.x;
            	int b= v.y;
            	if (visited[a][b] == false){
            		 Q.push(Node(a, b));
                    visited[a][b] = true;
				}
                       	
			}
                    
    	}
           
        return -1; // not found
    }

    int main()
    {
    	ios_base::sync_with_stdio(0);
    	cin.tie(0);
        input();

        int ans = solve();
        if (ans == 1)
            cout << "yes";
        else
            cout << "no";

        return 0;
    }