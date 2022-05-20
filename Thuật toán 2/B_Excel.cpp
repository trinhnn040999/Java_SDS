#include <bits/stdc++.h>
using namespace std;
#define SIZE 105
string matrix[SIZE][SIZE];
int a[SIZE][SIZE];
int n, m;
bool visited[SIZE][SIZE];
int stoi1(string s)
{
    int num = 0;
    for (int i = 0; i < s.size(); i++)
    {
        num = num * 10 + s[i] - '0';
    }
    return num;
}

void DFS(int i, int j)
{
    if (visited[i][j] == true)
        return;
    visited[i][j] = true;
    if (matrix[i][j][0] == '=') // kiem tra xem o (i,j) co phai bthuc k
    {
        vector<string> cells;
        string s = "";
        for (int t = 1; t < matrix[i][j].size(); t++)
        {
            if (matrix[i][j][t] == '+')
            {
                cells.push_back(s);
                s = "";
            }
            else
            {
                s += matrix[i][j][t];
            }
        }
        cells.push_back(s);
        a[i][j] = 0;
        for (int t = 0; t < cells.size(); t++)
        {
            s = cells[t];
            string si = "";
            string sj = "";
            for (int f = 0; f < s.size(); f++)
            {
                if (isdigit(s[f]))
                    si += s[f];
                else
                    sj += s[f];
            }
            int _i, _j;
            if (sj.size() == 1)
            {
                _j = sj[0] - 'A' + 1;
            }
            else
            {
                _j = (sj[0] - 'A' + 1) * 26 + (sj[1] - 'A' + 1);
            }
            _i = stoi1(si);
            DFS(_i, _j);
            a[i][j] += a[_i][_j];
            ;
        }
    }
    else
    {
        a[i][j] = stoi(matrix[i][j]);
    }
}

int main()
{
    cin >> n >> m;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            cin >> matrix[i][j];
        }
    }
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= m; j++)
        {
            DFS(i, j);
            cout << a[i][j] << " ";
        }
        cout << "\n";
    }

    return 0;
}