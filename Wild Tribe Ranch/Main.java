/*1
Secondary School  Computer science  5 points
Florence is in Wild tribe ranch. Wild tribe ranch is Adventure Park for adults. Florence is in front of a live cave. The mouth of cave is like a pothole. The guideline of the park mentions the maximum weight of a person who can go through the mouth of the cave. If the candidate’s weight is just same as maximum weight, then the candidate might require to have a rope with them. Florence has to determine whether she will be able to get through the pothole or not. Can you help her?

The input should be the maximum weight and weight of Florence.

Case 1
Case 2
Case 3

Input (stdin)
Ask for details  Follow  Report by Anushag228 3 weeks ago
Answers
Anonyoums
Anonyoums  Expert
Answer:

maximum weight may be 79kgs

Explanation:

sorry if my ans is wrong

0.0
0 votes

THANKS 
0
Comments  Report
lokiprivate  Helping Hand
Answer:
*/
#include<iostream>

int main()

{

 int a,b;

 std::cin>>a;

 std::cin>>b;

 if(a>b)

 {

   std::cout<<"Yes, you can enter.";

 }

 else if(a==b)

 {

   std::cout<<"Yes, you can enter. Kindly use a rope.";

 }

 else

   std::cout<<"Sorry, you can't enter";

}