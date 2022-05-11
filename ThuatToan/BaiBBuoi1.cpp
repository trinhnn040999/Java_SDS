#include <bits/stdc++.h>
using namespace std;
string s;
int  main(){
	cin>>s;
	stack<char> st;
	for(int i=0; i<s.size(); i++){
		if(s[i]=='['||s[i]=='{'||s[i]=='('){
			st.push(s[i]);
		}else{
			if(st.empty()){
				cout<<0;
				return 0;
			}
			char last=st.top();//lay gia tri cua phan tu cuoi cung
			st.pop(); //xoa phan tu cuoi cung trong stack
			if(s[i]==']'&& last!='['){
				cout<<0;
				return 0;
			}
				if(s[i]=='}'&& last!='{'){
				cout<<0;
				return 0;
			}
				if(s[i]==')'&& last!='('){
				cout<<0;
				return 0;
			}
		}
	}
	if(st.empty()){
		cout<<1;
	}else cout<<0;//({})
	
}
