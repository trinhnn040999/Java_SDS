#include <bits/stdc++.h>
using namespace std;
const int N = 100005;
vector<int> f[N];

int main(){
    int n,m;
    cin>>n>>m;
    for(int i=0;i<m;i++){
        int x,y;
        cin>>x>>y;
        f[x].push_back(y);
        f[y].push_back(x);
    }

    for(int i=1; i<=n;i++){
        sort(f[i].begin(), f[i].end());
        for(int j=0;j<f[i].size();j++){
            cout<<f[i][j]<<" ";
        }
        cout<<"\n";
    }
}

