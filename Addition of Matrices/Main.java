/******************************************************************************

                            Online C Compiler.
                Code, Compile, Run and Debug C program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <stdio.h>
int main()
{
   // Try out your code here
  int r,c,i,j,a1[100][100],a2[100][100],sum[100][100];
  scanf("%d",&r);
  scanf("%d",&c);
  for(i=0;i<r;++i){
    for(j=0;j<c;++j){
      scanf("%d",&a1[i][j]);
    }
  } 
  for(i=0;i<r;++i){
    for(j=0;j<c;++j){
      scanf("%d",&a2[i][j]);
    }
  }
  for(i=0;i<r;++i){
    for(j=0;j<c;++j){
      sum[i][j]=a1[i][j]+a2[i][j];
    }
  } 
 for(i=0;i<r;++i){
    for(j=0;j<c;++j){
      printf("%d ",sum[i][j]);
      if(j==c-1){
        printf("\n");
      }
    }
 }  
}