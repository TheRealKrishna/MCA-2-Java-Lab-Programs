#include <stdio.h>

int main() {
    int a = 1;
    printf("%d\t%d\n", 3 * a, a++);
    printf("%d", sizeof(void*) * 8);
    return 0;
}