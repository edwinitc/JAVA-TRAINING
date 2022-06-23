num = int(input("enter a number : "))
s = 0
assign = num
while assign > 0:
    div = assign % 10
    s = s + div * div * div;
    assign = assign // 10


if num == s :
    print(num,"is an armstrong number")
else :
    print(num,"is not an armstrong number")