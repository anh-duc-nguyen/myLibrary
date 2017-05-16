/*
problem 12.13 in How to program in C eighth edition
this is a program implement Stack data structure
@author : Anh Nguyen
@version Mar 6 2017
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define EXPRESSION_MAX_LEN 256
#define OPERATION_NUM 6
struct stackNode {
  int data;
  struct stackNode *nextPtr;
};
typedef struct stackNode StackNode;
typedef StackNode  *StackNodePtr;
//prototype
void push(StackNodePtr *topPtr, int info);
int pop(StackNodePtr *topPtr);
int isEmpty(StackNodePtr topPtr);
int evaluatePostfiixExpression(char *expr);
int addition ( int x, int y);
int subtraction( int x, int y);
int multiplication ( int x, int y);
int division ( int x, int y);
int exponetiation ( int x, int y);
int remain ( int x, int y);

void push(StackNodePtr *topPtr, int info){
  StackNodePtr newPtr = malloc(sizeof(StackNode));

  if(newPtr != NULL){
    newPtr -> data = info;
    newPtr->nextPtr = *topPtr;
    *topPtr = newPtr;
  }
  else{
    printf("%d not inserted. no memmory available. \n",info);
  }
}

int pop(StackNodePtr *topPtr){
  StackNodePtr tmpPtr = *topPtr;
  int popValue = (*topPtr)->data;
  *topPtr = (*topPtr)->nextPtr;
  free(tmpPtr);
  return popValue;
}
				 
int isEmpty(StackNodePtr topPtr){
  return topPtr == NULL;
}

int evaluatePostfixExpression(char exp[]){
  StackNodePtr stackPtr  = NULL;
  int result,i = 0;
  char x, y;
  int (*f[OPERATION_NUM])(int x, int y)={ addition , subtraction, multiplication ,
					  division , exponetiation ,remain  };
  while (i < strlen(exp)){
    if (isdigit(exp[i])){
	push(&stackPtr, exp[i]);
      } else {
	x = pop(&stackPtr);
	y = pop(&stackPtr);
	switch(exp[i]){
	case '+':
	  result = (*f[0])((int)x,(int)y);
	  break;
	case '-':
	  result = (*f[1])((int)x,(int)y);
	  break;
	case '*':
	  result = (*f[2])((int)x,(int)y);
	  break;
	case '/':
	  result = (*f[3])((int)x,(int)y);
	  break;
	case '^':
	  result = (*f[4])((int)x,(int)y);
	  break;
	case '%':
	  result = (*f[5])((int)x,(int)y);
	  break;
	}
	push(&stackPtr, result);
      }
      i++;
      }
    pop(&stackPtr);
}

int main(){
  printf("Enter a expression: \n");
  char exp[EXPRESSION_MAX_LEN];
  scanf("%f", exp);
  int result;
  result = evaluatePostfixExpression(exp);
  printf("The final result is %d \n",result);
}

	
int addition (int x, int y){
  return x + y;
}
int subtraction(int x, int y){
  return y - x;
}
int division (int x, int y){
  return y / x;
}
int multiplication (int x, int y){
  return x*y;
}
int exponetiation (int x, int y){
  int i, result = 1;
  for (i=0;i<x;i++){
    result *=y;
  }
  return result;
}
int remain (int x, int y){
  return y % x ;
}
  
