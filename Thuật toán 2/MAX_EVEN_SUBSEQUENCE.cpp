
#include <bits/stdc++.h>
using namespace std;
const long long N = 1000005;
long long n;
long long a[N];
long long SC[N];
long long SL[N];
bool BC[N];
bool BL[N];
void input()
{
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        cin >> a[i];
        BC[i] = false;
        BL[i] = false;
    }
}

void solve()
{
    for (int i = 1; i <= n; i++)
    {
        if (a[i] % 2 == 0)
        {
            SC[1] = a[i];
            BC[1] = true;
            break;
        }
        else
        {
            SL[1] = a[i];
            BL[1] = true;
            break;
        }
    }

    for (int i = 2; i <= n; i++)
    {
        if (a[i] % 2 == 0)
        { // a[i] la so chan
            if (BC[i - 1] == true && SC[i - 1] > 0)
                SC[i] = SC[i - 1] + a[i];
            else
                SC[i] = a[i];
            if (BL[i - 1] == true)
                SL[i] = SL[i - 1] + a[i];
            else
                BL[i] = false;
        }
        else
        { // a[i] la so le
            if (BC[i - 1] == true && SC[i - 1] > 0)
                SL[i] = SC[i - 1] + a[i];
            else
                SC[i] = a[i];
            if (BL[i - 1] == true)
                SC[i] = SL[i - 1] + a[i];
            else
                BL[i] = false;
        }
    }
    long long ans = -1e9;
    for (int i = 1; i <= n; i++)
    {
        ans = max(ans, SC[i]);
    }
    cout << ans;
}

int main()
{
    input();
    solve();

    return 0;
}