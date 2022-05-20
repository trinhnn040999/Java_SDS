#include <bits/stdc++.h>
using namespace std;
int n,m;
bool f[25][25];
int binary[25];
int kq=100000;

bool checkdoclap(vector<int> S){
	for(int u:S){
		for(int v:S){
			if(f[u][v]==1){
				return false;
			}
		}
	}
	return true;
}

bool checkcucdai(vector<int> S){
	for(int i=1;i<=n;i++){
		if(binary[i] == 0){
			S.push_back(i);
			if(checkdoclap(S)){
				return false;
			}
			S.pop_back();
			binary[i] = 0;
		}
	}
	return true;
}

void tinh_ket_qua(){
	vector<int> S;
	for(int i=1;i<=n;i++){
		if(binary[i]==1){
			S.push_back(i);
		}
	}
	if(checkdoclap(S)){
		if(checkcucdai(S)){
			kq = min(kq, (int)S.size());
		}
	}
}
void TRY(int i){
	if(i>n){
		tinh_ket_qua();
	}else{
		binary[i] = 1;
		TRY(i+1);
		binary[i] = 0;
		TRY(i+1);
	}
}
main(){
	cin>>n>>m;
	for(int i=1;i<=m;i++){
		int u,v;
		cin>>u>>v;
		f[u][v]=f[v][u]=1;
	}
	TRY(1);
	cout<<kq;
	return 0;
}
