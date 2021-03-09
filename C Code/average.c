#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int user_input();
void response();

int main(void)
{
    int total = 0;
    int count = 0;

    char str[10];

    bool loop = true;

    while(loop){
        user_input(str);
        

        if(str[0] == 'Q')
        {
            loop = false;
        }
        else
        {
            total += atoi(str);
            count++;
        }
    }

    response(total, count);
    
    return 0;
}

int user_input(char str[10])
{
    char input[10];

    printf("Please input a number: ");
    scanf("%s", str);

    return 0;
}

void response(int numbers, int amount)
{
    double average = (double) numbers / (double) amount;
    printf("Your average is %.2f", average);
}