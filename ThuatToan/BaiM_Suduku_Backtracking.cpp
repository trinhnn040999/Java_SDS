//Bai M Suduku
#include <bits/stdc++.h>
using namespace std;

int x[100], y[100], n, a[11][11];
void solution(){
	for(int i=1;i<=9;i++)
	for(int j=1; j<=9; j++) cout<<a[i][j]<<" \n"[j==9];
	exit(0);
}
bool check(int x, int y, int v)
{
    for(int t=1;t<=9;t++){
    	if(a[x][t]==v) return false;
	}
	
    for(int t=1;t<=9;t++){
    	if(a[t][y]==v) return false;
	}
	int x0=(x-1)/3*3;
	int y0= (y-1)/3*3;
	for(int i=1;i<=3;i++)
	for(int j=1;j<=3;j++){
		if(a[x0+i][y0+j]==v) return false;
	}
	return true;
}

void Try(int i){
	for(int v=1;v<=9;v++){
		if(check(x[i], y[i], v)){
			a[x[i]][y[i]]=v;
			if(i==n) solution();
			else Try(i+1);
			a[x[i]][y[i]]=0;
		}
	}
}

int main(){
	for(int i=1;i<=9;i++)
	for(int j=1;j<=9;j++){
		cin>>a[i][j];
		if(a[i][j]==0){
			++n;
			x[n]=i;
			y[n]=j;
		}
	}
	Try(1);
	return 0;
}
