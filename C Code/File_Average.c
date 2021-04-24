#include <stdio.h>
#include <conio.h>
#include <unistd.h>
#include <limits.h>
#include <stdbool.h>

FILE *file = NULL;
int total;
double average;

bool A = true;

int read_file();
int write_file();

int main(void)
{
    while (A)
    {
        int err = 0;

        err = read_file();
        err = write_file();

        if (getch() == 113 || err == -1)
        {
            printf("Q key/error detected, stopping.");
            return 1;
        }
    }

    return 0;
}

//Working directory file is different than VSCode version; need to fix later down the line

int read_file(void)
{
    printf("reading numbers.txt\n");

    file = fopen("C:\\Users\\Hidden\\Desktop\\School code\\numbers.txt", "r");

    if (file == NULL)
    {
        puts("Error opening numbers.txt");
        return -1;
    }

    int i;
    int x = 0;

    while (fscanf(file, "%d", &i) == 1 && x < 10)
    {
        total += i;
        x++;
    }

    average = total / 10.0;

    printf("\nAverage is %5.2f\n", average);

    fclose(file);
    return 0;
}

int write_file()
{
    file = fopen("C:\\Users\\Hidden\\Desktop\\School code\\numbers.txt", "a");

    if (file != NULL)
    {
        fprintf(file, "\nAverage: %5.2f\n", average);
        fclose(file);
    }
    else
    {
        printf("Failed to open file for appending");
        return -1;
    }

    return 0;
}