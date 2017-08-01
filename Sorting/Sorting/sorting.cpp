#include <stdio.h>
#include <string.h>
#define MAX_SIZE 10

void sort(int arr[], int n) {
	int least;
	int i, j, temp;
	for (i = 0; i < 9; i++) {
		least = i;

		for (j = i + 1; j < 10; j++) {
			if (arr[least] > arr[j]) {
				least = j;
			}
		}
		if (i != least) { //자기 자신과의 교환을 중지
			temp = arr[i];
			arr[i] = arr[least];
			arr[least] = temp;
		
		}
	}
}

void insert_sort(int list[] , int n) {
	int i, j, key;
	for (i = 1; i < n; i++) {
		key = list[i];
		for (j = i-1;j>=0 && list[j]> key;j--) {
			list[j + 1] = list[j];
		}
		list[j + 1] = key;
	}
}
void bubble_sort(int list[], int n) {
	int i, j, temp;
	for (i = n - 1; i > 0; i--) { //n-1번
		for (j = 0; j < i; j++) {
			if (list[j] > list[j+1]) {
				temp = list[j+1];
				list[j + 1] = list[j];
				list[j] = temp;
			}
		}
	}
}
void main() {
	int arr[MAX_SIZE] = { 5,2,1,23,75,45,34,23,22,26};
	int n = MAX_SIZE;
	
	//sort(arr, n);
	//insert_sort(arr, n);
	bubble_sort(arr, n);
	for (int i = 0; i < 10; i++) {
		printf("%d\n",arr[i]);
	}
}