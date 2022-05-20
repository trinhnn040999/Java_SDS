#include <bits/stdc++.h>
using namespace std;
#define N 30
int n,t;
int c[N][N];
bool visited[N];
int x[N];
int nb, kc;
int kc_min;
int Cm;

void input() {
	cin >> n>>t;
	Cm=1e9;
	for (int i = 0; i <= 2*n; i++) {
		for (int j = 0; j <= 2*n; j++){
				cin >> c[i][j];
			if(i!= j && Cm>c[i][j]) Cm=c[i][j];
		}
		
	}
}
void solution() {
	if (kc + c[x[2*n]][x[0]]<kc_min) {
		kc_min = kc + c[x[2*n]][x[0]];
	}
}


bool check(int v, int k) {
	if (visited[v] == true) return false;
	if (v <= n) {
		if (visited[v + n] == true) return false;
		if (nb >= t) return false;
	}
	else {
		if (visited[v - n] == false) return false;
	}
	return true;
}
void Try(int k) { //thu cac gia tri co the gan cho xk
	for (int v = 1; v <= 2*n; v++) {
		if (check(v, k)) {
			x[k] = v;
			visited[v] = true; 
			kc = kc + c[x[k - 1]][x[k]];
			if (v <= n) nb += 1; else nb -= 1;
			if (k == 2*n) solution();
			else {
			    if(kc+Cm*(2*n+1-k)<kc_min)
                    Try(k + 1);}
			if (v <= n) nb -= 1; else nb += 1;
			visited[v] = false; 
			kc = kc - c[x[k - 1]][x[k]];
		}
	}
}
void solve() {
	for (int v = 1; v <= 2*n; v++) visited[v] = false;
	kc = 0; kc_min = 1e9;
	x[0] = 0;
	Try(1);
	cout << kc_min;
}


int main() {
	input();
	solve();
	return 0;
}

