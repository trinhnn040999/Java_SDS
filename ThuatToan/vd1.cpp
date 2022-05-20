
#include <bits/stdc++.h>
using namespace std;
int n;
string a[151];
int x=0;

int main()
{
	cin>>n;
	for(int i=1; i<=n;i++){
		cin>>a[i];
	}
	for(int i=1; i<=n;i++){
		if(a[i][1]=='+'||a[i][2]=='+'||a[i][3]=='+') x++;
		if(a[i][1]=='-'||a[i][2]=='-'||a[i][3]=='-') x--;
	}
	cout<< x;
    return 0;
}
