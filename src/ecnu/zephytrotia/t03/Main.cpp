#include <algorithm>
#include <iostream>
#include <string>
using namespace std;

const int N = 100010;
string arr[N];

bool cmp(string a, string b) {
    return (a + b).compare(b + a) > 0;
}

int main() {
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    sort(arr, arr + n, cmp);
    for (int i = 0; i < n; i++) {
        cout << arr[i];
    }
    return 0;
}