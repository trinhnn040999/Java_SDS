#include <bits/stdc++.h>
using namespace std;
#define N 30
const int N = 30; const int M=6;
int n,m;
int h[N];
vector<int> T[N];//T[i] la danh sach cac giao vien co the nhan khoa i
int A[N][N];
int x[N];
int load[N];
int load_min;
void input() {
	cin >> n>>m;
	for(int i=1;i<=n;i++)cin>>h[i];
	for(int i=1;i<=n;i++){
        int k;
        cin>>k;
        for(int j=1;j<=k;j++){
            int t;
            cin>>t;
            T[i].push_back(t);
        }
	}
	for(int i=1;i<=n;i++)
        for(int j=1;j<=n;j++) cin A[i][j];
}
void solution() {
	//compute max value of load[1,...,m]
	int max_value= -1e9;
	for(int i=1;i<=m;i++)
        max_value = max(max_value, load[i]);
        if(max_value<load_min){
            load_min = max_value;
        }
}
bool check(int v, int k) {
    for(int i=1;i<=k-1;i++){ //explore all courses that have been assigned
        if(x[i]==v && A[i][k]==1) return false;
    }
    return true;

}
void Try(int k) { //k is a course
	for(int i=0;i<T.size();i++){ //for v=1 ->m //explore all teacher in the list T
        if(check(v,k)){
            x[k]=v; //assign teacher v to course k
            load[v]+=h[k];

            if(k==n) solution();
            else Try(k+1);
            load[v]-=h[k];
        }
	}
}
void solve() {

}
for(int i=1;i<=m;i++) load[i]=0;
load_min=1e9;
Try(1);
cout<<load_min;

int main() {
	input();
	solve();
	return 0;
}

