//A. CONNECTED COMPONENTS Tim so thanh phan lien thong cua do thi
#include <bits/stdc++.h>
using namespace std;
const int N = 1e5+1;
int n,m; //so dinh, canh
vector<int> A[N];//A[v] is the list of adjacent nodes of v
bool visited[N];//visited[v]= true means that the note v has been visited
int dem;//dem so thanh phan lien thong
void input(){
scanf("%d%d", &n, &m);
for(int i=1;i<=m; i++){
    int u,v;
    scanf("%d%d", &u, &v);
    A[u].push_back(v);
    A[v].push_back(u);
}
}
void DFS(int u){
visited[u] =true;
for(int i=0;i<A[u].size();i++){
    int v = A[u][i];//v is an adjacent node of u
    if(!visited[v]){
        DFS(v);
    }
}
}

void solve(){
    for(int v=1;v<=n;v++) visited[v]=false;
    dem=0;
    for(int v=1;v<=n;v++){
        if(!visited[v]){
            dem+=1;
            DFS(v);
        }
    }
    cout<<dem;
}
int main(){
    input();
    solve();
    return 0;
    }

