#include <stdio.h>

int user_input();
int Response(int age);

int main(void)
{
    int age;

    age = user_input();

    Response(age);
    
    return 0;
}

int user_input()
{
    int input;

    printf("Please input your age: ");
    scanf("%d", &input);

    return (input);
}

int Response(int age)
{

if (age < 18)
{
    printf("You are not allowed to vote.");
}
else if (age >= 18 && age < 21)
{
    printf("You are allowed to vote and goto war but not drink.");
}
else
{
    printf("You are allowed to vote and drink.");
}

return 0;
}