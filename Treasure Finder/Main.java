/*Brainly.in
What is your question?


1
Secondary School  Computer science  5 points
Lucy and Tina are close friends. They both are studying in the same school. Now they are on their summer vacation. As they are bored, they ask their parents to take them to an exhibition. There Lucy and Tina play a game. In this game, there are three boxes with some number written on their top. There is a treasure in one of the three boxes and the treasure is present in the box with the second largest number on its top. Also, to open the box, they need to decode the correct code of this box. The clue given to them to find the code is that it is the largest number which divides all the three given numbers. So, now help Lucy and Tina to decode the code.
Ask for details  Follow  Report by Swethachowdary845 16.04.2020

Answers
jobastin
jobastin  Helping Hand
Answer:

#include<iostream>  

#include<algorithm>  

using namespace std;  

int main()  

{  

 int a,b,c;

 std::cin>>a>>b>>c;

 int sum=6;

 int gp=0,sp=0;

 //finding position of the largest number

 if(a>b && a>c)

  gp=1;

 else if(b>a && b>c)

  gp=2;

 else

  gp=3;

 //finding position of the smallest number

 if(a<b && a<c)

  sp=1;

 else if(b<a && b<c)

  sp=2;

 else

  sp=3;

int x=gp+sp;//adding the positon of largest and smallest number

int y=sum-x;//subustracting it from the positions total(1+2+3=6)

 switch(y)

 {

  case 1:std::cout<<"The treasure is in box which has number "<<a<<

   "\nThe code to open the box is 1";

 break;

 case 2:std::cout<<"The treasure is in box which has number "<<b<<

   "\nThe code to open the box is 2";

 break;

 case 3:

 std::cout<<"The treasure is in box which has number "<<c<<

   "\nThe code to open the box is 3";

 break;

}

return 0;  

}

Explanation:

3.7
10 votes

THANKS 
11
Comments  Report
noushin99882  Helping Hand
Answer:
*/
#include<iostream>

using namespace std;

main()

{

 int a,b,c,i,t,s1;

 cin>>a>>b>>c;

 if(a>b && a>c)

 {

   if(b>c){s1=b;}

   else{s1=c;}

 }

 else if(b>a && b>c){

   if(a>c){s1=a;}

   else{s1=c;}}

 else{if(a>b){s1=a;}

      else{s1=b;}

     }

 cout<<"The treasure is in box which has number "<<s1<<"\n";

 

 

 for(i=1;i<=5;i++){

   if(a%i==0 && b%i==0 && c%i==0){t=i;}}

 cout<<"The code to open the box is "<<t;

 

}