#include <stdio.h>
#include <unistd.h>
#include <limits.h>

FILE *file = NULL;
int total;
double average;

int key = 113;

void read_file();
void write_file();

int main(void)
{
    key = _getch();

    while (key != 113)
    {
        read_file();
        write_file();
    }

    return 0;
}

void read_file()
{
    printf("reading numbers.txt\n");

    //Working directory file is different than VSCode version; need to fix later down the line

    file = fopen("C:\\Users\\Hidden\\Desktop\\School code\\numbers.txt", "r+");

    if (file == NULL)
    {
        puts("Error opening numbers.txt");
        return -1;
    }

    int i;

    while (fscanf(file, "%d", &i) == 1)
    {
        total += i;
    }
}

void write_file()
{
    average = total / 10;
    for(int i = 0; i < average -> cnt; i++){
        
    }
    fprintf(file, average -> a[i]);
}