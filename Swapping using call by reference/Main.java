#include <iostream>
using namespace std;

int main()
{
    int a, b, temp;
	cin>>a>>b;
    cout << "Before swapping a= " << a << " and b=" << b;

    temp = a;
    a = b;
    b = temp;

    cout<<"\nAfter swapping a= "<< a<<" and b="<<b;
    return 0;
}