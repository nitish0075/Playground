#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string s;
  	getline(cin,s);
  	int i;
  	cout<<"Floating part is : ";
  	while(s[i++]!='.'&& s[i]!='\0');
  	while(s[i] != '\0'){
      cout<<s[i++];
    }
}