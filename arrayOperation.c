#include<stdio.h>
#include<stdlib.h>

int array[100];

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
        
        

         for(i=l-1;i>=0;i--){
                 array[i+1]=array[i];
         }
          array[0] = n;
          printf("element inserted to begining of array");


}

void insertend(int array[],int l){

         int n,i;
        printf("enter the no to be inserted:");
        scanf("%d",&n);

        array[l] = n;
        
        }

void insertpos(int arr[],int l){
        int pos,n,i;
        printf("enter the position: ");
        scanf("%d",&pos);
        printf("enter the value: ");
        scanf("%d",&n);
        for( i=l-1;i<=pos-1;i--){
                array[i+1]=array[i];
        }
        array[pos-1]=n;

}

void delete(int array[],int l){
        int i,pos,value;
         printf("enter the position: ");
          scanf("%d",&pos);
        value = array[pos-1];

           if(pos>=l+1)
            printf("not possible\n");
           else{
               for( i=pos-1;i<l-1;i++){
                  array[i]=array[i+1];
            }
            printf(" deleted value is %d",value);

          }
      }   





int main(){
    
    int limit,i,ch,l;
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
       printf("3: Insert End\n");
       printf("4: Insert Pos\n");
       printf("5: Delete element\n"); 
       printf("6: Exit\n");
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
       case 3: l=arrLength(array);
               insertend(array,l);
               break;  
       case 4: l = arrLength(array); 
               insertpos(array,l);
               break;  
       case 5 : l = arrLength(array);
                 delete(array,l);



       case 6: exit(0) ;
               break;         
       default:
           break;
       }

  } while (1);

  return 0;
}

   
   
   
   
   
   
   
   
   
   
   
   
   
  
