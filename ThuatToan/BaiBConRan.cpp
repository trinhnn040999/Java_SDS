
#include <bits/stdc++.h>
using namespace std;
const int CoVatCan =1;
const int DaDiQua=2;
const int TuDo=0;
int dx[]={-1,0,1,0};
int dy[]={0,1,0,-1};
int A[10][10];
int doDaiHienTai, doDaiTotNhat;
int doDaiCoTheDi(int x, int y, int h){
	int kq=0;
	while(A[x+dx[h]][y+dy[h]]==TuDo){
		kq++;
		x+=dx[h];
		y+=dy[h];
	}
	return kq;
}

void loiGiai(){
	if(doDaiHienTai>doDaiTotNhat)
	doDaiTotNhat= doDaiHienTai;
}

void deQuy(int x, int y, int h){
	int _x=x+dx[h], _y=y+dy[h];
	if(A[_x][_y]==DaDiQua){
		loiGiai();
		return;
	}
	for(int _h:{(h+3)%4, (h+1)*4}){
		int L= doDaiCoTheDi(x,y,_h);
		if(L==0) continue;
		//danh dau
		for(int i=1;i<=L;i++)
		A[x+i*dx[_h]][y+i*dy[_h]]= DaDiQua;
		doDaiHienTai+=L;
		deQuy(x+L*dx[_h], y+L*dy[_h], _h);
		for(int i=1;i<=L;i++)
			A[x+i*dx[_h]][y+i*dy[_h]]= TuDo;
		//goi de quy
		//xoa danh dau
	}
	loiGiai();
}
 
main(){
	int n;
	cin>>n;
	for(int t=1; t<=n;t++){
		string s;
		int x,y;
		cin>>x>>y;
		A[s[0]-'A'+1][s[1]-'0']= CoVatCan;
	}
	for(int i=0; i<=9;i++){
		A[0][i]= A[9][i]=A[i][0]=A[i][9]=CoVatCan;
	}
	int L= doDaiCoTheDi(1,1,2);
	for(int i=0;i<=L;i++) A[1+dx[h]*i][1+dy[h]*i]=DaDiQua;
	doDaiHienTai=L;
	deQuy(x+dx[h]*L,2);
	cout<<doDaiTotNhat;
	return 0;
}
