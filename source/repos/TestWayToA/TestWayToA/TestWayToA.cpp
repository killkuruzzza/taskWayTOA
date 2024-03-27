
#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>

using namespace std;

int main() {
    int t;
    cin >> t;
    //Цикл для перебора наборов данных
    while (t--) {
        int n, k;
        cin >> n >> k;
        string s;
        cin >> s;
        //Нулевой массив на n элементов. 
        vector<int> binWhite(n, 0);
        for (int i = 0; i < n; i++) {
            //В массиве binWhite отмечаем 1 белую клетку  
            binWhite[i] = (s[i] == 'W' ? 1 : 0);
        }
        // Переменная для минимального перекрашивания клеток. Изначально предполагаем что нужно перекрасить всю строку
        int minRecolor = s.length();
        // Цикл для перебора всех подпоследовательностей
        for (int i = 0; i + k - 1 < n; i++) {
            // Считаем белые клетки, начиная с текущего элемента и на k элементов вперёд
            int ans = accumulate(binWhite.begin() + i, binWhite.begin() + i + k, 0);
            // Сравниваем наше значение с минимальным количеством перекрашиваний
            if(minRecolor > ans)
            minRecolor = ans;
        }
        cout << minRecolor << endl;
           
    }

    return 0;
}
