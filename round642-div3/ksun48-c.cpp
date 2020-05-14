// Codeforces Round 643 Problem C Board Moves
// https://codeforces.com/contest/1353/problem/C
//
// Formula to count number of moves of all cells
// to the center cell.
//
#include <bits/stdc++.h>
using namespace std;

void solve(){
	using ll = long long;
	ll n;
	cin >> n;
	cout << (n*n*n-n)/3 << '\n';

}
int main(){
	ios_base::sync_with_stdio(false), cin.tie(nullptr);
	int T;
	cin >> T;
	while(T--) solve();
}
