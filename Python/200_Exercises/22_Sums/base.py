number=int(input("Please enter a number: "))
total=0
for i in range(0, number):
    print(i, end="+")
    total += i
print(number)
print("the sum of 1 to", number, "is", total)