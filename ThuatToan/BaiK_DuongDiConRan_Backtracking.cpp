
#include <bits/stdc++.h>
using namespace std;

int A[10][10];
int di[4]={-1,0,1,0}; //dx[0]=-1, dx[1]=0, dx[3]=1, dx[4]=0
int dj[4] ={0,1,0,-1};//dy[0]=0
int so_buoc =0;

void dequy(int i, int j, int h){
	int _i= i+di[h];
	int _j= j+dj[h];
	if(A[_i][_j]==0){
		so_buoc++;
		A[i][j]=2;
		dequy(_i, _j,h);
	}
	if(A[_i][_j]==1){
		dequy(i,j,(h+3)%4);
	}
	if(A[_i][_j]==2) return;
}
 
main(){
	int n;
	cin>>n;
	for(int t=1; t<=n;t++){
		string s;
		cin>>s;
		int j=s[0]-'A'+1;
		int i=s[1]-'0';
		A[i][j]=1;
	}
	for(int i=0; i<=8;i++){
		A[0][i]= A[9][i]=A[i][0]=A[i][9]=1;
	}
	dequy(1,1,2);
	cout<<so_buoc;
	return 0;
}
