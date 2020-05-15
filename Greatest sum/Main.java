/*Brainly.in
What is your question?


1
Secondary School  Computer science  5 points
Seenu have a fruit shop and arranged the some set of fruits in column and row wise. Seenu needs to find the total number of fruits in each rows. Help him to find out.

INPUT & OUTPUT FORMAT:

Input consists of 2 integers and 1 2D-array. Integers correspond to the size of rows and columns.

SAMPLE INPUT & OUTPUT:

3

3

1 2 3

7 3 1

7 4 1

6

11

12

Ask for details  Follow  Report by Sahilss0410 1 week ago
Answers
rohan9370
rohan9370  Ace
Answer:

42

829

101

001

row wise. Seenu needs to find the total number of fruits.therefore

row wise. Seenu needs to find the total number of fruitarians 910

0.0
0 votes

THANKS 
0
Comments  Report
THE BRAINLIEST ANSWER!
mayankpathak4513
mayankpathak4513  Helping Hand
Answer:
*/
#include<iostream>

using namespace std;

int main()

{

   int m, n, row, col, sum = 0, row_ind = 0, col_ind = 0;

   std::cin >> m >> n;

   int row_arr[m];

   int i, j;

   int mat[m][n];

   for(i = 0; i < m; i++)

   {

       for(j = 0; j < n; j++)

           std::cin >> mat[i][j];

   }

   int z = 0;

   std::cout <<"Sum of rows is ";

   for(row=0; row<m; row++)

   {

       sum = 0;

       for(col=0; col<n; col++)

       {

           sum += mat[row][col];

       }

       std::cout << sum << " ";

       row_arr[z++] = sum;

   }

   int temp_row = row_arr[0];

   for(i=1;i<m;i++)

   {

       if(temp_row < row_arr[i])

       {

           temp_row = row_arr[i];

           row_ind = i;

       }

   }

   std::cout << "\nRow " << row_ind + 1 << " has maximum sum ";

   std::cout << "\nSum of columns is ";

   sum = 0;

   int y = 0;

   int col_arr[n];

   for (i = 0; i < n; ++i)

   {

       sum = 0;

       for (j = 0; j < m; ++j)

       {

           sum = sum + mat[j][i];

       }

       std::cout << sum << " " ;

       col_arr[y++] = sum;

   }

   int temp_col = col_arr[0];

   for(i=1;i<n;i++)

   {

       if(temp_col < col_arr[i])

       {

           temp_col = col_arr[i];

           col_ind = i;

       }

   }

   std::cout << "\nColumn " << col_ind + 1 << " has maximum sum ";

   return 0;

}