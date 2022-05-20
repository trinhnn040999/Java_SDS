//Liet ke cac xau nhi phan co do dai = n
#include<bits/stdc++.h>
using namespace std;
const int N = 100;
int n,m;
int x[N]; ans=10000, c[100][100];
void solution(){
	if(!independent()) return;
	if(!maximal()) return;
	if(m<ans) ans=m;
}

bool independent(){
	for(i=1;i<=m;i++)
	for(int j=1;j<i;j++) if(c[x(i)][x(j)]) return false;
	return true;
	}
	
bool maximal(){
	return m==2;
}
bool check(int v, int k){
return v>x[k-1];
}

void Try(int k){
	for(int v=1;v<=n;v++){
		if(check(v,k)){
			x[k]=v;
			m=k;
			solution();
			if(v<n) Try(k+1);
		}
	}
}

int main(){
	cin >> n;
	int E;
	cin>>E;
	for(int i=1;i<=E;i++){
		int x,y;
		cin>>x>>y;
		c[x][y]=1;
		c[y][x]=1;
	}
	Try(1);
	cout<<ans;
	return 0;
}
