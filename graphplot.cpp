#include <stdio.h>
#include <math.h>
#include <graphics.h>
#include <iostream>
#include <stdlib.h> 
#include <time.h>
#include <X11/Xlib.h>

using namespace std;

int main() 
{
    
     int gd = DETECT, gm;
     initgraph(&gd, &gm, NULL);
     int x1=100,y1=200,x2=100,y2=300;
     int iSecret,c1=0,c2=0,c3=0,c4=0,c5=0,c6=0;
    char c;
    int j;
     srand (time(NULL));
     cout<<"Enter the no.\n" ;

     cin>>j;
     
         line(50,50,50,300);
         line(50,300,300,300);
    
    while(j--)
     {
        
        
        iSecret = rand() % 6 + 1;
        cout<<"Random no::"<<iSecret;
        cout<<"\n";
        if(iSecret==1)
        {
            c1++;
        }
        else if(iSecret==2)
        {
            c2++;
        }
        else if(iSecret==3)
        {
                c3++;
        }
        else if(iSecret==4)
        {
                c4++;
        }
        else if(iSecret==5)
        {
                c5++;
        }
        else if(iSecret==6)
        {
                c6++;
        }
        if(c=='e')
            break;
    }
        
    cout<<c1;
    
    delay(10);

    getch();
    closegraph();
   return 0; 

}