# 4.04 Lists
# Purpose: learning how to use lists
# 
# Author@ Shawn Velsor
# Date: 1/8/2021

electronics = ["computer", "cellphone", "laptop", "headphones"]
mutualItem = False

print("Hello, these are the items I like:")
count = 1
for i in electronics:
    print(str(count) + ".", i)
    count += 1

print()

def main():
    item = input("What type of electronic device do you like? ").lower()

    for i in electronics:
        if(item == i):
            print("Same, I like " + item + " also.")
            mutualItem = True

    if(mutualItem == False):
        print("Oh, that's something I don't like...")
    

while True:
    main()