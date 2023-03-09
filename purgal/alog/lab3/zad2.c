#include <stdio.h>
#include <stdlib.h>


int main(int argc, char *argv[]) {
	int n, x;
		
	printf("Podaj n: ");
	while (scanf("%d", &n) != 1) {
		printf("Podaj n: ");
	}
	
	printf("Podaj x: ");
	while (scanf("%d", &x) != 1) {
		printf("Podaj x: ");
	}
	
	int* a = malloc(n+1 * sizeof a);
	
	for (int i = 0; i <= n; i++) {
		printf("Podaj a[%d]: ", i);
		
		while (scanf("%d", &a[i]) != 1) {
			printf("Podaj a[%d]: ", i);
		}

	}
	
	for (int i = 0; i <= n; i++) {
		printf("a: %d, ", a[i]);
	}
	
	int y = a[n];
	
	for (int i = n-1; i >= 0; i--) {
		y = y * x + a[i];
	}
	
	printf("wynik: %d", y);
	
	free(a);
	
	return 0;
}