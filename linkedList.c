#include<stdio.h>
#include<stdlib.h>


struct node{
    int data;
    struct node *next
} ;

typedef struct node NODE;
int count=0;



NODE *start = NULL;


void insert_beg(){
    int n;
    
    printf("\nenter the value : ");
    scanf("%d",&n);
    NODE *newnode;
    newnode = (NODE*)malloc(sizeof(NODE));
    count++;
     if (start == NULL) {
      start = newnode;
      start->data = n;
      start->next = NULL;
      
   }

   else
   {
       newnode->data = n;
   newnode->next = start;
   start = newnode;
   }
   
   printf("\nnode inserted....\n\n\n");
}


void insert_end(){
     
     int n;
    
    printf("\nenter the value : ");
    scanf("%d",&n);
    NODE *newnode,*temp;
    newnode = (NODE*)malloc(sizeof(NODE));
    count++;

     if (start == NULL) {
      start = newnode;
      start->data = n;
      start->next = NULL;
      
   }

   else {
   
       temp = start;

       while(temp->next != NULL)
         temp = temp->next;

       temp->next = newnode;
       newnode->data = n;
       newnode->next = NULL;  
       
   }    

      printf("\nnode inserted....\n\n\n");
 

   }
void traverse(){

    NODE *temp;

    if (start==NULL){
        printf("Linked list is Empty\n");
    }
    

    temp = start;
    while(temp->next != NULL){
        printf("%d-->",temp->data);
        temp = temp->next;
    }
printf("\n");
     

}
void delete_beg() {
   NODE *temp;
   int n;
   
   if (start == NULL) {
      printf("Linked list is already empty.\n");
      return;
   }
   
   n = start->data;
   temp = start->next;
   free(start);
   start = temp;
   count--;
   
   printf("%d deleted from beginning successfully.\n\n\n", n);
}

void delete_end() {
   struct node *temp, *previous;
   int n;
     
   if (start == NULL) {
      printf("Linked list is already empty.\n");
      return;
   }
   
   count--;
   
   if (start->next == NULL) {
      n = start->data;
      free(start);
      start = NULL;
      printf("%d deleted from end successfully.\n", n);
      return;
   }
   
   temp = start;
   
   while (temp->next != NULL) {
      previous = temp;
      temp = temp->next;
   }
   
   n = temp->data;
   previous->next = NULL;
   free(temp);
   
   printf("%d deleted from end successfully.\n\n\n", n);
}



void main(){
    
  
  do{
      printf("1:Insert Begining\n");
      printf("2:insert End\n");
      printf("3:Traverse\n");
      printf("4:Delete begining\n");
      printf("5:Delete end\n");


      printf("6:Exit\n\n");
      printf("\n\nenter your choice : ");

      int ch;
      scanf("%d",&ch);

      switch (ch)
      {
      case 1 : insert_beg();
               break;
      case 2 : insert_end();
               break;   
      case 3 : traverse();
               break;
      case 4 : delete_beg();
               break;
      case 5 : delete_end();
               break;                                  
      default:printf("Invalid Choice\n");
          break;
      }
      
      
  } while(1);
}