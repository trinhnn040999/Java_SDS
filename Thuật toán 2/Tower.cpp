#include <bits/stdc++.h>
using namespace std;
#define N 1000
struct Block
{
    int x, y, z;
    bool operator<(Block &b)
    {
        return x < b.x && y < b.y;
    }
};
Block B[N];
int S[N]; // S[i] la chieu cao MAX cua Tower co the xay dung duoc
// bang cach su dung cac block tu B[0], B[1]...B[i] va bat buoc su dung B[i]

bool cmp(Block &b1, Block &b2)
{
    if (b1.x != b2.x)
        return b1.x > b2.x;
    if (b1.y != b2.y)
        return b1.y > b2.y;
    return b1.z > b2.z;
}

void solve()
{
    int t = 0;
    while (true)
    {
        t++;
        int n;
        cin >> n;
        if (n == 0)
            break;
        int m = -1;
        int a[3];
        for (int i = 1; i <= n; i++)
        {
            cin >> a[0] >> a[1] >> a[2];
            sort(a, a + 3);
            do
            {
                m += 1;
                B[m].x = a[0];
                B[m].y = a[1];
                B[m].z = a[2];
            }
            while(next_permutation(a, a + 3));
        }
        sort(B, B + m + 1, cmp);
        S[0] = B[0].z;
        int ans = S[0]; //ket qua cuoi cung cua bai toan
        for (int i = 1; i <= m; i++)
        {
            // tinh S[i]
            S[i] = B[i].z;
            for (int j = 0; j <= i - 1; j++)
                if (B[i] < B[j])
                {
                    S[i] = max(S[i], S[j] + B[i].z);
                }
            ans = max(ans, S[i]);
        }
         cout << "Case " << t << ": maximum height = " << ans << endl;
    }
   
}
int main()
{
    solve();
}