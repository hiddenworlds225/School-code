#include <stdio.h>
#include <conio.h>
#include <math.h>

#define SIZE 10
int arr[SIZE];

void get_nums()
{

    for (int i = 0; i < SIZE; i++)
    {
        int x;
        printf("Input Number: ");
        scanf("%d", &x);
        arr[i] = x;
    }
}

// This uses the insertion sort algorithm.
void Sort(int arr[], int n)
{
    int i, key, j;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;

        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}

void out_sort(int arr[], int n)
{
    FILE *file = fopen("C:\\Users\\Hidden\\Desktop\\School code\\numbers.txt", "a");

    int i;
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
        fprintf(file, "%d\n", arr[i]);
    }

    printf("\n");
}

int main()
{
    printf("\nPress Q to quit, press any other key to continue.\n");

    while (getch() != 113)
    {
        get_nums();

        int n = sizeof(arr) / sizeof(arr[0]);

        Sort(arr, n);
        out_sort(arr, n);

        printf("\nPress Q to quit, press any other key to continue.\n");
    }

    return 0;
}
