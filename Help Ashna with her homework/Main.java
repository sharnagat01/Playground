#include <iostream>
using namespace std;
int main()
{
int a,b,c;
std::cin>>a>>b>>c;
c = a + b;
std::cout << "a+b=" << (a+b) << endl ;
c = a - b;
std::cout << "a-b=" << (a-b) << endl ;
c = a * b;
std::cout << "a*b=" << (a*b) << endl ;
c = a / b;
std::cout << "a/b=" << (a/b) << endl ;
c = a % b;
std::cout << "a%b=" << (a%b) << endl ;
return 0;
}

