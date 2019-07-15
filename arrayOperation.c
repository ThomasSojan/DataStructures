#include<stdio.h>
#include<stdlib.h>

int arrLength(int array[])
{
    int length = 0;
    while(array[length] != NULL)
    {  
        
        length++;
    }
   
    return length;
}


void display(int array[],int l){
        int i;
        printf("\n");
        for (i=0;i<l;i++){
        
        printf("%d\n",array[i]);
                
        }
        
}


void insertBeg(int array[],int l){
        int n,i;
        printf("enter the no to be inserted:");
        scanf("%d",&n);
        
        

         for(i=l-1;i>0;i--){
                 array[i+1]=array[i];
         }
          array[0] = n;
          printf("element inserted to begining of array");


}









int main(int argc, char *argv[]){
    
    int array[100],limit,i,ch,l;
    //int *array

    printf("Enter the limit: ");
    scanf("%d",&limit);
   // array = (int*)malloc(limit * sizeof(int)); 

    printf("\nenter the values:\n");

    for ( i = 0; i < limit; i++)
    {
        scanf("%d",&array[i]);
 
    }
    printf("array created...\n");

   
   do
   {
       printf("\n*****MENU*****\n");
       printf("\n1: Display Array\n");
       printf("2: Insert Beg\n");
     /*  printf("3: Insert End\n");
       printf("4: Insert Pos\n"); */
       printf("5: Exit\n");
       printf("Enter your choice: ");
        scanf("%d",&ch); 
       switch (ch)
       {
       case 1: l=arrLength(array);
               display(array,l);
               break;
        case 2:l=arrLength(array);
               insertBeg(array,l);
               break;
     /*  case 3: insertend();
               break;  
       case 4: insertpos();
               break; */ 
       case 5: exit(0) ;
               break;         
       default:
           break;
       }

  } while (1);

  return 0;
}


   
   
   
   
   
   
   
   
   
   
   
   
   
  