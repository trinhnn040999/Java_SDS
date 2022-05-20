
#include <bits/stdc++.h>
using namespace std;
int n, a[1002];
int save[1002];
bool mark[1002];
int F[1002];
int start(int i)
{ // day con tang a[i]...
    if (mark[i])
        return save[i];
    int ans = 1;
    for (int j = i + 1; j <= n; j++)
        if (a[j] > a[i])
            ans = max(ans, 1 + start(j));
    save[i] = ans;
    mark[i] = true;
    return ans;
}

int main()
{
    cin >> n;
    for (int i = 1; i <= n; i++)
        cin >> a[i];
    int ans = 0;
    for (int i = 1; i <= n; i++)
        ans = max(ans, start(i));
    cout << ans << endl;

    // truy vet
    // Buoc 1: tim i sao cho Fi max
    int i = 1;
    for (int t = 1; t <= n; t++)
    {
        if (start(t) > start(i))
            i = t;
    }
    for (; true;)
    {
        // Buoc 2: in ra a[i]
        cout << a[i] << " ";

        // Buoc 3: neu start(i)==1 thi dung
        if (start(i) == 1)
            return 0;

        // buoc 4: Tim j co the noi vao sau i
        int j = 1;
        for (int t = 1; t <= n; t++)
        {
            if (t > i && a[t] > a[i] && start(t) + 1 == start(i))
                j = t;
        }
        // buoc 5: gan i=j. quay lai buoc 2
        i = j;
    }
    return 0;
}