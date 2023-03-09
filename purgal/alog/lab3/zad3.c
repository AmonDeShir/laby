#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main(int argc, char *argv[]) {
	srand(time(NULL));
	
	int n;

	printf("Podaj n: ");
	while (scanf("%d", &n) != 1) {
		printf("Podaj n: ");
	}
	
	int tab[n][n];
	
	for (int x = 0; x < n; x++) {
		for (int y = 0; y < n; y++) {
			tab[x][y] = rand() % 9 + 1;
		}
	}
	
	for (int x = 0; x < n; x++) {
		printf("[");
		for (int y = 0; y < n; y++) {
			printf("%d, ", tab[x][y]);
		}
		printf("],\n");
	}
	
	float suma = 0;
	float len = 0;
	
	for (int x = 0; x < n; x++) {
		for (int y = 0; y < n; y++) {
			if (tab[x][y] % 2 == 0) {
				suma += tab[x][y];
				len += 1;
			}
		}
	}
	
	printf("\nWynik: %f\n", suma / len);
	
	return 0;
}