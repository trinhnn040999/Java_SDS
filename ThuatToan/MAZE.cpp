//MAZE
//A. CONNECTED COMPONENTS Tim so thanh phan lien thong cua do thi
#include <bits/stdc++.h>
using namespace std;
const int N = 1000;
int m,n;
int a[N][N];
int start_row, start_col;
bool visited[N][N];
int dr[4]= {0,0,1,-1};
int dc[4]= {1,-1,0,0};
struct State{
    int row;
    int col;
    int steps;
    State(int _row,int _col, int _steps){
    row=_row; col=_col;steps=_steps;
    }
};
void input(){
    cin>>n>>m>>start_row>>start_col;
    for(int i=1;i<=n;i++)
        for(int j=1;j<=m;j++)
            cin>>a[i][j];

}


int solve(){
    for(int i=0;i<=n;i++)
        for(int j=0; j<=m;j++)
            visited[i][j]=false;
    queue<State> Q;
    Q.push(State(start_row, start_col,0));
    visited[start_row][start_col] =true;
    while(!Q.empty()){
        State cur_state = Q.front(); Q.pop();
        for(int k=0; k<4;k++){
            int new_row = cur_state.row+dr[k];
            int new_col = cur_state.col+dc[k];
            if(new_row<1|| new_row>n|| new_col<1|| new_col>m){
                return cur_state.steps+1;
            }
            if(a[new_row][new_col]==0 && !visited[new_row][new_col]){
                Q.push(State(new_row, new_col, cur_state.steps+1));
                visited[new_row][new_col] = true;
            }
        }
    }
}
int main(){
    input();
    int ans = solve();
    cout<<ans;
    return 0;
    }
