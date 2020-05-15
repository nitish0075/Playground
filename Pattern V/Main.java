#include<iostream>
int main()
{
  int num,i,j,space,l,r;
  std::cin>>num;
  l=1;
  r=num*num+1;
  for (i = num; i > 0; i--) { 
  
        // To print number of spaces  
        for (space = num; space > i; space--) 
            std::cout << "--"; 
  
        for (j = 1; j <= i; j++) { 
            std::cout << l; 
            std::cout << "*"; 
            l++; 
        } 
        for (j = 1; j <= i; j++) { 
            std::cout << r; 
            if (j < i) 
                std::cout<<"*"; 
            r++; 
        } 
  
        // To get the next term on RHS of the Pattern  
        r = r - (i - 1) * 2 - 1; 
        std::cout <<"\n"; 
    } 
}