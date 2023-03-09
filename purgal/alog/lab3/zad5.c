#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>

bool is_inside_circle(int x, int y) {
	return sqrt(x*x + y*y) <= 50.0;
}

int main(int argc, char *argv[]) {
	srand(time(NULL));
	
	float p = 0.0f;
	int n = rand() % 15000;
		
	int points[n][n];
	
	for (int i = 0; i < n; i++) {
		int x = rand() % 101 - 50;
		int y = rand() % 101 - 50;
		
		points[i][0] = x;
		points[i][1] = y;
	}
	
	for (int i = 0; i < n; i++) {
		printf("(%d, %d), \n", points[i][0], points[i][1]);
	}
	
	int s1 = n, s2 = 0;
	
	for (int i = 0; i < n; i++) {
		if (is_inside_circle(points[i][0], points[i][1])) {
			s2 += 1;
		}		
	} 
	
	printf("Wynik: %d", 4 * s2 * s1 - 1);
	
	return 0;
}