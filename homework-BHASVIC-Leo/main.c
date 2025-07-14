#include <stdbool.h>
#include <stdio.h>

int main(void) {
    int num;
    int prime;
    printf("What number do you want to see up to:");
    scanf("%d", &num);
    for (int i = 1; i < num; i++) {
        prime = 1;
        if (i == 0 || i == 1){
            prime = 0;
        }
        if(i == 2) {
            prime = 1;
        }
        for (int x = 2; x < i; x++) {
            if (i % x == 0) {
                prime = 0;
                break;
            }
        }
        if (prime != 0) {
            printf("%d,", i);
        }
    }
}