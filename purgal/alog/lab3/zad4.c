#include <stdio.h>
#include <stdlib.h>

int main(int argc, char *argv[]) {
	int tab[] = {1, 2, 3};
	int s = 0;
	
	for (int a = 0; a < 3; a++) {
		for (int b = 0; b < 3; b++) {			
			s += tab[a] * 10 + tab[b];
		}
	}
	
	printf("Suma: %d\n", s);
	
	return 0;
}