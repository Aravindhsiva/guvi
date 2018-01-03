#include <iostream>
using namespace std;

int main()
{
    char c;
    int a,b;
    cin >> c;
    a = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    b = (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    if (a || b)
        cout <<"Vowel";
    else
        cout <<"Consonant";

    return 0;
}