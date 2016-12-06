# Sock Merchant

John's clothing store has a pile of `n` loose socks where each sock `i` is labeled with an integer, `ci`, denoting its color. He wants to sell as many socks as possible, but his customers will only buy them in matching pairs. Two socks, `i` and `j`, are a single matching pair if `ci = cj`.

Given `n` and the color of each sock, how many pairs of socks can John sell?

Input Format

The first line contains an integer, `n`, denoting the number of socks. 
The second line contains `n` space-separated integers describing the respective values of `c0, c1, c2, ..., c_n-1`.

### Constraints

- `1 <= n <= 100`
- `1 <= ci <= 100`

### Output Format

Print the total number of _matching pairs_ of socks that John can sell.

### Sample Input

    9
    10 20 20 10 10 30 50 10 20

### Sample Output

    3

### Explanation

![](https://s3.amazonaws.com/hr-challenge-images/25168/1474122392-c7b9097430-sock.png)

As you can see from the figure above, we can match three pairs of socks. Thus, we print `3` on a new line.