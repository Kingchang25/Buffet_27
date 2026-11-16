tigo = int(input("Please enter line length: "))
line = input("Do you want a horizontal or vertical line?: ")
num=0

if line =="vertical" or line == "v":
    for i in range(tigo):
        print("*")
elif line == "horizontal" or line == "h":
    for i in range(tigo):
        print("*", end="")
else:
    print("what r u doing dawg")


